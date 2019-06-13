package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsTabConfiguration extends js.Object {
  /** Url used for rendering tab contents in Teams. Required. */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Identifier for the entity hosted by the tab provider. */
  var entityId: js.UndefOr[java.lang.String] = js.undefined
  /** Url called by Teams client when a Tab is removed using the Teams Client. */
  var removeUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Url for showing tab contents outside of Teams. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object TeamsTabConfiguration {
  @scala.inline
  def apply(
    contentUrl: java.lang.String = null,
    entityId: java.lang.String = null,
    removeUrl: java.lang.String = null,
    websiteUrl: java.lang.String = null
  ): TeamsTabConfiguration = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (entityId != null) __obj.updateDynamic("entityId")(entityId)
    if (removeUrl != null) __obj.updateDynamic("removeUrl")(removeUrl)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    __obj.asInstanceOf[TeamsTabConfiguration]
  }
}

