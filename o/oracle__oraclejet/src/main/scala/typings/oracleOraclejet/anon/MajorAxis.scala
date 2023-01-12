package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MajorAxis extends StObject {
  
  var majorAxis: js.Object
  
  var minorAxis: js.Object
}
object MajorAxis {
  
  inline def apply(majorAxis: js.Object, minorAxis: js.Object): MajorAxis = {
    val __obj = js.Dynamic.literal(majorAxis = majorAxis.asInstanceOf[js.Any], minorAxis = minorAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MajorAxis] (val x: Self) extends AnyVal {
    
    inline def setMajorAxis(value: js.Object): Self = StObject.set(x, "majorAxis", value.asInstanceOf[js.Any])
    
    inline def setMinorAxis(value: js.Object): Self = StObject.set(x, "minorAxis", value.asInstanceOf[js.Any])
  }
}
