package typings
package atNivoBarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String | scala.Double
  var indexValue: java.lang.String | scala.Double
  var value: scala.Double
}

object Anon_Id {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    indexValue: java.lang.String | scala.Double,
    value: scala.Double
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

