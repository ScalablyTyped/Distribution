package typings
package numeralLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Billion extends js.Object {
  var billion: java.lang.String
  var million: java.lang.String
  var thousand: java.lang.String
  var trillion: java.lang.String
}

object Anon_Billion {
  @scala.inline
  def apply(
    billion: java.lang.String,
    million: java.lang.String,
    thousand: java.lang.String,
    trillion: java.lang.String
  ): Anon_Billion = {
    val __obj = js.Dynamic.literal(billion = billion, million = million, thousand = thousand, trillion = trillion)
  
    __obj.asInstanceOf[Anon_Billion]
  }
}

