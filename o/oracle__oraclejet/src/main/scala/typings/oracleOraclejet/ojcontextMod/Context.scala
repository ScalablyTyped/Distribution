package typings.oracleOraclejet.ojcontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  def getBusyContext(): BusyContext
}

object Context {
  @scala.inline
  def apply(getBusyContext: () => BusyContext): Context = {
    val __obj = js.Dynamic.literal(getBusyContext = js.Any.fromFunction0(getBusyContext))
  
    __obj.asInstanceOf[Context]
  }
}

