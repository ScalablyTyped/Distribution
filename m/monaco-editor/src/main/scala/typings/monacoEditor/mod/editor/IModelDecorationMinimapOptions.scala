package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelDecorationMinimapOptions extends IDecorationOptions {
  
  /**
    * The position in the overview ruler.
    */
  var position: MinimapPosition = js.native
}
object IModelDecorationMinimapOptions {
  
  @scala.inline
  def apply(position: MinimapPosition): IModelDecorationMinimapOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecorationMinimapOptions]
  }
  
  @scala.inline
  implicit class IModelDecorationMinimapOptionsOps[Self <: IModelDecorationMinimapOptions] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: MinimapPosition): Self = this.set("position", value.asInstanceOf[js.Any])
  }
}
