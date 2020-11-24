package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait armor extends js.Object
/**
  * Armor type
  */
@JSImport("openpgp", "enums.armor")
@js.native
object armor extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[armor with Double] = js.native
  
  @js.native
  sealed trait message extends armor
  /* 3 */ @js.native
  object message extends TopLevel[message with Double]
  
  @js.native
  sealed trait multipart_last extends armor
  /* 1 */ @js.native
  object multipart_last extends TopLevel[multipart_last with Double]
  
  @js.native
  sealed trait multipart_section extends armor
  /* 0 */ @js.native
  object multipart_section extends TopLevel[multipart_section with Double]
  
  @js.native
  sealed trait private_key extends armor
  /* 5 */ @js.native
  object private_key extends TopLevel[private_key with Double]
  
  @js.native
  sealed trait public_key extends armor
  /* 4 */ @js.native
  object public_key extends TopLevel[public_key with Double]
  
  @js.native
  sealed trait signature extends armor
  /* 6 */ @js.native
  object signature
    extends TopLevel[typings.openpgp.mod.enums.armor.signature with Double]
  
  @js.native
  sealed trait signed extends armor
  /* 2 */ @js.native
  object signed extends TopLevel[signed with Double]
}
