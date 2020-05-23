package typings.peculiarAsn1Schema.enumsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsnTypeTypes extends js.Object

@JSImport("@peculiar/asn1-schema/build/types/enums", "AsnTypeTypes")
@js.native
object AsnTypeTypes extends js.Object {
  @js.native
  sealed trait Choice extends AsnTypeTypes
  
  @js.native
  sealed trait Sequence extends AsnTypeTypes
  
  @js.native
  sealed trait Set extends AsnTypeTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AsnTypeTypes with Double] = js.native
  /* 2 */ @js.native
  object Choice extends TopLevel[Choice with Double]
  
  /* 0 */ @js.native
  object Sequence extends TopLevel[Sequence with Double]
  
  /* 1 */ @js.native
  object Set extends TopLevel[Set with Double]
  
}

