package typings.nodeForge

import typings.nodeForge.mod.Encoding
import typings.nodeForge.mod.cipher.Algorithm
import typings.nodeForge.mod.pki.rsa._EncryptionScheme
import typings.nodeForge.mod.pki.rsa._SignatureScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeForgeStrings {
  
  @js.native
  sealed trait `3DES-CBC`
    extends StObject
       with Algorithm
  inline def `3DES-CBC`: `3DES-CBC` = "3DES-CBC".asInstanceOf[`3DES-CBC`]
  
  @js.native
  sealed trait `3DES-ECB`
    extends StObject
       with Algorithm
  inline def `3DES-ECB`: `3DES-ECB` = "3DES-ECB".asInstanceOf[`3DES-ECB`]
  
  @js.native
  sealed trait `3des` extends StObject
  inline def `3des`: `3des` = "3des".asInstanceOf[`3des`]
  
  @js.native
  sealed trait `AES-CBC`
    extends StObject
       with Algorithm
  inline def `AES-CBC`: `AES-CBC` = "AES-CBC".asInstanceOf[`AES-CBC`]
  
  @js.native
  sealed trait `AES-CFB`
    extends StObject
       with Algorithm
  inline def `AES-CFB`: `AES-CFB` = "AES-CFB".asInstanceOf[`AES-CFB`]
  
  @js.native
  sealed trait `AES-CTR`
    extends StObject
       with Algorithm
  inline def `AES-CTR`: `AES-CTR` = "AES-CTR".asInstanceOf[`AES-CTR`]
  
  @js.native
  sealed trait `AES-ECB`
    extends StObject
       with Algorithm
  inline def `AES-ECB`: `AES-ECB` = "AES-ECB".asInstanceOf[`AES-ECB`]
  
  @js.native
  sealed trait `AES-GCM`
    extends StObject
       with Algorithm
  inline def `AES-GCM`: `AES-GCM` = "AES-GCM".asInstanceOf[`AES-GCM`]
  
  @js.native
  sealed trait `AES-OFB`
    extends StObject
       with Algorithm
  inline def `AES-OFB`: `AES-OFB` = "AES-OFB".asInstanceOf[`AES-OFB`]
  
  @js.native
  sealed trait `DES-CBC`
    extends StObject
       with Algorithm
  inline def `DES-CBC`: `DES-CBC` = "DES-CBC".asInstanceOf[`DES-CBC`]
  
  @js.native
  sealed trait `DES-ECB`
    extends StObject
       with Algorithm
  inline def `DES-ECB`: `DES-ECB` = "DES-ECB".asInstanceOf[`DES-ECB`]
  
  @js.native
  sealed trait NONE
    extends StObject
       with _EncryptionScheme
       with _SignatureScheme
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait RAW
    extends StObject
       with _EncryptionScheme
  inline def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @js.native
  sealed trait `RSA-OAEP`
    extends StObject
       with _EncryptionScheme
  inline def `RSA-OAEP`: `RSA-OAEP` = "RSA-OAEP".asInstanceOf[`RSA-OAEP`]
  
  @js.native
  sealed trait `RSAES-PKCS1-V1_5`
    extends StObject
       with _EncryptionScheme
  inline def `RSAES-PKCS1-V1_5`: `RSAES-PKCS1-V1_5` = "RSAES-PKCS1-V1_5".asInstanceOf[`RSAES-PKCS1-V1_5`]
  
  @js.native
  sealed trait RSAPublicKey extends StObject
  inline def RSAPublicKey: RSAPublicKey = "RSAPublicKey".asInstanceOf[RSAPublicKey]
  
  @js.native
  sealed trait `RSASSA-PKCS1-V1_5`
    extends StObject
       with _SignatureScheme
  inline def `RSASSA-PKCS1-V1_5`: `RSASSA-PKCS1-V1_5` = "RSASSA-PKCS1-V1_5".asInstanceOf[`RSASSA-PKCS1-V1_5`]
  
  @js.native
  sealed trait SubjectPublicKeyInfo extends StObject
  inline def SubjectPublicKeyInfo: SubjectPublicKeyInfo = "SubjectPublicKeyInfo".asInstanceOf[SubjectPublicKeyInfo]
  
  @js.native
  sealed trait aes128 extends StObject
  inline def aes128: aes128 = "aes128".asInstanceOf[aes128]
  
  @js.native
  sealed trait aes192 extends StObject
  inline def aes192: aes192 = "aes192".asInstanceOf[aes192]
  
  @js.native
  sealed trait aes256 extends StObject
  inline def aes256: aes256 = "aes256".asInstanceOf[aes256]
  
  @js.native
  sealed trait binary extends StObject
  inline def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait client extends StObject
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait hex extends StObject
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait md5
    extends StObject
       with typings.nodeForge.mod.hmac.Algorithm
  inline def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait raw_
    extends StObject
       with Encoding
  inline def raw_ : raw_ = "raw".asInstanceOf[raw_]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait sha1
    extends StObject
       with typings.nodeForge.mod.hmac.Algorithm
  inline def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha224 extends StObject
  inline def sha224: sha224 = "sha224".asInstanceOf[sha224]
  
  @js.native
  sealed trait sha256
    extends StObject
       with typings.nodeForge.mod.hmac.Algorithm
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha384 extends StObject
  inline def sha384: sha384 = "sha384".asInstanceOf[sha384]
  
  @js.native
  sealed trait sha512 extends StObject
  inline def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @js.native
  sealed trait utf8
    extends StObject
       with Encoding
  inline def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
