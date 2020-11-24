package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `shapeGroup.toJSON()`. */
@js.native
trait ShapeGroupData extends js.Object {
  
  /**
    *
    * Specifies the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Returns the collection of Shape objects.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.native
}
object ShapeGroupData {
  
  @scala.inline
  def apply(): ShapeGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeGroupData]
  }
  
  @scala.inline
  implicit class ShapeGroupDataOps[Self <: ShapeGroupData] (val x: Self) extends AnyVal {
    
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
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: ShapeData*): Self = this.set("shapes", js.Array(value :_*))
    
    @scala.inline
    def setShapes(value: js.Array[ShapeData]): Self = this.set("shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
  }
}
