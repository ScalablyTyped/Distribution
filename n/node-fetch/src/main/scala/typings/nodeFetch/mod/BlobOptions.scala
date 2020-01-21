package typings.nodeFetch.mod

import typings.nodeFetch.nodeFetchStrings.native
import typings.nodeFetch.nodeFetchStrings.transparent
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
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlobOptions]
  }
}

