package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.LocationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the ID of a location.
  * 
  * @remarks
  * [Api set: Mailbox 1.8]
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait LocationIdentifier extends StObject {
  
  /**
    * The location's unique ID.
    * 
    * For `Room` type, it's the room's email address.
    * 
    * For `Custom` type, it's the `displayName`.
    */
  var id: String
  
  /**
    * The location's type.
    */
  var `type`: LocationType | String
}
object LocationIdentifier {
  
  inline def apply(id: String, `type`: LocationType | String): LocationIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationIdentifier]
  }
  
  extension [Self <: LocationIdentifier](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: LocationType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
