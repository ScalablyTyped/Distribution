package typings
package nodeDashRsaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeDashRsaLibStrings {
  @js.native
  sealed trait ascii
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @js.native
  sealed trait base64
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @js.native
  sealed trait binary
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @js.native
  sealed trait browser extends js.Object
  
  @js.native
  sealed trait buffer
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @js.native
  sealed trait components
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPrivate
  
  @js.native
  sealed trait `components-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPrivate
  
  @js.native
  sealed trait `components-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPrivate
  
  @js.native
  sealed trait `components-private`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPrivate
  
  @js.native
  sealed trait `components-private-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPrivate
  
  @js.native
  sealed trait `components-private-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPrivate
  
  @js.native
  sealed trait `components-public`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPublic
  
  @js.native
  sealed trait `components-public-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPublic
  
  @js.native
  sealed trait `components-public-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatComponentsPublic
  
  @js.native
  sealed trait hex
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait latin1
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @js.native
  sealed trait md4
    extends nodeDashRsaLib.nodeDashRsaMod.HashingAlgorithm
  
  @js.native
  sealed trait md5
    extends nodeDashRsaLib.nodeDashRsaMod.HashingAlgorithm
  
  @js.native
  sealed trait node extends js.Object
  
  @js.native
  sealed trait pkcs1
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
       with nodeDashRsaLib.nodeDashRsaMod.EncryptionScheme
       with nodeDashRsaLib.nodeDashRsaMod.SigningScheme
  
  @js.native
  sealed trait `pkcs1-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatDer
  
  @js.native
  sealed trait `pkcs1-md4`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pkcs1-md5`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pkcs1-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs1-private`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs1-private-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatDer
  
  @js.native
  sealed trait `pkcs1-private-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs1-public`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs1-public-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatDer
  
  @js.native
  sealed trait `pkcs1-public-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs1-ripemd160`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pkcs1-sha`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pkcs1-sha1`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pkcs1-sha224`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pkcs1-sha256`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pkcs1-sha384`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pkcs1-sha512`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait pkcs1_oaep
    extends nodeDashRsaLib.nodeDashRsaMod.EncryptionScheme
  
  @js.native
  sealed trait pkcs8
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs8-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatDer
  
  @js.native
  sealed trait `pkcs8-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs8-private`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs8-private-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatDer
  
  @js.native
  sealed trait `pkcs8-private-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs8-public`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `pkcs8-public-der`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatDer
  
  @js.native
  sealed trait `pkcs8-public-pem`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait `private`
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait pss
    extends nodeDashRsaLib.nodeDashRsaMod.SigningScheme
  
  @js.native
  sealed trait `pss-md4`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pss-md5`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pss-ripemd160`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pss-sha`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pss-sha1`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pss-sha224`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pss-sha256`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pss-sha384`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait `pss-sha512`
    extends nodeDashRsaLib.nodeDashRsaMod.SigningSchemeHash
  
  @js.native
  sealed trait public
    extends nodeDashRsaLib.nodeDashRsaMod.FormatPem
  
  @js.native
  sealed trait ripemd160
    extends nodeDashRsaLib.nodeDashRsaMod.HashingAlgorithm
  
  @js.native
  sealed trait sha1
    extends nodeDashRsaLib.nodeDashRsaMod.HashingAlgorithm
  
  @js.native
  sealed trait sha224
    extends nodeDashRsaLib.nodeDashRsaMod.HashingAlgorithm
  
  @js.native
  sealed trait sha256
    extends nodeDashRsaLib.nodeDashRsaMod.HashingAlgorithm
  
  @js.native
  sealed trait sha384
    extends nodeDashRsaLib.nodeDashRsaMod.HashingAlgorithm
  
  @js.native
  sealed trait sha512
    extends nodeDashRsaLib.nodeDashRsaMod.HashingAlgorithm
  
  @js.native
  sealed trait ucs2
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @js.native
  sealed trait utf16le
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @js.native
  sealed trait utf8
    extends nodeDashRsaLib.nodeDashRsaMod.Encoding
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def components: components = "components".asInstanceOf[components]
  @scala.inline
  def `components-der`: `components-der` = "components-der".asInstanceOf[`components-der`]
  @scala.inline
  def `components-pem`: `components-pem` = "components-pem".asInstanceOf[`components-pem`]
  @scala.inline
  def `components-private`: `components-private` = "components-private".asInstanceOf[`components-private`]
  @scala.inline
  def `components-private-der`: `components-private-der` = "components-private-der".asInstanceOf[`components-private-der`]
  @scala.inline
  def `components-private-pem`: `components-private-pem` = "components-private-pem".asInstanceOf[`components-private-pem`]
  @scala.inline
  def `components-public`: `components-public` = "components-public".asInstanceOf[`components-public`]
  @scala.inline
  def `components-public-der`: `components-public-der` = "components-public-der".asInstanceOf[`components-public-der`]
  @scala.inline
  def `components-public-pem`: `components-public-pem` = "components-public-pem".asInstanceOf[`components-public-pem`]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  @scala.inline
  def md4: md4 = "md4".asInstanceOf[md4]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  @scala.inline
  def pkcs1: pkcs1 = "pkcs1".asInstanceOf[pkcs1]
  @scala.inline
  def `pkcs1-der`: `pkcs1-der` = "pkcs1-der".asInstanceOf[`pkcs1-der`]
  @scala.inline
  def `pkcs1-md4`: `pkcs1-md4` = "pkcs1-md4".asInstanceOf[`pkcs1-md4`]
  @scala.inline
  def `pkcs1-md5`: `pkcs1-md5` = "pkcs1-md5".asInstanceOf[`pkcs1-md5`]
  @scala.inline
  def `pkcs1-pem`: `pkcs1-pem` = "pkcs1-pem".asInstanceOf[`pkcs1-pem`]
  @scala.inline
  def `pkcs1-private`: `pkcs1-private` = "pkcs1-private".asInstanceOf[`pkcs1-private`]
  @scala.inline
  def `pkcs1-private-der`: `pkcs1-private-der` = "pkcs1-private-der".asInstanceOf[`pkcs1-private-der`]
  @scala.inline
  def `pkcs1-private-pem`: `pkcs1-private-pem` = "pkcs1-private-pem".asInstanceOf[`pkcs1-private-pem`]
  @scala.inline
  def `pkcs1-public`: `pkcs1-public` = "pkcs1-public".asInstanceOf[`pkcs1-public`]
  @scala.inline
  def `pkcs1-public-der`: `pkcs1-public-der` = "pkcs1-public-der".asInstanceOf[`pkcs1-public-der`]
  @scala.inline
  def `pkcs1-public-pem`: `pkcs1-public-pem` = "pkcs1-public-pem".asInstanceOf[`pkcs1-public-pem`]
  @scala.inline
  def `pkcs1-ripemd160`: `pkcs1-ripemd160` = "pkcs1-ripemd160".asInstanceOf[`pkcs1-ripemd160`]
  @scala.inline
  def `pkcs1-sha`: `pkcs1-sha` = "pkcs1-sha".asInstanceOf[`pkcs1-sha`]
  @scala.inline
  def `pkcs1-sha1`: `pkcs1-sha1` = "pkcs1-sha1".asInstanceOf[`pkcs1-sha1`]
  @scala.inline
  def `pkcs1-sha224`: `pkcs1-sha224` = "pkcs1-sha224".asInstanceOf[`pkcs1-sha224`]
  @scala.inline
  def `pkcs1-sha256`: `pkcs1-sha256` = "pkcs1-sha256".asInstanceOf[`pkcs1-sha256`]
  @scala.inline
  def `pkcs1-sha384`: `pkcs1-sha384` = "pkcs1-sha384".asInstanceOf[`pkcs1-sha384`]
  @scala.inline
  def `pkcs1-sha512`: `pkcs1-sha512` = "pkcs1-sha512".asInstanceOf[`pkcs1-sha512`]
  @scala.inline
  def pkcs1_oaep: pkcs1_oaep = "pkcs1_oaep".asInstanceOf[pkcs1_oaep]
  @scala.inline
  def pkcs8: pkcs8 = "pkcs8".asInstanceOf[pkcs8]
  @scala.inline
  def `pkcs8-der`: `pkcs8-der` = "pkcs8-der".asInstanceOf[`pkcs8-der`]
  @scala.inline
  def `pkcs8-pem`: `pkcs8-pem` = "pkcs8-pem".asInstanceOf[`pkcs8-pem`]
  @scala.inline
  def `pkcs8-private`: `pkcs8-private` = "pkcs8-private".asInstanceOf[`pkcs8-private`]
  @scala.inline
  def `pkcs8-private-der`: `pkcs8-private-der` = "pkcs8-private-der".asInstanceOf[`pkcs8-private-der`]
  @scala.inline
  def `pkcs8-private-pem`: `pkcs8-private-pem` = "pkcs8-private-pem".asInstanceOf[`pkcs8-private-pem`]
  @scala.inline
  def `pkcs8-public`: `pkcs8-public` = "pkcs8-public".asInstanceOf[`pkcs8-public`]
  @scala.inline
  def `pkcs8-public-der`: `pkcs8-public-der` = "pkcs8-public-der".asInstanceOf[`pkcs8-public-der`]
  @scala.inline
  def `pkcs8-public-pem`: `pkcs8-public-pem` = "pkcs8-public-pem".asInstanceOf[`pkcs8-public-pem`]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def pss: pss = "pss".asInstanceOf[pss]
  @scala.inline
  def `pss-md4`: `pss-md4` = "pss-md4".asInstanceOf[`pss-md4`]
  @scala.inline
  def `pss-md5`: `pss-md5` = "pss-md5".asInstanceOf[`pss-md5`]
  @scala.inline
  def `pss-ripemd160`: `pss-ripemd160` = "pss-ripemd160".asInstanceOf[`pss-ripemd160`]
  @scala.inline
  def `pss-sha`: `pss-sha` = "pss-sha".asInstanceOf[`pss-sha`]
  @scala.inline
  def `pss-sha1`: `pss-sha1` = "pss-sha1".asInstanceOf[`pss-sha1`]
  @scala.inline
  def `pss-sha224`: `pss-sha224` = "pss-sha224".asInstanceOf[`pss-sha224`]
  @scala.inline
  def `pss-sha256`: `pss-sha256` = "pss-sha256".asInstanceOf[`pss-sha256`]
  @scala.inline
  def `pss-sha384`: `pss-sha384` = "pss-sha384".asInstanceOf[`pss-sha384`]
  @scala.inline
  def `pss-sha512`: `pss-sha512` = "pss-sha512".asInstanceOf[`pss-sha512`]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def ripemd160: ripemd160 = "ripemd160".asInstanceOf[ripemd160]
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
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

