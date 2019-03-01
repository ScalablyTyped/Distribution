package typings
package atOracleOraclejetLib.ojcontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  def getBusyContext(): BusyContext
}

object Context {
  @scala.inline
  def apply(getBusyContext: js.Function0[BusyContext]): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBusyContext")(getBusyContext)
    __obj.asInstanceOf[Context]
  }
}

