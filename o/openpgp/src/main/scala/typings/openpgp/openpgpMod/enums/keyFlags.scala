package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait keyFlags extends js.Object

/**
  * Key flags
  */
@JSImport("openpgp", "enums.keyFlags")
@js.native
object keyFlags extends js.Object {
  /**
    * 0x20 - This key may be used for authentication.
    */
  @js.native
  sealed trait authentication extends keyFlags
  
  /**
    * 0x01 - This key may be used to certify other keys.
    */
  @js.native
  sealed trait certify_keys extends keyFlags
  
  /**
    * 0x04 - This key may be used to encrypt communications.
    */
  @js.native
  sealed trait encrypt_communication extends keyFlags
  
  /**
    * 0x08 - This key may be used to encrypt storage.
    */
  @js.native
  sealed trait encrypt_storage extends keyFlags
  
  /**
    * 0x80 - The private component of this key may be in the
    * possession of more than one person.
    */
  @js.native
  sealed trait shared_private_key extends keyFlags
  
  /**
    * 0x02 - This key may be used to sign data.
    */
  @js.native
  sealed trait sign_data extends keyFlags
  
  /**
    * 0x10 - The private component of this key may have been split
    * by a secret-sharing mechanism.
    */
  @js.native
  sealed trait split_private_key extends keyFlags
  
  /* 32 */ val authentication: typings.openpgp.openpgpMod.enums.keyFlags.authentication with Double = js.native
  /* 1 */ val certify_keys: typings.openpgp.openpgpMod.enums.keyFlags.certify_keys with Double = js.native
  /* 4 */ val encrypt_communication: typings.openpgp.openpgpMod.enums.keyFlags.encrypt_communication with Double = js.native
  /* 8 */ val encrypt_storage: typings.openpgp.openpgpMod.enums.keyFlags.encrypt_storage with Double = js.native
  /* 128 */ val shared_private_key: typings.openpgp.openpgpMod.enums.keyFlags.shared_private_key with Double = js.native
  /* 2 */ val sign_data: typings.openpgp.openpgpMod.enums.keyFlags.sign_data with Double = js.native
  /* 16 */ val split_private_key: typings.openpgp.openpgpMod.enums.keyFlags.split_private_key with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[keyFlags with Double] = js.native
}

