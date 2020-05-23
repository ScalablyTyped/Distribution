package typings.nightmare.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloads extends js.Object {
  var downloads: js.UndefOr[String] = js.undefined
}

object Downloads {
  @scala.inline
  def apply(downloads: String = null): Downloads = {
    val __obj = js.Dynamic.literal()
    if (downloads != null) __obj.updateDynamic("downloads")(downloads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloads]
  }
}

