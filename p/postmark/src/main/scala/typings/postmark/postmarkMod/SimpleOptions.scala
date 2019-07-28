package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleOptions extends js.Object {
  var requestHost: String
  var ssl: Boolean
}

object SimpleOptions {
  @scala.inline
  def apply(requestHost: String, ssl: Boolean): SimpleOptions = {
    val __obj = js.Dynamic.literal(requestHost = requestHost, ssl = ssl)
  
    __obj.asInstanceOf[SimpleOptions]
  }
}

