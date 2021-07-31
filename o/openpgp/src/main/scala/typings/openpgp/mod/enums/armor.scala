package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait armor extends StObject
/**
  * Armor type
  */
@JSImport("openpgp", "enums.armor")
@js.native
object armor extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[armor & Double] = js.native
  
  @js.native
  sealed trait message
    extends StObject
       with armor
  /* 3 */ val message: typings.openpgp.mod.enums.armor.message & Double = js.native
  
  @js.native
  sealed trait multipart_last
    extends StObject
       with armor
  /* 1 */ val multipart_last: typings.openpgp.mod.enums.armor.multipart_last & Double = js.native
  
  @js.native
  sealed trait multipart_section
    extends StObject
       with armor
  /* 0 */ val multipart_section: typings.openpgp.mod.enums.armor.multipart_section & Double = js.native
  
  @js.native
  sealed trait private_key
    extends StObject
       with armor
  /* 5 */ val private_key: typings.openpgp.mod.enums.armor.private_key & Double = js.native
  
  @js.native
  sealed trait public_key
    extends StObject
       with armor
  /* 4 */ val public_key: typings.openpgp.mod.enums.armor.public_key & Double = js.native
  
  @js.native
  sealed trait signature
    extends StObject
       with armor
  /* 6 */ val signature: typings.openpgp.mod.enums.armor.signature & Double = js.native
  
  @js.native
  sealed trait signed
    extends StObject
       with armor
  /* 2 */ val signed: typings.openpgp.mod.enums.armor.signed & Double = js.native
}
