package typings.minecraftDashScriptingDashTypesDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServer extends js.Object {
  def log(message: String): Unit
  def registerSystem[TSystem /* <: IServerSystem[TSystem] */](majorVersion: Double, minorVersion: Double): TSystem
}

object IServer {
  @scala.inline
  def apply(log: String => Unit, registerSystem: (Double, Double) => js.Any): IServer = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), registerSystem = js.Any.fromFunction2(registerSystem))
  
    __obj.asInstanceOf[IServer]
  }
}

