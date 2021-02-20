package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatientId extends StObject {
  
  /** ID type. For example, MRN or NHS. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The patient's unique identifier. */
  var value: js.UndefOr[String] = js.native
}
object PatientId {
  
  @scala.inline
  def apply(): PatientId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatientId]
  }
  
  @scala.inline
  implicit class PatientIdMutableBuilder[Self <: PatientId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
