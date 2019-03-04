package typings
package navermapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Country extends js.Object {
  var country: java.lang.String
  var dongmyun: java.lang.String
  var rest: java.lang.String
  var sido: java.lang.String
  var sigugun: java.lang.String
}

object Anon_Country {
  @scala.inline
  def apply(
    country: java.lang.String,
    dongmyun: java.lang.String,
    rest: java.lang.String,
    sido: java.lang.String,
    sigugun: java.lang.String
  ): Anon_Country = {
    val __obj = js.Dynamic.literal(country = country, dongmyun = dongmyun, rest = rest, sido = sido, sigugun = sigugun)
  
    __obj.asInstanceOf[Anon_Country]
  }
}

