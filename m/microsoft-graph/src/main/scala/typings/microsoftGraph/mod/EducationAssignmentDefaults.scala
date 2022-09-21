package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationAssignmentDefaults
  extends StObject
     with Entity {
  
  /**
    * Optional field to control adding assignments to students' and teachers' calendars when the assignment is published. The
    * possible values are: none, studentsAndPublisher, studentsAndTeamOwners, unknownFutureValue, and studentsOnly. Note that
    * you must use the Prefer: include-unknown-enum-members request header to get the following value(s) in this evolvable
    * enum: studentsOnly. The default value is none.
    */
  var addToCalendarAction: js.UndefOr[NullableOption[EducationAddToCalendarOptions]] = js.undefined
  
  /**
    * Class-level default behavior for handling students who are added after the assignment is published. Possible values
    * are: none, assignIfOpen.
    */
  var addedStudentAction: js.UndefOr[NullableOption[EducationAddedStudentAction]] = js.undefined
  
  // Class-level default value for due time field. Default value is 23:59:00.
  var dueTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Default Teams channel to which notifications will be sent. Default value is null.
  var notificationChannelUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationAssignmentDefaults {
  
  inline def apply(): EducationAssignmentDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationAssignmentDefaults]
  }
  
  extension [Self <: EducationAssignmentDefaults](x: Self) {
    
    inline def setAddToCalendarAction(value: NullableOption[EducationAddToCalendarOptions]): Self = StObject.set(x, "addToCalendarAction", value.asInstanceOf[js.Any])
    
    inline def setAddToCalendarActionNull: Self = StObject.set(x, "addToCalendarAction", null)
    
    inline def setAddToCalendarActionUndefined: Self = StObject.set(x, "addToCalendarAction", js.undefined)
    
    inline def setAddedStudentAction(value: NullableOption[EducationAddedStudentAction]): Self = StObject.set(x, "addedStudentAction", value.asInstanceOf[js.Any])
    
    inline def setAddedStudentActionNull: Self = StObject.set(x, "addedStudentAction", null)
    
    inline def setAddedStudentActionUndefined: Self = StObject.set(x, "addedStudentAction", js.undefined)
    
    inline def setDueTime(value: NullableOption[String]): Self = StObject.set(x, "dueTime", value.asInstanceOf[js.Any])
    
    inline def setDueTimeNull: Self = StObject.set(x, "dueTime", null)
    
    inline def setDueTimeUndefined: Self = StObject.set(x, "dueTime", js.undefined)
    
    inline def setNotificationChannelUrl(value: NullableOption[String]): Self = StObject.set(x, "notificationChannelUrl", value.asInstanceOf[js.Any])
    
    inline def setNotificationChannelUrlNull: Self = StObject.set(x, "notificationChannelUrl", null)
    
    inline def setNotificationChannelUrlUndefined: Self = StObject.set(x, "notificationChannelUrl", js.undefined)
  }
}
