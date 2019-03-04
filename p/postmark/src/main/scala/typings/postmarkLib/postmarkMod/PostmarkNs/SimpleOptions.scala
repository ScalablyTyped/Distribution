package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleOptions extends js.Object {
  var requestHost: java.lang.String
  var ssl: scala.Boolean
}

object SimpleOptions {
  @scala.inline
  def apply(requestHost: java.lang.String, ssl: scala.Boolean): SimpleOptions = {
    val __obj = js.Dynamic.literal(requestHost = requestHost, ssl = ssl)
  
    __obj.asInstanceOf[SimpleOptions]
  }
}

