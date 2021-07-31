package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkProvider extends StObject {
  
  def provideLinks(model: ITextModel, token: CancellationToken): ProviderResult[ILinksList]
  
  var resolveLink: js.UndefOr[
    js.Function2[/* link */ ILink, /* token */ CancellationToken, ProviderResult[ILink]]
  ] = js.undefined
}
object LinkProvider {
  
  @scala.inline
  def apply(provideLinks: (ITextModel, CancellationToken) => ProviderResult[ILinksList]): LinkProvider = {
    val __obj = js.Dynamic.literal(provideLinks = js.Any.fromFunction2(provideLinks))
    __obj.asInstanceOf[LinkProvider]
  }
  
  @scala.inline
  implicit class LinkProviderMutableBuilder[Self <: LinkProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideLinks(value: (ITextModel, CancellationToken) => ProviderResult[ILinksList]): Self = StObject.set(x, "provideLinks", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveLink(value: (/* link */ ILink, /* token */ CancellationToken) => ProviderResult[ILink]): Self = StObject.set(x, "resolveLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResolveLinkUndefined: Self = StObject.set(x, "resolveLink", js.undefined)
  }
}
