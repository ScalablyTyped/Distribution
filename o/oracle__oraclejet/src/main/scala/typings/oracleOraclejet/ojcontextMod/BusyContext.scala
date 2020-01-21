package typings.oracleOraclejet.ojcontextMod

import typings.oracleOraclejet.AnonDescription
import typings.oracleOraclejet.AnonDescriptionId
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusyContext extends js.Object {
  def addBusyState(options: AnonDescription): js.Function0[Unit] = js.native
  def applicationBootstrapComplete(): js.UndefOr[scala.Nothing] = js.native
  def clear(): js.UndefOr[scala.Nothing] = js.native
  def dump(): js.UndefOr[scala.Nothing] = js.native
  def dump(message: String): js.UndefOr[scala.Nothing] = js.native
  def getBusyStates(): js.Array[AnonDescriptionId] = js.native
  def isReady(): Boolean = js.native
  def whenReady(): js.Promise[Boolean | Error] = js.native
  def whenReady(timeout: Double): js.Promise[Boolean | Error] = js.native
}

