package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemanticVersion extends StObject {
  
  var majorNumber: js.UndefOr[Double] = js.undefined
  
  var minorNumber: js.UndefOr[Double] = js.undefined
  
  var patch: js.UndefOr[Double] = js.undefined
}
object SemanticVersion {
  
  inline def apply(): SemanticVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SemanticVersion] (val x: Self) extends AnyVal {
    
    inline def setMajorNumber(value: Double): Self = StObject.set(x, "majorNumber", value.asInstanceOf[js.Any])
    
    inline def setMajorNumberUndefined: Self = StObject.set(x, "majorNumber", js.undefined)
    
    inline def setMinorNumber(value: Double): Self = StObject.set(x, "minorNumber", value.asInstanceOf[js.Any])
    
    inline def setMinorNumberUndefined: Self = StObject.set(x, "minorNumber", js.undefined)
    
    inline def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
  }
}
