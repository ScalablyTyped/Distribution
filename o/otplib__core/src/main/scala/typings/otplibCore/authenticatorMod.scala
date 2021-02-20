package typings.otplibCore

import typings.otplibCore.otplibCoreStrings.createRandomBytes
import typings.otplibCore.otplibCoreStrings.encoding
import typings.otplibCore.otplibCoreStrings.keyDecoder
import typings.otplibCore.otplibCoreStrings.keyEncoder
import typings.otplibCore.totpMod.TOTP
import typings.otplibCore.totpMod.TOTPOptions_
import typings.otplibCore.utilsMod.KeyEncodings
import typings.otplibCore.utilsMod.SecretKey
import typings.std.Partial
import typings.std.Pick
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticatorMod {
  
  @JSImport("@otplib/core/authenticator", "Authenticator")
  @js.native
  /**
    * Constructs the class with defaultOptions set.
    *
    * @param defaultOptions used to override or add existing defaultOptions.
    */
  class Authenticator[T /* <: AuthenticatorOptions_[String] */] () extends TOTP[T] {
    def this(defaultOptions: Partial[T]) = this()
    
    /**
      * Reference: [[authenticatorDecoder]]
      */
    def decode(secret: Base32SecretKey): SecretKey = js.native
    
    /**
      * Reference: [[authenticatorEncoder]]
      */
    def encode(secret: SecretKey): Base32SecretKey = js.native
    
    /**
      * Reference: [[authenticatorGenerateSecret]]
      */
    def generateSecret(): Base32SecretKey = js.native
    def generateSecret(numberOfBytes: Double): Base32SecretKey = js.native
  }
  
  @JSImport("@otplib/core/authenticator", "authenticatorCheckWithWindow")
  @js.native
  def authenticatorCheckWithWindow[T /* <: AuthenticatorOptions_[String] */](token: String, secret: Base32SecretKey, options: T): Double | Null = js.native
  
  @JSImport("@otplib/core/authenticator", "authenticatorDecoder")
  @js.native
  def authenticatorDecoder[T /* <: AuthenticatorOptions_[_] */](secret: Base32SecretKey, options: Pick[T, keyDecoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyDecoder'] */ js.Any
  ] = js.native
  
  @JSImport("@otplib/core/authenticator", "authenticatorDefaultOptions")
  @js.native
  def authenticatorDefaultOptions[T /* <: AuthenticatorOptions_[_] */](): Partial[T] = js.native
  
  @JSImport("@otplib/core/authenticator", "authenticatorEncoder")
  @js.native
  def authenticatorEncoder[T /* <: AuthenticatorOptions_[_] */](secret: SecretKey, options: Pick[T, keyEncoder | encoding]): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['keyEncoder'] */ js.Any
  ] = js.native
  
  @JSImport("@otplib/core/authenticator", "authenticatorGenerateSecret")
  @js.native
  def authenticatorGenerateSecret[T /* <: AuthenticatorOptions_[String] */](numberOfBytes: Double, options: Pick[T, keyEncoder | encoding | createRandomBytes]): Base32SecretKey = js.native
  
  @JSImport("@otplib/core/authenticator", "authenticatorOptionValidator")
  @js.native
  def authenticatorOptionValidator[T /* <: AuthenticatorOptions_[_] */](options: Partial[T]): Unit = js.native
  
  @JSImport("@otplib/core/authenticator", "authenticatorOptions")
  @js.native
  def authenticatorOptions[T /* <: AuthenticatorOptions_[_] */](opt: Partial[T]): T = js.native
  
  @JSImport("@otplib/core/authenticator", "authenticatorToken")
  @js.native
  def authenticatorToken[T /* <: AuthenticatorOptions_[String] */](secret: Base32SecretKey, options: T): String = js.native
  
  @js.native
  trait AuthenticatorOptions_[T] extends TOTPOptions_[T] {
    
    /**
      * Creates a random string containing the defined number of
      * bytes to be used in generating a secret key.
      */
    def createRandomBytes(size: Double, encoding: KeyEncodings): T = js.native
    /**
      * Creates a random string containing the defined number of
      * bytes to be used in generating a secret key.
      */
    @JSName("createRandomBytes")
    var createRandomBytes_Original: CreateRandomBytes[T] = js.native
    
    /**
      * Decodes the Base32 string given by the user into a secret.
      * */
    def keyDecoder(encodedSecret: Base32SecretKey, encoding: KeyEncodings): T = js.native
    /**
      * Decodes the Base32 string given by the user into a secret.
      * */
    @JSName("keyDecoder")
    var keyDecoder_Original: KeyDecoder[T] = js.native
    
    /**
      * Encodes a secret key into a Base32 string before it is
      * sent to the user (in QR Code etc).
      */
    def keyEncoder(secret: SecretKey, encoding: KeyEncodings): T = js.native
    /**
      * Encodes a secret key into a Base32 string before it is
      * sent to the user (in QR Code etc).
      */
    @JSName("keyEncoder")
    var keyEncoder_Original: KeyEncoder[T] = js.native
  }
  
  type Base32SecretKey = SecretKey
  
  type CreateRandomBytes[T] = js.Function2[/* size */ Double, /* encoding */ KeyEncodings, T]
  
  type KeyDecoder[T] = js.Function2[/* encodedSecret */ Base32SecretKey, /* encoding */ KeyEncodings, T]
  
  type KeyEncoder[T] = js.Function2[/* secret */ SecretKey, /* encoding */ KeyEncodings, T]
}
