package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInfo extends js.Object {
  // If true, indicates that content types are enabled for this list.
  var contentTypesEnabled: js.UndefOr[Boolean] = js.undefined
  // If true, indicates that the list is not normally visible in the SharePoint user experience.
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * An enumerated value that represents the base list template used in creating the list. Possible values include
    * documentLibrary, genericList, task, survey, announcements, contacts, and more.
    */
  var template: js.UndefOr[String] = js.undefined
}

object ListInfo {
  @scala.inline
  def apply(
    contentTypesEnabled: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    template: String = null
  ): ListInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentTypesEnabled)) __obj.updateDynamic("contentTypesEnabled")(contentTypesEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInfo]
  }
}

