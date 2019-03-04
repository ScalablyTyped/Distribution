package typings
package monkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cursor[U] extends js.Object {
  def each(record: U, cursor: Anon_Close): js.Any
}

object Anon_Cursor {
  @scala.inline
  def apply[U](each: js.Function2[U, Anon_Close, js.Any]): Anon_Cursor[U] = {
    val __obj = js.Dynamic.literal(each = each)
  
    __obj.asInstanceOf[Anon_Cursor[U]]
  }
}

