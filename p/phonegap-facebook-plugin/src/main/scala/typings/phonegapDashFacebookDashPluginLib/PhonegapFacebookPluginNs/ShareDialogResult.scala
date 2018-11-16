package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The response object returned from a success callback for showDialog() of type 'share' or 'share_open_graph'.
     */

trait ShareDialogResult extends BaseDialogResult {
  /**
           * Only available if the user is logged into your app using Facebook and has granted publish_actions.
           * If present, this is the ID of the published Open Graph story.
           */
  var post_id: java.lang.String
}

