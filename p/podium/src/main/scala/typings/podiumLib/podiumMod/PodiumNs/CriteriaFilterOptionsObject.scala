package typings
package podiumLib.podiumMod.PodiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CriteriaFilterOptionsObject extends js.Object {
  /** if true, all tags must be present for the event update to match the subscription. Defaults to false (at least one matching tag). */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /** a tag string or array of tag strings. */
  var tags: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

