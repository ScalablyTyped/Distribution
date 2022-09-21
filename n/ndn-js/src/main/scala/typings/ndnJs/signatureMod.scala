package typings.ndnJs

import typings.ndnJs.blobMod.Blob
import typings.ndnJs.nameMod.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("ndn-js/signature", "DigestSha256Signature")
  @js.native
  open class DigestSha256Signature () extends SignatureBase[DigestSha256Signature]
  
  @JSImport("ndn-js/signature", "GenericSignature")
  @js.native
  open class GenericSignature () extends SignatureBase[GenericSignature] {
    
    def getSignatureInfoEncoding(): Blob = js.native
    
    def getTypeCode(): Double = js.native
    
    def setSignatureInfoEncoding(encoding: Blob): Unit = js.native
    def setSignatureInfoEncoding(encoding: Blob, typeCode: Double): Unit = js.native
  }
  
  @JSImport("ndn-js/signature", "HmacWithSha25Signature")
  @js.native
  open class HmacWithSha25Signature () extends SignatureBaseKl[HmacWithSha25Signature]
  
  @JSImport("ndn-js/signature", "KeyLocator")
  @js.native
  open class KeyLocator () extends StObject {
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
  sealed trait KeyLocatorType extends StObject
  @JSImport("ndn-js/signature", "KeyLocatorType")
  @js.native
  object KeyLocatorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[KeyLocatorType & Double] = js.native
    
    @js.native
    sealed trait KEYNAME
      extends StObject
         with KeyLocatorType
    /* 1 */ val KEYNAME: typings.ndnJs.signatureMod.KeyLocatorType.KEYNAME & Double = js.native
    
    @js.native
    sealed trait KEY_LOCATOR_DIGEST
      extends StObject
         with KeyLocatorType
    /* 2 */ val KEY_LOCATOR_DIGEST: typings.ndnJs.signatureMod.KeyLocatorType.KEY_LOCATOR_DIGEST & Double = js.native
  }
  
  @JSImport("ndn-js/signature", "Sha256WithEcdsaSignature")
  @js.native
  open class Sha256WithEcdsaSignature () extends SignatureBaseKlVp[Sha256WithEcdsaSignature]
  
  @JSImport("ndn-js/signature", "Sha256WithRsaSignature")
  @js.native
  open class Sha256WithRsaSignature () extends SignatureBaseKlVp[Sha256WithRsaSignature]
  
  @JSImport("ndn-js/signature", "Signature")
  @js.native
  abstract class Signature () extends StObject
  
  @JSImport("ndn-js/signature", "SignatureBase")
  @js.native
  open class SignatureBase[T /* <: Signature */] () extends Signature {
    
    def getSignature(): Blob = js.native
    
    def setSignature(sigValue: Blob): Unit = js.native
  }
  
  @JSImport("ndn-js/signature", "SignatureBaseKl")
  @js.native
  open class SignatureBaseKl[T /* <: Signature */] () extends SignatureBase[T] {
    
    def getKeyLocator(): KeyLocator = js.native
    
    def setKeyLocator(): Unit = js.native
    def setKeyLocator(kl: KeyLocator): Unit = js.native
  }
  
  @JSImport("ndn-js/signature", "SignatureBaseKlVp")
  @js.native
  open class SignatureBaseKlVp[T /* <: Signature */] () extends SignatureBaseKl[T] {
    
    def getValidityPeriod(): ValidityPeriod = js.native
    
    def setValidityPeriod(): Unit = js.native
    def setValidityPeriod(validity: ValidityPeriod): Unit = js.native
  }
  
  @JSImport("ndn-js/signature", "ValidityPeriod")
  @js.native
  open class ValidityPeriod () extends StObject {
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
}
