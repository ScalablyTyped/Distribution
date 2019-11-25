package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compressedpagesread extends js.Object {
  var `compressed pages read`: Double
  var `compressed pages written`: Double
  var `page written failed to compress`: Double
  var `page written was too small to compress`: Double
  var `raw compression call failed, additional data available`: Double
  var `raw compression call failed, no additional data available`: Double
  var `raw compression call succeeded`: Double
}

object Anon_Compressedpagesread {
  @scala.inline
  def apply(
    `compressed pages read`: Double,
    `compressed pages written`: Double,
    `page written failed to compress`: Double,
    `page written was too small to compress`: Double,
    `raw compression call failed, additional data available`: Double,
    `raw compression call failed, no additional data available`: Double,
    `raw compression call succeeded`: Double
  ): Anon_Compressedpagesread = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressed pages read")(`compressed pages read`.asInstanceOf[js.Any])
    __obj.updateDynamic("compressed pages written")(`compressed pages written`.asInstanceOf[js.Any])
    __obj.updateDynamic("page written failed to compress")(`page written failed to compress`.asInstanceOf[js.Any])
    __obj.updateDynamic("page written was too small to compress")(`page written was too small to compress`.asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call failed, additional data available")(`raw compression call failed, additional data available`.asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call failed, no additional data available")(`raw compression call failed, no additional data available`.asInstanceOf[js.Any])
    __obj.updateDynamic("raw compression call succeeded")(`raw compression call succeeded`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Compressedpagesread]
  }
}

