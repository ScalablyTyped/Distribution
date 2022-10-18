package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The linked entity ID object represents a set of properties that describes a service and culture for locating this service defined value.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait LinkedEntityId extends StObject {
  
  /**
    * Represents which language culture was used to create this `CellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var culture: String
  
  /**
    * Represents a domain specific to a service used to create the `CellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var domainId: js.UndefOr[String] = js.undefined
  
  /**
    * Represents an identifier specific to a service used to create the `CellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var entityId: String
  
  /**
    * Represents which service was used to create the `CellValue`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var serviceId: Double
}
object LinkedEntityId {
  
  inline def apply(culture: String, entityId: String, serviceId: Double): LinkedEntityId = {
    val __obj = js.Dynamic.literal(culture = culture.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedEntityId]
  }
  
  extension [Self <: LinkedEntityId](x: Self) {
    
    inline def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
    
    inline def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: Double): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
