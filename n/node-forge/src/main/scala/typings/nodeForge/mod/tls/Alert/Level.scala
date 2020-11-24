package typings.nodeForge.mod.tls.Alert

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Level extends js.Object
@JSImport("node-forge", "tls.Alert.Level")
@js.native
object Level extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Level with Double] = js.native
  
  @js.native
  sealed trait fatal extends Level
  /* 2 */ @js.native
  object fatal extends TopLevel[fatal with Double]
  
  @js.native
  sealed trait warning extends Level
  /* 1 */ @js.native
  object warning extends TopLevel[warning with Double]
}
