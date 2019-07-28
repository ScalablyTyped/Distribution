package typings.musicmatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apikey extends js.Object {
  var apikey: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
}

object Anon_Apikey {
  @scala.inline
  def apply(apikey: String = null, format: String = null): Anon_Apikey = {
    val __obj = js.Dynamic.literal()
    if (apikey != null) __obj.updateDynamic("apikey")(apikey)
    if (format != null) __obj.updateDynamic("format")(format)
    __obj.asInstanceOf[Anon_Apikey]
  }
}

