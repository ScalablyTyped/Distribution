package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkProvider extends js.Object {
  
  def provideLinks(model: ITextModel, token: CancellationToken): ProviderResult[ILinksList] = js.native
  
  var resolveLink: js.UndefOr[
    js.Function2[/* link */ ILink, /* token */ CancellationToken, ProviderResult[ILink]]
  ] = js.native
}
object LinkProvider {
  
  @scala.inline
  def apply(provideLinks: (ITextModel, CancellationToken) => ProviderResult[ILinksList]): LinkProvider = {
    val __obj = js.Dynamic.literal(provideLinks = js.Any.fromFunction2(provideLinks))
    __obj.asInstanceOf[LinkProvider]
  }
  
  @scala.inline
  implicit class LinkProviderOps[Self <: LinkProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvideLinks(value: (ITextModel, CancellationToken) => ProviderResult[ILinksList]): Self = this.set("provideLinks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveLink(value: (/* link */ ILink, /* token */ CancellationToken) => ProviderResult[ILink]): Self = this.set("resolveLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteResolveLink: Self = this.set("resolveLink", js.undefined)
  }
}
