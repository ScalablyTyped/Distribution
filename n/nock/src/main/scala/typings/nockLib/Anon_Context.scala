package typings
package nockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: nockLib.nockMod.NockBackContext
  def nockDone(): scala.Unit
}

object Anon_Context {
  @scala.inline
  def apply(context: nockLib.nockMod.NockBackContext, nockDone: () => scala.Unit): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context, nockDone = js.Any.fromFunction0(nockDone))
  
    __obj.asInstanceOf[Anon_Context]
  }
}

