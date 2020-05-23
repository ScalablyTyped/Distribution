package typings.otplib.v11Mod.authenticator

import org.scalablytyped.runtime.Instantiable0
import typings.otplibPresetV11.HotpOptionsInterface
import typings.otplibPresetV11.HotpVerifyOptionsInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("otplib/v11", "authenticator.HOTP")
@js.native
class HOTPCls ()
  extends typings.otplibPresetV11.HOTP {
  /* CompleteClass */
  override var HOTP: Instantiable0[typings.otplibPresetV11.HOTP] = js.native
  /* CompleteClass */
  override var defaultOptions: HotpOptionsInterface = js.native
  /* CompleteClass */
  override var options: HotpOptionsInterface = js.native
  /* CompleteClass */
  override var optionsAll: HotpOptionsInterface = js.native
  /* CompleteClass */
  override def check(token: String, secret: String, counter: Double): Boolean = js.native
  /* CompleteClass */
  override def generate(secret: String, counter: Double): String = js.native
  /* CompleteClass */
  override def resetOptions(): this.type = js.native
  /* CompleteClass */
  override def verify(opts: HotpVerifyOptionsInterface): Boolean = js.native
}

