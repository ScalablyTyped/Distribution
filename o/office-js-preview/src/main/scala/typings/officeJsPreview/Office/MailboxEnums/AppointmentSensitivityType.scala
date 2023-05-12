package typings.officeJsPreview.Office.MailboxEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentSensitivityType extends StObject
/**
  * Specifies the {@link Office.Sensitivity | sensitivity level} of an appointment.
  *
  * @remarks
  * [Api set: Mailbox preview]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  *
  * @beta
  */
@JSGlobal("Office.MailboxEnums.AppointmentSensitivityType")
@js.native
object AppointmentSensitivityType extends StObject {
  
  /**
    * Treat the item as confidential.
    *
    * @remarks
    * [Api set: Mailbox preview]
    */
  @js.native
  sealed trait Confidential
    extends StObject
       with AppointmentSensitivityType
  
  /**
    * The item needs no special treatment.
    *
    * @remarks
    * [Api set: Mailbox preview]
    */
  @js.native
  sealed trait Normal
    extends StObject
       with AppointmentSensitivityType
  
  /**
    * Treat the item as personal.
    *
    * @remarks
    * [Api set: Mailbox preview]
    */
  @js.native
  sealed trait Personal
    extends StObject
       with AppointmentSensitivityType
  
  /**
    * Treat the item as private.
    *
    * @remarks
    * [Api set: Mailbox preview]
    */
  @js.native
  sealed trait Private
    extends StObject
       with AppointmentSensitivityType
}
