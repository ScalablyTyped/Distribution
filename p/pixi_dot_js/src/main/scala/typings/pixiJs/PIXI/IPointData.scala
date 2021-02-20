package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common interface for points. Both Point and ObservablePoint implement it
  * @memberof PIXI
  * @interface IPointData
  */
@js.native
trait IPointData extends StObject {
  
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
  implicit class IPointDataMutableBuilder[Self <: IPointData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
