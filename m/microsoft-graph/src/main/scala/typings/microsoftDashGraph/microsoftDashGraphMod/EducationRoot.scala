package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EducationRoot extends Entity {
  // Read-only. Nullable.
  var classes: js.UndefOr[js.Array[EducationClass]] = js.undefined
  // Read-only. Nullable.
  var me: js.UndefOr[EducationUser] = js.undefined
  // Read-only. Nullable.
  var schools: js.UndefOr[js.Array[EducationSchool]] = js.undefined
  // Read-only. Nullable.
  var users: js.UndefOr[js.Array[EducationUser]] = js.undefined
}

object EducationRoot {
  @scala.inline
  def apply(
    classes: js.Array[EducationClass] = null,
    id: String = null,
    me: EducationUser = null,
    schools: js.Array[EducationSchool] = null,
    users: js.Array[EducationUser] = null
  ): EducationRoot = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (id != null) __obj.updateDynamic("id")(id)
    if (me != null) __obj.updateDynamic("me")(me)
    if (schools != null) __obj.updateDynamic("schools")(schools)
    if (users != null) __obj.updateDynamic("users")(users)
    __obj.asInstanceOf[EducationRoot]
  }
}

