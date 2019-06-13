package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationTeacher extends js.Object {
  /** ID of the teacher in the source system. */
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  /** Teacher number. */
  var teacherNumber: js.UndefOr[java.lang.String] = js.undefined
}

object EducationTeacher {
  @scala.inline
  def apply(externalId: java.lang.String = null, teacherNumber: java.lang.String = null): EducationTeacher = {
    val __obj = js.Dynamic.literal()
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (teacherNumber != null) __obj.updateDynamic("teacherNumber")(teacherNumber)
    __obj.asInstanceOf[EducationTeacher]
  }
}

