package typings.nivoBullet.typesMod

import typings.nivoCore.mod.Dimensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulletRectComputedRect
  extends StObject
     with Point
     with Dimensions {
  
  var data: ComputedRangeDatum
}
object BulletRectComputedRect {
  
  inline def apply(data: ComputedRangeDatum, height: Double, width: Double, x: Double, y: Double): BulletRectComputedRect = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletRectComputedRect]
  }
  
  extension [Self <: BulletRectComputedRect](x: Self) {
    
    inline def setData(value: ComputedRangeDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
