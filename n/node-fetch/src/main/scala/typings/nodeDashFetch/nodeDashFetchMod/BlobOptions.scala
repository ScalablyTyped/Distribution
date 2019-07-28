package typings.nodeDashFetch.nodeDashFetchMod

import typings.nodeDashFetch.nodeDashFetchStrings.native
import typings.nodeDashFetch.nodeDashFetchStrings.transparent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobOptions extends js.Object {
  var endings: js.UndefOr[transparent | native] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object BlobOptions {
  @scala.inline
  def apply(endings: transparent | native = null, `type`: String = null): BlobOptions = {
    val __obj = js.Dynamic.literal()
    if (endings != null) __obj.updateDynamic("endings")(endings.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlobOptions]
  }
}

