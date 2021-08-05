package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Common interface for points. Both Point and ObservablePoint implement it
  * @memberof PIXI
  * @interface IPointData
  */
trait IPointData extends StObject {
  
  /**
    * X coord
    * @memberof PIXI.IPointData#
    * @member {number} x
    */
  var x: Double
  
  /**
    * Y coord
    * @memberof PIXI.IPointData#
    * @member {number} y
    */
  var y: Double
}
object IPointData {
  
  inline def apply(x: Double, y: Double): IPointData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointData]
  }
  
  extension [Self <: IPointData](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
