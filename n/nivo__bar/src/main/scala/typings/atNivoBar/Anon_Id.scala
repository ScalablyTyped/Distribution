package typings.atNivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String | Double
  var indexValue: String | Double
  var value: Double
}

object Anon_Id {
  @scala.inline
  def apply(id: String | Double, indexValue: String | Double, value: Double): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], indexValue = indexValue.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

