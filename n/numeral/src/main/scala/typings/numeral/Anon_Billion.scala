package typings.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Billion extends js.Object {
  var billion: String
  var million: String
  var thousand: String
  var trillion: String
}

object Anon_Billion {
  @scala.inline
  def apply(billion: String, million: String, thousand: String, trillion: String): Anon_Billion = {
    val __obj = js.Dynamic.literal(billion = billion.asInstanceOf[js.Any], million = million.asInstanceOf[js.Any], thousand = thousand.asInstanceOf[js.Any], trillion = trillion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Billion]
  }
}

