package typings.nivoBullet.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulletTooltipProps extends StObject {
  
  var color: String
  
  var v0: Double
  
  var v1: js.UndefOr[Double] = js.undefined
}
object BulletTooltipProps {
  
  inline def apply(color: String, v0: Double): BulletTooltipProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], v0 = v0.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletTooltipProps]
  }
  
  extension [Self <: BulletTooltipProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setV0(value: Double): Self = StObject.set(x, "v0", value.asInstanceOf[js.Any])
    
    inline def setV1(value: Double): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
    
    inline def setV1Undefined: Self = StObject.set(x, "v1", js.undefined)
  }
}
