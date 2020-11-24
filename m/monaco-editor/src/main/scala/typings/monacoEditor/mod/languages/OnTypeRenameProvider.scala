package typings.monacoEditor.mod.languages

import typings.monacoEditor.anon.Ranges
import typings.monacoEditor.mod.CancellationToken
import typings.monacoEditor.mod.Position
import typings.monacoEditor.mod.editor.ITextModel
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnTypeRenameProvider extends js.Object {
  
  /**
    * Provide a list of ranges that can be live-renamed together.
    */
  def provideOnTypeRenameRanges(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Ranges] = js.native
  
  var wordPattern: js.UndefOr[RegExp] = js.native
}
object OnTypeRenameProvider {
  
  @scala.inline
  def apply(provideOnTypeRenameRanges: (ITextModel, Position, CancellationToken) => ProviderResult[Ranges]): OnTypeRenameProvider = {
    val __obj = js.Dynamic.literal(provideOnTypeRenameRanges = js.Any.fromFunction3(provideOnTypeRenameRanges))
    __obj.asInstanceOf[OnTypeRenameProvider]
  }
  
  @scala.inline
  implicit class OnTypeRenameProviderOps[Self <: OnTypeRenameProvider] (val x: Self) extends AnyVal {
    
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
    def setProvideOnTypeRenameRanges(value: (ITextModel, Position, CancellationToken) => ProviderResult[Ranges]): Self = this.set("provideOnTypeRenameRanges", js.Any.fromFunction3(value))
    
    @scala.inline
    def setWordPattern(value: RegExp): Self = this.set("wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordPattern: Self = this.set("wordPattern", js.undefined)
  }
}
