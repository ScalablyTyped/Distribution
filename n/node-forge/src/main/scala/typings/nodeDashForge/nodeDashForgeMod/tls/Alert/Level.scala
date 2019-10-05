package typings.nodeDashForge.nodeDashForgeMod.tls.Alert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Level extends js.Object

@JSImport("node-forge", "tls.Alert.Level")
@js.native
object Level extends js.Object {
  @js.native
  sealed trait fatal extends Level
  
  @js.native
  sealed trait warning extends Level
  
  /* 2 */ val fatal: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Level.fatal with Double = js.native
  /* 1 */ val warning: typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Level.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Level with Double] = js.native
}

