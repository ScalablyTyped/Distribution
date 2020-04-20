package typings.minecraftScriptingTypesClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClient extends js.Object {
  def log(message: String): Unit
  def registerSystem[TSystem /* <: IClientSystem[TSystem] */](majorVersion: Double, minorVersion: Double): TSystem
}

object IClient {
  @scala.inline
  def apply(log: String => Unit, registerSystem: (Double, Double) => js.Any): IClient = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), registerSystem = js.Any.fromFunction2(registerSystem))
    __obj.asInstanceOf[IClient]
  }
}

