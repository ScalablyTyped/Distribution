package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationStudent extends js.Object {
  // Birth date of the student.
  var birthDate: js.UndefOr[String] = js.undefined
  // ID of the student in the source system.
  var externalId: js.UndefOr[String] = js.undefined
  // The possible values are: female, male, other, unknownFutureValue.
  var gender: js.UndefOr[EducationGender] = js.undefined
  // Current grade level of the student.
  var grade: js.UndefOr[String] = js.undefined
  // Year the student is graduating from the school.
  var graduationYear: js.UndefOr[String] = js.undefined
  // Student Number.
  var studentNumber: js.UndefOr[String] = js.undefined
}

object EducationStudent {
  @scala.inline
  def apply(
    birthDate: String = null,
    externalId: String = null,
    gender: EducationGender = null,
    grade: String = null,
    graduationYear: String = null,
    studentNumber: String = null
  ): EducationStudent = {
    val __obj = js.Dynamic.literal()
    if (birthDate != null) __obj.updateDynamic("birthDate")(birthDate.asInstanceOf[js.Any])
    if (externalId != null) __obj.updateDynamic("externalId")(externalId.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (grade != null) __obj.updateDynamic("grade")(grade.asInstanceOf[js.Any])
    if (graduationYear != null) __obj.updateDynamic("graduationYear")(graduationYear.asInstanceOf[js.Any])
    if (studentNumber != null) __obj.updateDynamic("studentNumber")(studentNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[EducationStudent]
  }
}

