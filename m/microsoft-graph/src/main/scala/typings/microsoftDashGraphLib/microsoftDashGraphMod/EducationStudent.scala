package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationStudent extends js.Object {
  /** Birth date of the student. */
  var birthDate: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the student in the source system. */
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  /** The possible values are: female, male, other, unknownFutureValue. */
  var gender: js.UndefOr[EducationGender] = js.undefined
  /** Current grade level of the student. */
  var grade: js.UndefOr[java.lang.String] = js.undefined
  /** Year the student is graduating from the school. */
  var graduationYear: js.UndefOr[java.lang.String] = js.undefined
  /** Student Number. */
  var studentNumber: js.UndefOr[java.lang.String] = js.undefined
}

object EducationStudent {
  @scala.inline
  def apply(
    birthDate: java.lang.String = null,
    externalId: java.lang.String = null,
    gender: EducationGender = null,
    grade: java.lang.String = null,
    graduationYear: java.lang.String = null,
    studentNumber: java.lang.String = null
  ): EducationStudent = {
    val __obj = js.Dynamic.literal()
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (grade != null) __obj.updateDynamic("grade")(grade)
    if (graduationYear != null) __obj.updateDynamic("graduationYear")(graduationYear)
    if (studentNumber != null) __obj.updateDynamic("studentNumber")(studentNumber)
    __obj.asInstanceOf[EducationStudent]
  }
}

