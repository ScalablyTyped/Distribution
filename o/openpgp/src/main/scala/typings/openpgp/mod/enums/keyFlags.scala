package typings.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait keyFlags extends StObject
/**
  * Key flags
  */
@JSImport("openpgp", "enums.keyFlags")
@js.native
object keyFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[keyFlags with Double] = js.native
  
  /**
    * 0x20 - This key may be used for authentication.
    */
  @js.native
  sealed trait authentication extends keyFlags
  /* 32 */ val authentication: typings.openpgp.mod.enums.keyFlags.authentication with Double = js.native
  
  /**
    * 0x01 - This key may be used to certify other keys.
    */
  @js.native
  sealed trait certify_keys extends keyFlags
  /* 1 */ val certify_keys: typings.openpgp.mod.enums.keyFlags.certify_keys with Double = js.native
  
  /**
    * 0x04 - This key may be used to encrypt communications.
    */
  @js.native
  sealed trait encrypt_communication extends keyFlags
  /* 4 */ val encrypt_communication: typings.openpgp.mod.enums.keyFlags.encrypt_communication with Double = js.native
  
  /**
    * 0x08 - This key may be used to encrypt storage.
    */
  @js.native
  sealed trait encrypt_storage extends keyFlags
  /* 8 */ val encrypt_storage: typings.openpgp.mod.enums.keyFlags.encrypt_storage with Double = js.native
  
  /**
    * 0x80 - The private component of this key may be in the
    * possession of more than one person.
    */
  @js.native
  sealed trait shared_private_key extends keyFlags
  /* 128 */ val shared_private_key: typings.openpgp.mod.enums.keyFlags.shared_private_key with Double = js.native
  
  /**
    * 0x02 - This key may be used to sign data.
    */
  @js.native
  sealed trait sign_data extends keyFlags
  /* 2 */ val sign_data: typings.openpgp.mod.enums.keyFlags.sign_data with Double = js.native
  
  /**
    * 0x10 - The private component of this key may have been split
    * by a secret-sharing mechanism.
    */
  @js.native
  sealed trait split_private_key extends keyFlags
  /* 16 */ val split_private_key: typings.openpgp.mod.enums.keyFlags.split_private_key with Double = js.native
}
