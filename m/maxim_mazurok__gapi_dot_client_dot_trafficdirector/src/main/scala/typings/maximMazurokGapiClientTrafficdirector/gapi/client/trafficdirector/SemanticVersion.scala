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
  
  @scala.inline
  def apply(): SemanticVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemanticVersion]
  }
  
  @scala.inline
  implicit class SemanticVersionMutableBuilder[Self <: SemanticVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMajorNumber(value: Double): Self = StObject.set(x, "majorNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorNumberUndefined: Self = StObject.set(x, "majorNumber", js.undefined)
    
    @scala.inline
    def setMinorNumber(value: Double): Self = StObject.set(x, "minorNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorNumberUndefined: Self = StObject.set(x, "minorNumber", js.undefined)
    
    @scala.inline
    def setPatch(value: Double): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
  }
}
