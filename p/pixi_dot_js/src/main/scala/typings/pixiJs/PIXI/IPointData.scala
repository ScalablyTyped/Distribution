package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common interface for points. Both Point and ObservablePoint implement it
  * @memberof PIXI
  * @interface IPointData
  */
@js.native
trait IPointData extends js.Object {
  
  /**
    * X coord
    * @memberof PIXI.IPointData#
    * @member {number} x
    */
  var x: Double = js.native
  
  /**
    * Y coord
    * @memberof PIXI.IPointData#
    * @member {number} y
    */
  var y: Double = js.native
}
object IPointData {
  
  @scala.inline
  def apply(x: Double, y: Double): IPointData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointData]
  }
  
  @scala.inline
  implicit class IPointDataOps[Self <: IPointData] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
