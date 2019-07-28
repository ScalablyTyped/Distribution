package typings.ndnDashJs.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyLocatorType extends js.Object

@JSImport("ndn-js/signature", "KeyLocatorType")
@js.native
object KeyLocatorType extends js.Object {
  @js.native
  sealed trait KEYNAME extends KeyLocatorType
  
  @js.native
  sealed trait KEY_LOCATOR_DIGEST extends KeyLocatorType
  
  /* 1 */ val KEYNAME: typings.ndnDashJs.signatureMod.KeyLocatorType.KEYNAME with Double = js.native
  /* 2 */ val KEY_LOCATOR_DIGEST: typings.ndnDashJs.signatureMod.KeyLocatorType.KEY_LOCATOR_DIGEST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyLocatorType with Double] = js.native
}

