package typings.musicmatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apikey extends js.Object {
  var apikey: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
}

object Apikey {
  @scala.inline
  def apply(apikey: String = null, format: String = null): Apikey = {
    val __obj = js.Dynamic.literal()
    if (apikey != null) __obj.updateDynamic("apikey")(apikey.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apikey]
  }
}

