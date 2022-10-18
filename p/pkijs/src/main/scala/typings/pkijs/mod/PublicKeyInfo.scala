package typings.pkijs.mod

import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PublicKeyInfo structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@js.native
trait PublicKeyInfo
  extends StObject
     with PkiObject
     with IPublicKeyInfo {
  
  /* private */ var _parsedKey: Any = js.native
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
  
  def importKey(publicKey: CryptoKey): js.Promise[Unit] = js.native
  def importKey(publicKey: CryptoKey, crypto: ICryptoEngine): js.Promise[Unit] = js.native
  
  @JSName("parsedKey")
  def parsedKey_MPublicKeyInfo: js.UndefOr[ECPublicKey | RSAPublicKey] = js.native
}
