package typings
package ndnDashJsLib.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyLocatorType extends js.Object

@JSImport("ndn-js/signature", "KeyLocatorType")
@js.native
object KeyLocatorType extends js.Object {
  @js.native
  sealed trait KEYNAME
    extends ndnDashJsLib.signatureMod.KeyLocatorType
  
  @js.native
  sealed trait KEY_LOCATOR_DIGEST
    extends ndnDashJsLib.signatureMod.KeyLocatorType
  
  /* 1 */ val KEYNAME: KEYNAME with scala.Double = js.native
  /* 2 */ val KEY_LOCATOR_DIGEST: KEY_LOCATOR_DIGEST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ndnDashJsLib.signatureMod.KeyLocatorType with scala.Double] = js.native
}

