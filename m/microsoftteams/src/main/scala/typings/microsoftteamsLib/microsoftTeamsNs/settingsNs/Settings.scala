package typings
package microsoftteamsLib.microsoftTeamsNs.settingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Sets the URL to use for the content of this instance.
    */
  var contentUrl: java.lang.String
  /**
    * The developer-defined unique ID for the entity to which this content points.
    */
  var entityId: java.lang.String
  /**
    * Sets the URL for the removal configuration experience.
    */
  var removeUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A suggested display name for the new content.
    * In the settings for an existing instance being updated, this call has no effect.
    */
  var suggestedDisplayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the URL to use for the external link to view the underlying resource in a browser.
    */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

