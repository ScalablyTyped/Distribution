package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClient extends js.Object {
  def log(message: java.lang.String): scala.Unit
  def registerSystem[TSystem /* <: IClientSystem[TSystem] */](majorVersion: scala.Double, minorVersion: scala.Double): TSystem
}

object IClient {
  @scala.inline
  def apply(log: java.lang.String => scala.Unit, registerSystem: (scala.Double, scala.Double) => js.Any): IClient = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log), registerSystem = js.Any.fromFunction2(registerSystem))
  
    __obj.asInstanceOf[IClient]
  }
}

