package typings.otplibCore.totpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@otplib/core/totp", "totpEpochAvailable")
@js.native
object totpEpochAvailable extends js.Object {
  
  def apply(epoch: Double, step: Double, win: js.Tuple2[Double, Double]): EpochAvailable = js.native
  def apply(epoch: Double, step: Double, win: Double): EpochAvailable = js.native
}
