package typings.pgDashPromise.pgDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Custom-Type Formatting object
// API: https://github.com/vitaly-t/pg-promise#custom-type-formatting
trait ICTFObject extends js.Object {
  def toPostgres(a: js.Any): js.Any
}

object ICTFObject {
  @scala.inline
  def apply(toPostgres: js.Any => js.Any): ICTFObject = {
    val __obj = js.Dynamic.literal(toPostgres = js.Any.fromFunction1(toPostgres))
  
    __obj.asInstanceOf[ICTFObject]
  }
}

