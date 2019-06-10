package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServer extends js.Object {
  def log(message: java.lang.String): scala.Unit
  def registerSystem[TSystem /* <: IServerSystem[TSystem] */](majorVersion: scala.Double, minorVersion: scala.Double): TSystem
}

object IServer {
  @scala.inline
  def apply(log: java.lang.String => scala.Unit, registerSystem: (scala.Double, scala.Double) => js.Any): IServer = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), registerSystem = js.Any.fromFunction2(registerSystem))
  
    __obj.asInstanceOf[IServer]
  }
}

