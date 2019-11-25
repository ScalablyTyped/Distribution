package typings.ndnDashJs.nameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ComponentType extends js.Object

@JSImport("ndn-js/name", "ComponentType")
@js.native
object ComponentType extends js.Object {
  @js.native
  sealed trait GENERIC extends ComponentType
  
  @js.native
  sealed trait IMPLICIT_SHA256_DIGEST extends ComponentType
  
  @js.native
  sealed trait OTHER_CODE extends ComponentType
  
  @js.native
  sealed trait PARAMETERS_SHA256_DIGEST extends ComponentType
  
  /* 8 */ val GENERIC: typings.ndnDashJs.nameMod.ComponentType.GENERIC with Double = js.native
  /* 1 */ val IMPLICIT_SHA256_DIGEST: typings.ndnDashJs.nameMod.ComponentType.IMPLICIT_SHA256_DIGEST with Double = js.native
  /* 0x7fff */ val OTHER_CODE: typings.ndnDashJs.nameMod.ComponentType.OTHER_CODE with Double = js.native
  /* 2 */ val PARAMETERS_SHA256_DIGEST: typings.ndnDashJs.nameMod.ComponentType.PARAMETERS_SHA256_DIGEST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentType with Double] = js.native
}

