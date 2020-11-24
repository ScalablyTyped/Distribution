package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelDeltaDecoration extends js.Object {
  
  /**
    * Options associated with this decoration.
    */
  var options: IModelDecorationOptions = js.native
  
  /**
    * Range that this decoration covers.
    */
  var range: IRange = js.native
}
object IModelDeltaDecoration {
  
  @scala.inline
  def apply(options: IModelDecorationOptions, range: IRange): IModelDeltaDecoration = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDeltaDecoration]
  }
  
  @scala.inline
  implicit class IModelDeltaDecorationOps[Self <: IModelDeltaDecoration] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: IModelDecorationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: IRange): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
