package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationTeacher extends js.Object {
  // ID of the teacher in the source system.
  var externalId: js.UndefOr[String] = js.undefined
  // Teacher number.
  var teacherNumber: js.UndefOr[String] = js.undefined
}

object EducationTeacher {
  @scala.inline
  def apply(externalId: String = null, teacherNumber: String = null): EducationTeacher = {
    val __obj = js.Dynamic.literal()
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (teacherNumber != null) __obj.updateDynamic("teacherNumber")(teacherNumber)
    __obj.asInstanceOf[EducationTeacher]
  }
}

