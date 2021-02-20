package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MajorAxis extends StObject {
  
  var majorAxis: js.Object = js.native
  
  var minorAxis: js.Object = js.native
}
object MajorAxis {
  
  @scala.inline
  def apply(majorAxis: js.Object, minorAxis: js.Object): MajorAxis = {
    val __obj = js.Dynamic.literal(majorAxis = majorAxis.asInstanceOf[js.Any], minorAxis = minorAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorAxis]
  }
  
  @scala.inline
  implicit class MajorAxisMutableBuilder[Self <: MajorAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajorAxis(value: js.Object): Self = StObject.set(x, "majorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorAxis(value: js.Object): Self = StObject.set(x, "minorAxis", value.asInstanceOf[js.Any])
  }
}
