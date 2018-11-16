package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Search object contains info about the objects found in a user's
     * SkyDrive that match the search query. See Search query parameters for
     * info about formatting a search query request.
     */

trait ISearch extends js.Object {
  /**
           * An array of file and folder objects found in a user's SkyDrive that
           * match the search query.
           */
  var data: js.Array[IObject]
  /**
           * The path strings that reference the next and previous sets in a
           * paginated response.
           */
  var paging: js.UndefOr[microsoftDashLiveDashConnectLib.Anon_Next] = js.undefined
}

