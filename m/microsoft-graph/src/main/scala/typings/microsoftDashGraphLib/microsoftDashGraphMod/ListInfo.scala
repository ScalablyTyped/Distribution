package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInfo extends js.Object {
  /** If true, indicates that content types are enabled for this list. */
  var contentTypesEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, indicates that the list is not normally visible in the SharePoint user experience. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** An enumerated value that represents the base list template used in creating the list. Possible values include documentLibrary, genericList, task, survey, announcements, contacts, and more. */
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object ListInfo {
  @scala.inline
  def apply(
    contentTypesEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    template: java.lang.String = null
  ): ListInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentTypesEnabled)) __obj.updateDynamic("contentTypesEnabled")(contentTypesEnabled)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ListInfo]
  }
}

