package typings.ndnDashJs

import typings.ndnDashJs.blobMod.Blob
import typings.ndnDashJs.nameMod.Name
import typings.ndnDashJs.signatureMod.DigestSha256Signature
import typings.ndnDashJs.signatureMod.GenericSignature
import typings.ndnDashJs.signatureMod.HmacWithSha25Signature
import typings.ndnDashJs.signatureMod.KeyLocator
import typings.ndnDashJs.signatureMod.KeyLocatorType
import typings.ndnDashJs.signatureMod.Sha256WithEcdsaSignature
import typings.ndnDashJs.signatureMod.Sha256WithRsaSignature
import typings.ndnDashJs.signatureMod.Signature
import typings.ndnDashJs.signatureMod.SignatureBase
import typings.ndnDashJs.signatureMod.SignatureBaseKl
import typings.ndnDashJs.signatureMod.SignatureBaseKlVp
import typings.ndnDashJs.signatureMod.ValidityPeriod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/signature", JSImport.Namespace)
@js.native
object signatureMod extends js.Object {
  @js.native
  class DigestSha256Signature () extends SignatureBase[DigestSha256Signature]
  
  @js.native
  class GenericSignature () extends SignatureBase[GenericSignature] {
    def getSignatureInfoEncoding(): Blob = js.native
    def getTypeCode(): Double = js.native
    def setSignatureInfoEncoding(encoding: Blob): Unit = js.native
    def setSignatureInfoEncoding(encoding: Blob, typeCode: Double): Unit = js.native
  }
  
  @js.native
  class HmacWithSha25Signature () extends SignatureBaseKl[HmacWithSha25Signature]
  
  @js.native
  class KeyLocator () extends js.Object {
    def this(kl: KeyLocator) = this()
    def clear(): Unit = js.native
    def getKeyData(): Blob = js.native
    def getKeyName(): Name = js.native
    def getType(): KeyLocatorType = js.native
    def setKeyData(keyData: Blob): Unit = js.native
    def setKeyName(name: Name): Unit = js.native
    def setType(`type`: KeyLocatorType): Unit = js.native
  }
  
  @js.native
  sealed trait KeyLocatorType extends js.Object
  
  @js.native
  class Sha256WithEcdsaSignature () extends SignatureBaseKlVp[Sha256WithEcdsaSignature]
  
  @js.native
  class Sha256WithRsaSignature () extends SignatureBaseKlVp[Sha256WithRsaSignature]
  
  @js.native
  abstract class Signature () extends js.Object
  
  @js.native
  class SignatureBase[T /* <: Signature */] () extends Signature {
    def getSignature(): Blob = js.native
    def setSignature(sigValue: Blob): Unit = js.native
  }
  
  @js.native
  class SignatureBaseKl[T /* <: Signature */] () extends SignatureBase[T] {
    def getKeyLocator(): KeyLocator = js.native
    def setKeyLocator(): Unit = js.native
    def setKeyLocator(kl: KeyLocator): Unit = js.native
  }
  
  @js.native
  class SignatureBaseKlVp[T /* <: Signature */] () extends SignatureBaseKl[T] {
    def getValidityPeriod(): ValidityPeriod = js.native
    def setValidityPeriod(): Unit = js.native
    def setValidityPeriod(validity: ValidityPeriod): Unit = js.native
  }
  
  @js.native
  class ValidityPeriod () extends js.Object {
    def this(validity: ValidityPeriod) = this()
    def this(notBefore: Double, notAfter: Double) = this()
    def clear(): Unit = js.native
    def equals(other: ValidityPeriod): Boolean = js.native
    def getNotAfter(): Double = js.native
    def getNotBefore(): Double = js.native
    def hasPeriod(): Boolean = js.native
    def isValid(): Boolean = js.native
    def isValid(time: Double): Boolean = js.native
  }
  
  @js.native
  object KeyLocatorType extends js.Object {
    @js.native
    sealed trait KEYNAME extends KeyLocatorType
    
    @js.native
    sealed trait KEY_LOCATOR_DIGEST extends KeyLocatorType
    
    /* 1 */ val KEYNAME: typings.ndnDashJs.signatureMod.KeyLocatorType.KEYNAME with Double = js.native
    /* 2 */ val KEY_LOCATOR_DIGEST: typings.ndnDashJs.signatureMod.KeyLocatorType.KEY_LOCATOR_DIGEST with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyLocatorType with Double] = js.native
  }
  
}

