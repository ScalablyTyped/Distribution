package typings
package ndnDashJsLib.nameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentType extends js.Object

@JSImport("ndn-js/name", "ComponentType")
@js.native
object ComponentType extends js.Object {
  @js.native
  sealed trait GENERIC
    extends ndnDashJsLib.nameMod.ComponentType
  
  @js.native
  sealed trait IMPLICIT_SHA256_DIGEST
    extends ndnDashJsLib.nameMod.ComponentType
  
  @js.native
  sealed trait OTHER_CODE
    extends ndnDashJsLib.nameMod.ComponentType
  
  @js.native
  sealed trait PARAMETERS_SHA256_DIGEST
    extends ndnDashJsLib.nameMod.ComponentType
  
  /* 8 */ val GENERIC: GENERIC with scala.Double = js.native
  /* 1 */ val IMPLICIT_SHA256_DIGEST: IMPLICIT_SHA256_DIGEST with scala.Double = js.native
  /* 0x7fff */ val OTHER_CODE: OTHER_CODE with scala.Double = js.native
  /* 2 */ val PARAMETERS_SHA256_DIGEST: PARAMETERS_SHA256_DIGEST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ndnDashJsLib.nameMod.ComponentType with scala.Double] = js.native
}

