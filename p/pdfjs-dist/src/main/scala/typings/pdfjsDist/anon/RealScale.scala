package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealScale extends StObject {
  
  var realScale: Double
  
  var rotation: Double
}
object RealScale {
  
  inline def apply(realScale: Double, rotation: Double): RealScale = {
    val __obj = js.Dynamic.literal(realScale = realScale.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealScale] (val x: Self) extends AnyVal {
    
    inline def setRealScale(value: Double): Self = StObject.set(x, "realScale", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
