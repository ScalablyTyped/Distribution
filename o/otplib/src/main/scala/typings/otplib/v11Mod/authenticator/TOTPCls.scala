package typings.otplib.v11Mod.authenticator

import org.scalablytyped.runtime.Instantiable0
import typings.otplibPresetV11.HotpOptionsInterface
import typings.otplibPresetV11.HotpVerifyOptionsInterface
import typings.otplibPresetV11.TotpOptionsInterface
import typings.otplibPresetV11.TotpVerifyOptionsInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("otplib/v11", "authenticator.TOTP")
@js.native
class TOTPCls ()
  extends typings.otplibPresetV11.TOTP {
  /* CompleteClass */
  override var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
  /* CompleteClass */
  override var TOTP: Instantiable0[typings.otplibPresetV11.TOTP] = js.native
  /* CompleteClass */
  override var defaultOptions: HotpOptionsInterface = js.native
  /* CompleteClass */
  @JSName("defaultOptions")
  override var defaultOptions_TOTP: TotpOptionsInterface = js.native
  /* CompleteClass */
  override var options: HotpOptionsInterface = js.native
  /* CompleteClass */
  override var optionsAll: HotpOptionsInterface = js.native
  /* CompleteClass */
  @JSName("optionsAll")
  override var optionsAll_TOTP: TotpOptionsInterface = js.native
  /* CompleteClass */
  @JSName("options")
  override var options_TOTP: TotpOptionsInterface = js.native
  /* CompleteClass */
  override def check(token: String, secret: String): Boolean = js.native
  /* CompleteClass */
  override def check(token: String, secret: String, counter: Double): Boolean = js.native
  /* CompleteClass */
  override def checkDelta(token: String, secret: String): Double | Null = js.native
  /* CompleteClass */
  override def generate(secret: String): String = js.native
  /* CompleteClass */
  override def generate(secret: String, counter: Double): String = js.native
  /* CompleteClass */
  override def resetOptions(): this.type = js.native
  /* CompleteClass */
  override def timeRemaining(): Double = js.native
  /* CompleteClass */
  override def timeUsed(): Double = js.native
  /* CompleteClass */
  override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
  /* CompleteClass */
  override def verify(opts: TotpVerifyOptionsInterface): Boolean = js.native
}

