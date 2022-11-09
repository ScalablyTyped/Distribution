package typings.officeJs.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationType extends StObject
/**
  * Specifies an appointment location's type.
  *
  * @remarks
  * [Api set: Mailbox 1.8]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
@JSGlobal("Office.MailboxEnums.LocationType")
@js.native
object LocationType extends StObject {
  
  /**
    * A custom location. Custom locations don't have an SMTP address.
    * 
    * **Note**: {@link https://support.microsoft.com/office/88ff6c60-0a1d-4b54-8c9d-9e1a71bc3023 | Personal contact groups}
    * added as appointment locations aren't returned by the
    * {@link https://learn.microsoft.com/javascript/api/outlook/office.enhancedlocation#outlook-office-enhancedlocation-getasync-member(1) | EnhancedLocation.getAsync} method.
    */
  @js.native
  sealed trait Custom
    extends StObject
       with LocationType
  
  /**
    * A conference room or similar resource that has an SMTP address.
    */
  @js.native
  sealed trait Room
    extends StObject
       with LocationType
}
