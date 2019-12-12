package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
import typings.openpgp.openpgpMod.enums.armor.multipart_last
import typings.openpgp.openpgpMod.enums.armor.multipart_section
import typings.openpgp.openpgpMod.enums.armor.private_key
import typings.openpgp.openpgpMod.enums.armor.public_key
import typings.openpgp.openpgpMod.enums.armor.signed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait armor extends js.Object

/**
  * Armor type
  */
@JSImport("openpgp", "enums.armor")
@js.native
object armor extends js.Object {
  @js.native
  sealed trait message extends armor
  
  @js.native
  sealed trait multipart_last extends armor
  
  @js.native
  sealed trait multipart_section extends armor
  
  @js.native
  sealed trait private_key extends armor
  
  @js.native
  sealed trait public_key extends armor
  
  @js.native
  sealed trait signature extends armor
  
  @js.native
  sealed trait signed extends armor
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[armor with Double] = js.native
  /* 3 */ @js.native
  object message
    extends TopLevel[typings.openpgp.openpgpMod.enums.armor.message with Double]
  
  /* 1 */ @js.native
  object multipart_last extends TopLevel[multipart_last with Double]
  
  /* 0 */ @js.native
  object multipart_section extends TopLevel[multipart_section with Double]
  
  /* 5 */ @js.native
  object private_key extends TopLevel[private_key with Double]
  
  /* 4 */ @js.native
  object public_key extends TopLevel[public_key with Double]
  
  /* 6 */ @js.native
  object signature
    extends TopLevel[typings.openpgp.openpgpMod.enums.armor.signature with Double]
  
  /* 2 */ @js.native
  object signed extends TopLevel[signed with Double]
  
}

