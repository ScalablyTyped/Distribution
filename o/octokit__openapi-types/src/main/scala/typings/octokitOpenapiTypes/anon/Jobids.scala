package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jobids extends StObject {
  
  var job_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var plan_id: js.UndefOr[String] = js.undefined
}
object Jobids {
  
  inline def apply(): Jobids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jobids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Jobids] (val x: Self) extends AnyVal {
    
    inline def setJob_ids(value: js.Array[String]): Self = StObject.set(x, "job_ids", value.asInstanceOf[js.Any])
    
    inline def setJob_idsUndefined: Self = StObject.set(x, "job_ids", js.undefined)
    
    inline def setJob_idsVarargs(value: String*): Self = StObject.set(x, "job_ids", js.Array(value*))
    
    inline def setPlan_id(value: String): Self = StObject.set(x, "plan_id", value.asInstanceOf[js.Any])
    
    inline def setPlan_idUndefined: Self = StObject.set(x, "plan_id", js.undefined)
  }
}
