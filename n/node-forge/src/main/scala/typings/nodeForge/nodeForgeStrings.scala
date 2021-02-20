package typings.nodeForge

import typings.nodeForge.mod.Encoding
import typings.nodeForge.mod.cipher.Algorithm
import typings.nodeForge.mod.pki.rsa._EncryptionScheme
import typings.nodeForge.mod.pki.rsa._SignatureScheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeForgeStrings {
  
  @js.native
  sealed trait `3DES-CBC` extends Algorithm
  @scala.inline
  def `3DES-CBC`: `3DES-CBC` = "3DES-CBC".asInstanceOf[`3DES-CBC`]
  
  @js.native
  sealed trait `3DES-ECB` extends Algorithm
  @scala.inline
  def `3DES-ECB`: `3DES-ECB` = "3DES-ECB".asInstanceOf[`3DES-ECB`]
  
  @js.native
  sealed trait `3des` extends StObject
  @scala.inline
  def `3des`: `3des` = "3des".asInstanceOf[`3des`]
  
  @js.native
  sealed trait `AES-CBC` extends Algorithm
  @scala.inline
  def `AES-CBC`: `AES-CBC` = "AES-CBC".asInstanceOf[`AES-CBC`]
  
  @js.native
  sealed trait `AES-CFB` extends Algorithm
  @scala.inline
  def `AES-CFB`: `AES-CFB` = "AES-CFB".asInstanceOf[`AES-CFB`]
  
  @js.native
  sealed trait `AES-CTR` extends Algorithm
  @scala.inline
  def `AES-CTR`: `AES-CTR` = "AES-CTR".asInstanceOf[`AES-CTR`]
  
  @js.native
  sealed trait `AES-ECB` extends Algorithm
  @scala.inline
  def `AES-ECB`: `AES-ECB` = "AES-ECB".asInstanceOf[`AES-ECB`]
  
  @js.native
  sealed trait `AES-GCM` extends Algorithm
  @scala.inline
  def `AES-GCM`: `AES-GCM` = "AES-GCM".asInstanceOf[`AES-GCM`]
  
  @js.native
  sealed trait `AES-OFB` extends Algorithm
  @scala.inline
  def `AES-OFB`: `AES-OFB` = "AES-OFB".asInstanceOf[`AES-OFB`]
  
  @js.native
  sealed trait `DES-CBC` extends Algorithm
  @scala.inline
  def `DES-CBC`: `DES-CBC` = "DES-CBC".asInstanceOf[`DES-CBC`]
  
  @js.native
  sealed trait `DES-ECB` extends Algorithm
  @scala.inline
  def `DES-ECB`: `DES-ECB` = "DES-ECB".asInstanceOf[`DES-ECB`]
  
  @js.native
  sealed trait NONE
    extends _EncryptionScheme
       with _SignatureScheme
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait RAW extends _EncryptionScheme
  @scala.inline
  def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @js.native
  sealed trait `RSA-OAEP` extends _EncryptionScheme
  @scala.inline
  def `RSA-OAEP`: `RSA-OAEP` = "RSA-OAEP".asInstanceOf[`RSA-OAEP`]
  
  @js.native
  sealed trait `RSAES-PKCS1-V1_5` extends _EncryptionScheme
  @scala.inline
  def `RSAES-PKCS1-V1_5`: `RSAES-PKCS1-V1_5` = "RSAES-PKCS1-V1_5".asInstanceOf[`RSAES-PKCS1-V1_5`]
  
  @js.native
  sealed trait RSAPublicKey extends StObject
  @scala.inline
  def RSAPublicKey: RSAPublicKey = "RSAPublicKey".asInstanceOf[RSAPublicKey]
  
  @js.native
  sealed trait `RSASSA-PKCS1-V1_5` extends _SignatureScheme
  @scala.inline
  def `RSASSA-PKCS1-V1_5`: `RSASSA-PKCS1-V1_5` = "RSASSA-PKCS1-V1_5".asInstanceOf[`RSASSA-PKCS1-V1_5`]
  
  @js.native
  sealed trait SubjectPublicKeyInfo extends StObject
  @scala.inline
  def SubjectPublicKeyInfo: SubjectPublicKeyInfo = "SubjectPublicKeyInfo".asInstanceOf[SubjectPublicKeyInfo]
  
  @js.native
  sealed trait aes128 extends StObject
  @scala.inline
  def aes128: aes128 = "aes128".asInstanceOf[aes128]
  
  @js.native
  sealed trait aes192 extends StObject
  @scala.inline
  def aes192: aes192 = "aes192".asInstanceOf[aes192]
  
  @js.native
  sealed trait aes256 extends StObject
  @scala.inline
  def aes256: aes256 = "aes256".asInstanceOf[aes256]
  
  @js.native
  sealed trait binary extends StObject
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait client extends StObject
  @scala.inline
  def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait hex extends StObject
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait md5
    extends typings.nodeForge.mod.hmac.Algorithm
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait raw_ extends Encoding
  @scala.inline
  def raw_ : raw_ = "raw".asInstanceOf[raw_]
  
  @js.native
  sealed trait server extends StObject
  @scala.inline
  def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait sha1
    extends typings.nodeForge.mod.hmac.Algorithm
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha224 extends StObject
  @scala.inline
  def sha224: sha224 = "sha224".asInstanceOf[sha224]
  
  @js.native
  sealed trait sha256
    extends typings.nodeForge.mod.hmac.Algorithm
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha384 extends StObject
  @scala.inline
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  
  @js.native
  sealed trait sha512 extends StObject
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @js.native
  sealed trait utf8 extends Encoding
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
