package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[keyFlags with Double] = js.native
  /* 32 */ @js.native
  object authentication extends TopLevel[authentication with Double]
  
  /* 1 */ @js.native
  object certify_keys extends TopLevel[certify_keys with Double]
  
  /* 4 */ @js.native
  object encrypt_communication extends TopLevel[encrypt_communication with Double]
  
  /* 8 */ @js.native
  object encrypt_storage extends TopLevel[encrypt_storage with Double]
  
  /* 128 */ @js.native
  object shared_private_key extends TopLevel[shared_private_key with Double]
  
  /* 2 */ @js.native
  object sign_data extends TopLevel[sign_data with Double]
  
  /* 16 */ @js.native
  object split_private_key extends TopLevel[split_private_key with Double]
  
}

