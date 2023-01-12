package typings.nodeJose.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JWA {
  
  @JSImport("node-jose", "JWA")
  @js.native
  val ^ : js.Any = js.native
  
  inline def decrypt(alg: String, key: String, cdata: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cdata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def decrypt(alg: String, key: String, cdata: String, props: DecryptEncryptOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def decrypt(alg: String, key: String, cdata: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cdata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def decrypt(alg: String, key: String, cdata: Buffer, props: DecryptEncryptOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def decrypt(alg: String, key: Buffer, cdata: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cdata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def decrypt(alg: String, key: Buffer, cdata: String, props: DecryptEncryptOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def decrypt(alg: String, key: Buffer, cdata: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cdata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def decrypt(alg: String, key: Buffer, cdata: Buffer, props: DecryptEncryptOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], cdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def derive(alg: String, key: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def derive(alg: String, key: String, props: DeriveOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def derive(alg: String, key: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def derive(alg: String, key: Buffer, props: DeriveOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("derive")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def digest(alg: String, data: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(alg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def digest(alg: String, data: String, props: Any): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(alg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def digest(alg: String, data: Buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(alg.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def digest(alg: String, data: Buffer, props: Any): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(alg.asInstanceOf[js.Any], data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def encrypt(alg: String, key: String, pdata: String): js.Promise[EncryptReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EncryptReturn]]
  inline def encrypt(alg: String, key: String, pdata: String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EncryptReturn]]
  inline def encrypt(alg: String, key: String, pdata: Buffer): js.Promise[EncryptReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EncryptReturn]]
  inline def encrypt(alg: String, key: String, pdata: Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EncryptReturn]]
  inline def encrypt(alg: String, key: Buffer, pdata: String): js.Promise[EncryptReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EncryptReturn]]
  inline def encrypt(alg: String, key: Buffer, pdata: String, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EncryptReturn]]
  inline def encrypt(alg: String, key: Buffer, pdata: Buffer): js.Promise[EncryptReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EncryptReturn]]
  inline def encrypt(alg: String, key: Buffer, pdata: Buffer, props: DecryptEncryptOptions): js.Promise[EncryptReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EncryptReturn]]
  
  inline def sign(alg: String, key: String, pdata: String, props: SignVerifyOptions): js.Promise[SignReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignReturn]]
  inline def sign(alg: String, key: String, pdata: Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignReturn]]
  inline def sign(alg: String, key: Buffer, pdata: String, props: SignVerifyOptions): js.Promise[SignReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignReturn]]
  inline def sign(alg: String, key: Buffer, pdata: Buffer, props: SignVerifyOptions): js.Promise[SignReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SignReturn]]
  
  inline def verify(alg: String, key: String, pdata: String, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyReturn]]
  inline def verify(alg: String, key: String, pdata: String, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyReturn]]
  inline def verify(alg: String, key: String, pdata: Buffer, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyReturn]]
  inline def verify(alg: String, key: String, pdata: Buffer, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyReturn]]
  inline def verify(alg: String, key: Buffer, pdata: String, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyReturn]]
  inline def verify(alg: String, key: Buffer, pdata: String, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyReturn]]
  inline def verify(alg: String, key: Buffer, pdata: Buffer, mac: String, props: SignVerifyOptions): js.Promise[VerifyReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyReturn]]
  inline def verify(alg: String, key: Buffer, pdata: Buffer, mac: Buffer, props: SignVerifyOptions): js.Promise[VerifyReturn] = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(alg.asInstanceOf[js.Any], key.asInstanceOf[js.Any], pdata.asInstanceOf[js.Any], mac.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VerifyReturn]]
  
  trait DecryptEncryptOptions extends StObject {
    
    var aad: js.UndefOr[Buffer] = js.undefined
    
    var adata: js.UndefOr[Buffer] = js.undefined
    
    // algorithm to use in ec
    var alg: js.UndefOr[String] = js.undefined
    
    // variation of enc, probably oversight in lib code
    var apu: js.UndefOr[Buffer] = js.undefined
    
    // agreement party info used in ec
    var apv: js.UndefOr[Buffer] = js.undefined
    
    // ephemeral pub key used in ec
    var enc: js.UndefOr[String] = js.undefined
    
    var epk: js.UndefOr[Buffer] = js.undefined
    
    // Not used in encrypt
    var epu: js.UndefOr[Buffer] = js.undefined
    
    // encryption party info
    var epv: js.UndefOr[Buffer] = js.undefined
    
    var iv: js.UndefOr[Buffer] = js.undefined
    
    // encryption party info
    var kdata: js.UndefOr[Buffer] = js.undefined
    
    // Not used in encrypt
    var mac: js.UndefOr[Buffer] = js.undefined
    
    // used in pbes
    var p2c: js.UndefOr[Double] = js.undefined
    
    // agreement party info used in ec
    var p2s: js.UndefOr[Buffer] = js.undefined
    
    var tag: js.UndefOr[Buffer] = js.undefined
  }
  object DecryptEncryptOptions {
    
    inline def apply(): DecryptEncryptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecryptEncryptOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecryptEncryptOptions] (val x: Self) extends AnyVal {
      
      inline def setAad(value: Buffer): Self = StObject.set(x, "aad", value.asInstanceOf[js.Any])
      
      inline def setAadUndefined: Self = StObject.set(x, "aad", js.undefined)
      
      inline def setAdata(value: Buffer): Self = StObject.set(x, "adata", value.asInstanceOf[js.Any])
      
      inline def setAdataUndefined: Self = StObject.set(x, "adata", js.undefined)
      
      inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
      
      inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
      
      inline def setApu(value: Buffer): Self = StObject.set(x, "apu", value.asInstanceOf[js.Any])
      
      inline def setApuUndefined: Self = StObject.set(x, "apu", js.undefined)
      
      inline def setApv(value: Buffer): Self = StObject.set(x, "apv", value.asInstanceOf[js.Any])
      
      inline def setApvUndefined: Self = StObject.set(x, "apv", js.undefined)
      
      inline def setEnc(value: String): Self = StObject.set(x, "enc", value.asInstanceOf[js.Any])
      
      inline def setEncUndefined: Self = StObject.set(x, "enc", js.undefined)
      
      inline def setEpk(value: Buffer): Self = StObject.set(x, "epk", value.asInstanceOf[js.Any])
      
      inline def setEpkUndefined: Self = StObject.set(x, "epk", js.undefined)
      
      inline def setEpu(value: Buffer): Self = StObject.set(x, "epu", value.asInstanceOf[js.Any])
      
      inline def setEpuUndefined: Self = StObject.set(x, "epu", js.undefined)
      
      inline def setEpv(value: Buffer): Self = StObject.set(x, "epv", value.asInstanceOf[js.Any])
      
      inline def setEpvUndefined: Self = StObject.set(x, "epv", js.undefined)
      
      inline def setIv(value: Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setKdata(value: Buffer): Self = StObject.set(x, "kdata", value.asInstanceOf[js.Any])
      
      inline def setKdataUndefined: Self = StObject.set(x, "kdata", js.undefined)
      
      inline def setMac(value: Buffer): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      inline def setP2c(value: Double): Self = StObject.set(x, "p2c", value.asInstanceOf[js.Any])
      
      inline def setP2cUndefined: Self = StObject.set(x, "p2c", js.undefined)
      
      inline def setP2s(value: Buffer): Self = StObject.set(x, "p2s", value.asInstanceOf[js.Any])
      
      inline def setP2sUndefined: Self = StObject.set(x, "p2s", js.undefined)
      
      inline def setTag(value: Buffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait DeriveOptions extends StObject {
    
    // public key used in ecdh
    var hash: js.UndefOr[Buffer] = js.undefined
    
    // salt value used in hkdf
    var info: js.UndefOr[Buffer] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    // key length
    var otherInfo: js.UndefOr[Buffer] = js.undefined
    
    // info used in concatkdf
    var public: js.UndefOr[Buffer] = js.undefined
    
    // hash used in ecdh
    var salt: js.UndefOr[Buffer] = js.undefined
  }
  object DeriveOptions {
    
    inline def apply(): DeriveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeriveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeriveOptions] (val x: Self) extends AnyVal {
      
      inline def setHash(value: Buffer): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setInfo(value: Buffer): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setOtherInfo(value: Buffer): Self = StObject.set(x, "otherInfo", value.asInstanceOf[js.Any])
      
      inline def setOtherInfoUndefined: Self = StObject.set(x, "otherInfo", js.undefined)
      
      inline def setPublic(value: Buffer): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
      
      inline def setSalt(value: Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
  
  trait EncryptReturn extends StObject {
    
    var data: Buffer
    
    // The cipher text
    var tag: js.UndefOr[Buffer] = js.undefined
  }
  object EncryptReturn {
    
    inline def apply(data: Buffer): EncryptReturn = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptReturn] (val x: Self) extends AnyVal {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Buffer): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait SignReturn extends StObject {
    
    var data: Buffer
    
    // the data passed into the sign function
    var mac: Buffer
  }
  object SignReturn {
    
    inline def apply(data: Buffer, mac: Buffer): SignReturn = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignReturn] (val x: Self) extends AnyVal {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMac(value: Buffer): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  trait SignVerifyOptions extends StObject {
    
    var loose: js.UndefOr[Boolean] = js.undefined
  }
  object SignVerifyOptions {
    
    inline def apply(): SignVerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignVerifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignVerifyOptions] (val x: Self) extends AnyVal {
      
      inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
  
  trait VerifyReturn extends StObject {
    
    var data: Buffer
    
    // the data passed into the verify function
    var mac: Buffer
    
    // the signature for `data`
    var valid: Boolean
  }
  object VerifyReturn {
    
    inline def apply(data: Buffer, mac: Buffer, valid: Boolean): VerifyReturn = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyReturn] (val x: Self) extends AnyVal {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMac(value: Buffer): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
