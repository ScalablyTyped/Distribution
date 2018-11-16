package typings
package nodeDashPushnotificationsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Key extends js.Object {
  /**
                   * The filename of the provider token key (as supplied by Apple) to load from disk, or a
                   * Buffer/String containing the key data.
                   */
  var key: js.UndefOr[nodeLib.Buffer | java.lang.String] = js.undefined
  /** The ID of the key issued by Apple */
  var keyId: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the team associated with the provider token key */
  var teamId: js.UndefOr[java.lang.String] = js.undefined
}

