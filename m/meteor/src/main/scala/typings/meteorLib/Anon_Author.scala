package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var website: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Author {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    description: java.lang.String = null,
    email: java.lang.String = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    version: java.lang.String = null,
    website: java.lang.String = null
  ): Anon_Author = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    if (website != null) __obj.updateDynamic("website")(website)
    __obj.asInstanceOf[Anon_Author]
  }
}

