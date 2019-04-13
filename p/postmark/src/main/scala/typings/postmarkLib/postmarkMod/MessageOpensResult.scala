package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageOpensResult extends PaginatedResult {
  var Opens: js.Array[MessageOpens]
}

object MessageOpensResult {
  @scala.inline
  def apply(Opens: js.Array[MessageOpens], TotalCount: scala.Double): MessageOpensResult = {
    val __obj = js.Dynamic.literal(Opens = Opens, TotalCount = TotalCount)
  
    __obj.asInstanceOf[MessageOpensResult]
  }
}

