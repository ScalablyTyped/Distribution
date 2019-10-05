package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.Encoding
import typings.nodeDashForge.nodeDashForgeMod.cipher.Algorithm
import typings.nodeDashForge.nodeDashForgeMod.pki.rsa._EncryptionScheme
import typings.nodeDashForge.nodeDashForgeMod.pki.rsa._SignatureScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeDashForgeStrings {
  @js.native
  sealed trait `3DES-CBC` extends Algorithm
  
  @js.native
  sealed trait `3DES-ECB` extends Algorithm
  
  @js.native
  sealed trait `3des` extends js.Object
  
  @js.native
  sealed trait `AES-CBC` extends Algorithm
  
  @js.native
  sealed trait `AES-CFB` extends Algorithm
  
  @js.native
  sealed trait `AES-CTR` extends Algorithm
  
  @js.native
  sealed trait `AES-ECB` extends Algorithm
  
  @js.native
  sealed trait `AES-GCM` extends Algorithm
  
  @js.native
  sealed trait `AES-OFB` extends Algorithm
  
  @js.native
  sealed trait `DES-CBC` extends Algorithm
  
  @js.native
  sealed trait `DES-ECB` extends Algorithm
  
  @js.native
  sealed trait NONE
    extends _EncryptionScheme
       with _SignatureScheme
  
  @js.native
  sealed trait RAW extends _EncryptionScheme
  
  @js.native
  sealed trait `RSA-OAEP` extends _EncryptionScheme
  
  @js.native
  sealed trait `RSAES-PKCS1-V1_5` extends _EncryptionScheme
  
  @js.native
  sealed trait `RSASSA-PKCS1-V1_5` extends _SignatureScheme
  
  @js.native
  sealed trait aes128 extends js.Object
  
  @js.native
  sealed trait aes192 extends js.Object
  
  @js.native
  sealed trait aes256 extends js.Object
  
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait client extends js.Object
  
  @js.native
  sealed trait hex extends js.Object
  
  @js.native
  sealed trait md5
    extends typings.nodeDashForge.nodeDashForgeMod.hmac.Algorithm
  
  @js.native
  sealed trait raw extends Encoding
  
  @js.native
  sealed trait server extends js.Object
  
  @js.native
  sealed trait sha1
    extends typings.nodeDashForge.nodeDashForgeMod.hmac.Algorithm
  
  @js.native
  sealed trait sha224 extends js.Object
  
  @js.native
  sealed trait sha256
    extends typings.nodeDashForge.nodeDashForgeMod.hmac.Algorithm
  
  @js.native
  sealed trait sha384 extends js.Object
  
  @js.native
  sealed trait sha512 extends js.Object
  
  @js.native
  sealed trait utf8 extends Encoding
  
  @scala.inline
  def `3DES-CBC`: `3DES-CBC` = "3DES-CBC".asInstanceOf[`3DES-CBC`]
  @scala.inline
  def `3DES-ECB`: `3DES-ECB` = "3DES-ECB".asInstanceOf[`3DES-ECB`]
  @scala.inline
  def `3des`: `3des` = "3des".asInstanceOf[`3des`]
  @scala.inline
  def `AES-CBC`: `AES-CBC` = "AES-CBC".asInstanceOf[`AES-CBC`]
  @scala.inline
  def `AES-CFB`: `AES-CFB` = "AES-CFB".asInstanceOf[`AES-CFB`]
  @scala.inline
  def `AES-CTR`: `AES-CTR` = "AES-CTR".asInstanceOf[`AES-CTR`]
  @scala.inline
  def `AES-ECB`: `AES-ECB` = "AES-ECB".asInstanceOf[`AES-ECB`]
  @scala.inline
  def `AES-GCM`: `AES-GCM` = "AES-GCM".asInstanceOf[`AES-GCM`]
  @scala.inline
  def `AES-OFB`: `AES-OFB` = "AES-OFB".asInstanceOf[`AES-OFB`]
  @scala.inline
  def `DES-CBC`: `DES-CBC` = "DES-CBC".asInstanceOf[`DES-CBC`]
  @scala.inline
  def `DES-ECB`: `DES-ECB` = "DES-ECB".asInstanceOf[`DES-ECB`]
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  @scala.inline
  def RAW: RAW = "RAW".asInstanceOf[RAW]
  @scala.inline
  def `RSA-OAEP`: `RSA-OAEP` = "RSA-OAEP".asInstanceOf[`RSA-OAEP`]
  @scala.inline
  def `RSAES-PKCS1-V1_5`: `RSAES-PKCS1-V1_5` = "RSAES-PKCS1-V1_5".asInstanceOf[`RSAES-PKCS1-V1_5`]
  @scala.inline
  def `RSASSA-PKCS1-V1_5`: `RSASSA-PKCS1-V1_5` = "RSASSA-PKCS1-V1_5".asInstanceOf[`RSASSA-PKCS1-V1_5`]
  @scala.inline
  def aes128: aes128 = "aes128".asInstanceOf[aes128]
  @scala.inline
  def aes192: aes192 = "aes192".asInstanceOf[aes192]
  @scala.inline
  def aes256: aes256 = "aes256".asInstanceOf[aes256]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def client: client = "client".asInstanceOf[client]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  @scala.inline
  def server: server = "server".asInstanceOf[server]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha224: sha224 = "sha224".asInstanceOf[sha224]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  @scala.inline
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

