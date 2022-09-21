package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<nats.nats/lib/nats-base-client/types.StreamInfoRequestOptions> */
trait PartialStreamInfoRequestO extends StObject {
  
  var deleted_details: js.UndefOr[Boolean] = js.undefined
  
  var subjects_filter: js.UndefOr[String] = js.undefined
}
object PartialStreamInfoRequestO {
  
  inline def apply(): PartialStreamInfoRequestO = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStreamInfoRequestO]
  }
  
  extension [Self <: PartialStreamInfoRequestO](x: Self) {
    
    inline def setDeleted_details(value: Boolean): Self = StObject.set(x, "deleted_details", value.asInstanceOf[js.Any])
    
    inline def setDeleted_detailsUndefined: Self = StObject.set(x, "deleted_details", js.undefined)
    
    inline def setSubjects_filter(value: String): Self = StObject.set(x, "subjects_filter", value.asInstanceOf[js.Any])
    
    inline def setSubjects_filterUndefined: Self = StObject.set(x, "subjects_filter", js.undefined)
  }
}
