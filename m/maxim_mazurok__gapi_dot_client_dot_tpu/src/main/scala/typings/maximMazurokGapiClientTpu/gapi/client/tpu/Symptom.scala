package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symptom extends StObject {
  
  /** Timestamp when the Symptom is created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Detailed information of the current Symptom. */
  var details: js.UndefOr[String] = js.undefined
  
  /** Type of the Symptom. */
  var symptomType: js.UndefOr[String] = js.undefined
  
  /** A string used to uniquely distinguish a worker within a TPU node. */
  var workerId: js.UndefOr[String] = js.undefined
}
object Symptom {
  
  inline def apply(): Symptom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Symptom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Symptom] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setSymptomType(value: String): Self = StObject.set(x, "symptomType", value.asInstanceOf[js.Any])
    
    inline def setSymptomTypeUndefined: Self = StObject.set(x, "symptomType", js.undefined)
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
