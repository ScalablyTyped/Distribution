package typings.navermaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Country extends js.Object {
  var country: String
  var dongmyun: String
  var rest: String
  var sido: String
  var sigugun: String
}

object Anon_Country {
  @scala.inline
  def apply(country: String, dongmyun: String, rest: String, sido: String, sigugun: String): Anon_Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], dongmyun = dongmyun.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sigugun = sigugun.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Country]
  }
}

