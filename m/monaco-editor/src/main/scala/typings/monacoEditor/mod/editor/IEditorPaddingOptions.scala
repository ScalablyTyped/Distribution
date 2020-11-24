package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorPaddingOptions extends js.Object {
  
  /**
    * Spacing between bottom edge of editor and last line.
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * Spacing between top edge of editor and first line.
    */
  var top: js.UndefOr[Double] = js.native
}
object IEditorPaddingOptions {
  
  @scala.inline
  def apply(): IEditorPaddingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorPaddingOptions]
  }
  
  @scala.inline
  implicit class IEditorPaddingOptionsOps[Self <: IEditorPaddingOptions] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
}
