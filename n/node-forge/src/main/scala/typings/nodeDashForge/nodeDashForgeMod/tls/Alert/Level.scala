package typings.nodeDashForge.nodeDashForgeMod.tls.Alert

import org.scalablytyped.runtime.TopLevel
import typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Level.fatal
import typings.nodeDashForge.nodeDashForgeMod.tls.Alert.Level.warning
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Level with Double] = js.native
  /* 2 */ @js.native
  object fatal extends TopLevel[fatal with Double]
  
  /* 1 */ @js.native
  object warning extends TopLevel[warning with Double]
  
}

