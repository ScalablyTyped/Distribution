package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobOptions extends js.Object {
  var endings: js.UndefOr[
    nodeDashFetchLib.nodeDashFetchLibStrings.transparent | nodeDashFetchLib.nodeDashFetchLibStrings.native
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BlobOptions {
  @scala.inline
  def apply(
    endings: nodeDashFetchLib.nodeDashFetchLibStrings.transparent | nodeDashFetchLib.nodeDashFetchLibStrings.native = null,
    `type`: java.lang.String = null
  ): BlobOptions = {
    val __obj = js.Dynamic.literal()
    if (endings != null) __obj.updateDynamic("endings")(endings.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlobOptions]
  }
}

