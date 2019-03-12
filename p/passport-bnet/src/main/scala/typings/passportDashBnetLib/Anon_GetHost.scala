package typings
package passportDashBnetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetHost extends js.Object {
  def getHost(region: java.lang.String): java.lang.String
}

object Anon_GetHost {
  @scala.inline
  def apply(getHost: java.lang.String => java.lang.String): Anon_GetHost = {
    val __obj = js.Dynamic.literal(getHost = js.Any.fromFunction1(getHost))
  
    __obj.asInstanceOf[Anon_GetHost]
  }
}

