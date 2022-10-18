package typings.nivoBullet.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @nivo/bullet.@nivo/bullet/dist/types/types.Point & @nivo/core.@nivo/core.Dimensions & std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedRangeDatum, 'color'> */
trait BulletRectAnimatedProps extends StObject {
  
  var color: String
  
  var height: Double
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object BulletRectAnimatedProps {
  
  inline def apply(color: String, height: Double, width: Double, x: Double, y: Double): BulletRectAnimatedProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletRectAnimatedProps]
  }
  
  extension [Self <: BulletRectAnimatedProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
