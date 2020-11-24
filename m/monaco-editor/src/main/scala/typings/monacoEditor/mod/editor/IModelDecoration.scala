package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModelDecoration extends js.Object {
  
  /**
    * Identifier for a decoration.
    */
  val id: String = js.native
  
  /**
    * Options associated with this decoration.
    */
  val options: IModelDecorationOptions = js.native
  
  /**
    * Identifier for a decoration's owner.
    */
  val ownerId: Double = js.native
  
  /**
    * Range that this decoration covers.
    */
  val range: Range = js.native
}
object IModelDecoration {
  
  @scala.inline
  def apply(id: String, options: IModelDecorationOptions, ownerId: Double, range: Range): IModelDecoration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecoration]
  }
  
  @scala.inline
  implicit class IModelDecorationOps[Self <: IModelDecoration] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IModelDecorationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: Double): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
