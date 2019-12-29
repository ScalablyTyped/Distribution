package typings.ndnDashJs.nameMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ComponentType with Double] = js.native
  /* 8 */ @js.native
  object GENERIC extends TopLevel[GENERIC with Double]
  
  /* 1 */ @js.native
  object IMPLICIT_SHA256_DIGEST extends TopLevel[IMPLICIT_SHA256_DIGEST with Double]
  
  /* 0x7fff */ @js.native
  object OTHER_CODE extends TopLevel[OTHER_CODE with Double]
  
  /* 2 */ @js.native
  object PARAMETERS_SHA256_DIGEST extends TopLevel[PARAMETERS_SHA256_DIGEST with Double]
  
}

