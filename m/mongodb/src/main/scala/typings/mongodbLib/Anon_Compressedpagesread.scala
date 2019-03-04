package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compressedpagesread extends js.Object {
  var `compressed pages read`: scala.Double
  var `compressed pages written`: scala.Double
  var `page written failed to compress`: scala.Double
  var `page written was too small to compress`: scala.Double
  var `raw compression call failed, additional data available`: scala.Double
  var `raw compression call failed, no additional data available`: scala.Double
  var `raw compression call succeeded`: scala.Double
}

object Anon_Compressedpagesread {
  @scala.inline
  def apply(
    `compressed pages read`: scala.Double,
    `compressed pages written`: scala.Double,
    `page written failed to compress`: scala.Double,
    `page written was too small to compress`: scala.Double,
    `raw compression call failed, additional data available`: scala.Double,
    `raw compression call failed, no additional data available`: scala.Double,
    `raw compression call succeeded`: scala.Double
  ): Anon_Compressedpagesread = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compressed pages read")(`compressed pages read`)
    __obj.updateDynamic("compressed pages written")(`compressed pages written`)
    __obj.updateDynamic("page written failed to compress")(`page written failed to compress`)
    __obj.updateDynamic("page written was too small to compress")(`page written was too small to compress`)
    __obj.updateDynamic("raw compression call failed, additional data available")(`raw compression call failed, additional data available`)
    __obj.updateDynamic("raw compression call failed, no additional data available")(`raw compression call failed, no additional data available`)
    __obj.updateDynamic("raw compression call succeeded")(`raw compression call succeeded`)
    __obj.asInstanceOf[Anon_Compressedpagesread]
  }
}

