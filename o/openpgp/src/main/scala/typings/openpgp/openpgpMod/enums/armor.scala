package typings.openpgp.openpgpMod.enums

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
  
  /* 3 */ val message: typings.openpgp.openpgpMod.enums.armor.message with Double = js.native
  /* 1 */ val multipart_last: typings.openpgp.openpgpMod.enums.armor.multipart_last with Double = js.native
  /* 0 */ val multipart_section: typings.openpgp.openpgpMod.enums.armor.multipart_section with Double = js.native
  /* 5 */ val private_key: typings.openpgp.openpgpMod.enums.armor.private_key with Double = js.native
  /* 4 */ val public_key: typings.openpgp.openpgpMod.enums.armor.public_key with Double = js.native
  /* 6 */ val signature: typings.openpgp.openpgpMod.enums.armor.signature with Double = js.native
  /* 2 */ val signed: typings.openpgp.openpgpMod.enums.armor.signed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[armor with Double] = js.native
}

