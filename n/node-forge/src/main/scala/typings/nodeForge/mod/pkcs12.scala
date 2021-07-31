package typings.nodeForge.mod

import typings.nodeForge.anon.Algorithm
import typings.nodeForge.anon.Dictkey
import typings.nodeForge.anon.Encrypted
import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.md.MessageDigest
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.pki.PrivateKey
import typings.nodeForge.mod.util.ByteBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs12 {
  
  @JSImport("node-forge", "pkcs12")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generateKey(password: String, salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], id.asInstanceOf[js.Any], iter.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def generateKey(password: String, salt: ByteBuffer, id: Byte, iter: Double, n: Double, md: MessageDigest): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], id.asInstanceOf[js.Any], iter.asInstanceOf[js.Any], n.asInstanceOf[js.Any], md.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def generateKey(password: Null, salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], id.asInstanceOf[js.Any], iter.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def generateKey(password: Null, salt: ByteBuffer, id: Byte, iter: Double, n: Double, md: MessageDigest): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], id.asInstanceOf[js.Any], iter.asInstanceOf[js.Any], n.asInstanceOf[js.Any], md.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def generateKey(password: Unit, salt: ByteBuffer, id: Byte, iter: Double, n: Double): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], id.asInstanceOf[js.Any], iter.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  @scala.inline
  def generateKey(password: Unit, salt: ByteBuffer, id: Byte, iter: Double, n: Double, md: MessageDigest): ByteBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("generateKey")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], id.asInstanceOf[js.Any], iter.asInstanceOf[js.Any], n.asInstanceOf[js.Any], md.asInstanceOf[js.Any])).asInstanceOf[ByteBuffer]
  
  @scala.inline
  def pkcs12FromAsn1(obj: js.Any): Pkcs12Pfx = ^.asInstanceOf[js.Dynamic].applyDynamic("pkcs12FromAsn1")(obj.asInstanceOf[js.Any]).asInstanceOf[Pkcs12Pfx]
  @scala.inline
  def pkcs12FromAsn1(obj: js.Any, password: String): Pkcs12Pfx = (^.asInstanceOf[js.Dynamic].applyDynamic("pkcs12FromAsn1")(obj.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Pkcs12Pfx]
  @scala.inline
  def pkcs12FromAsn1(obj: js.Any, strict: Boolean): Pkcs12Pfx = (^.asInstanceOf[js.Dynamic].applyDynamic("pkcs12FromAsn1")(obj.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Pkcs12Pfx]
  @scala.inline
  def pkcs12FromAsn1(obj: js.Any, strict: Boolean, password: String): Pkcs12Pfx = (^.asInstanceOf[js.Dynamic].applyDynamic("pkcs12FromAsn1")(obj.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Pkcs12Pfx]
  @scala.inline
  def pkcs12FromAsn1(obj: js.Any, strict: Unit, password: String): Pkcs12Pfx = (^.asInstanceOf[js.Dynamic].applyDynamic("pkcs12FromAsn1")(obj.asInstanceOf[js.Any], strict.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Pkcs12Pfx]
  
  @scala.inline
  def toPkcs12Asn1(key: PrivateKey, cert: js.Array[Certificate]): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("toPkcs12Asn1")(key.asInstanceOf[js.Any], cert.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  @scala.inline
  def toPkcs12Asn1(key: PrivateKey, cert: js.Array[Certificate], password: String): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("toPkcs12Asn1")(key.asInstanceOf[js.Any], cert.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  @scala.inline
  def toPkcs12Asn1(key: PrivateKey, cert: js.Array[Certificate], password: String, options: Algorithm): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("toPkcs12Asn1")(key.asInstanceOf[js.Any], cert.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  @scala.inline
  def toPkcs12Asn1(key: PrivateKey, cert: js.Array[Certificate], password: Null, options: Algorithm): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("toPkcs12Asn1")(key.asInstanceOf[js.Any], cert.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  @scala.inline
  def toPkcs12Asn1(key: PrivateKey, cert: Certificate): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("toPkcs12Asn1")(key.asInstanceOf[js.Any], cert.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  @scala.inline
  def toPkcs12Asn1(key: PrivateKey, cert: Certificate, password: String): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("toPkcs12Asn1")(key.asInstanceOf[js.Any], cert.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  @scala.inline
  def toPkcs12Asn1(key: PrivateKey, cert: Certificate, password: String, options: Algorithm): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("toPkcs12Asn1")(key.asInstanceOf[js.Any], cert.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  @scala.inline
  def toPkcs12Asn1(key: PrivateKey, cert: Certificate, password: Null, options: Algorithm): Asn1 = (^.asInstanceOf[js.Dynamic].applyDynamic("toPkcs12Asn1")(key.asInstanceOf[js.Any], cert.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Asn1]
  
  trait Bag extends StObject {
    
    var asn1: Asn1
    
    var attributes: js.Any
    
    var cert: js.UndefOr[Certificate] = js.undefined
    
    var key: js.UndefOr[PrivateKey] = js.undefined
    
    var `type`: String
  }
  object Bag {
    
    @scala.inline
    def apply(asn1: Asn1, attributes: js.Any, `type`: String): Bag = {
      val __obj = js.Dynamic.literal(asn1 = asn1.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bag]
    }
    
    @scala.inline
    implicit class BagMutableBuilder[Self <: Bag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsn1(value: Asn1): Self = StObject.set(x, "asn1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCert(value: Certificate): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setKey(value: PrivateKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BagsFilter extends StObject {
    
    var bagType: js.UndefOr[String] = js.undefined
    
    var friendlyName: js.UndefOr[String] = js.undefined
    
    var localKeyId: js.UndefOr[String] = js.undefined
    
    var localKeyIdHex: js.UndefOr[String] = js.undefined
  }
  object BagsFilter {
    
    @scala.inline
    def apply(): BagsFilter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BagsFilter]
    }
    
    @scala.inline
    implicit class BagsFilterMutableBuilder[Self <: BagsFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBagType(value: String): Self = StObject.set(x, "bagType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBagTypeUndefined: Self = StObject.set(x, "bagType", js.undefined)
      
      @scala.inline
      def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
      
      @scala.inline
      def setLocalKeyId(value: String): Self = StObject.set(x, "localKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalKeyIdHex(value: String): Self = StObject.set(x, "localKeyIdHex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalKeyIdHexUndefined: Self = StObject.set(x, "localKeyIdHex", js.undefined)
      
      @scala.inline
      def setLocalKeyIdUndefined: Self = StObject.set(x, "localKeyId", js.undefined)
    }
  }
  
  trait Pkcs12Pfx extends StObject {
    
    def getBags(filter: BagsFilter): Dictkey
    
    def getBagsByFriendlyName(fiendlyName: String, bagType: String): js.Array[Bag]
    
    def getBagsByLocalKeyId(localKeyId: String, bagType: String): js.Array[Bag]
    
    var safeContents: js.Array[Encrypted]
    
    var version: String
  }
  object Pkcs12Pfx {
    
    @scala.inline
    def apply(
      getBags: BagsFilter => Dictkey,
      getBagsByFriendlyName: (String, String) => js.Array[Bag],
      getBagsByLocalKeyId: (String, String) => js.Array[Bag],
      safeContents: js.Array[Encrypted],
      version: String
    ): Pkcs12Pfx = {
      val __obj = js.Dynamic.literal(getBags = js.Any.fromFunction1(getBags), getBagsByFriendlyName = js.Any.fromFunction2(getBagsByFriendlyName), getBagsByLocalKeyId = js.Any.fromFunction2(getBagsByLocalKeyId), safeContents = safeContents.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pkcs12Pfx]
    }
    
    @scala.inline
    implicit class Pkcs12PfxMutableBuilder[Self <: Pkcs12Pfx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetBags(value: BagsFilter => Dictkey): Self = StObject.set(x, "getBags", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBagsByFriendlyName(value: (String, String) => js.Array[Bag]): Self = StObject.set(x, "getBagsByFriendlyName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetBagsByLocalKeyId(value: (String, String) => js.Array[Bag]): Self = StObject.set(x, "getBagsByLocalKeyId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSafeContents(value: js.Array[Encrypted]): Self = StObject.set(x, "safeContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeContentsVarargs(value: Encrypted*): Self = StObject.set(x, "safeContents", js.Array(value :_*))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
