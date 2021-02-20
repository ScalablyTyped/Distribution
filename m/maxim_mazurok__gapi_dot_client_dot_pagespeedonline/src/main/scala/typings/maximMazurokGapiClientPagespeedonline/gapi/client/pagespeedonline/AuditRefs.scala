package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditRefs extends StObject {
  
  /** The category group that the audit belongs to (optional). */
  var group: js.UndefOr[String] = js.native
  
  /** The audit ref id. */
  var id: js.UndefOr[String] = js.native
  
  /** The weight this audit's score has on the overall category score. */
  var weight: js.UndefOr[Double] = js.native
}
object AuditRefs {
  
  @scala.inline
  def apply(): AuditRefs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditRefs]
  }
  
  @scala.inline
  implicit class AuditRefsMutableBuilder[Self <: AuditRefs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
