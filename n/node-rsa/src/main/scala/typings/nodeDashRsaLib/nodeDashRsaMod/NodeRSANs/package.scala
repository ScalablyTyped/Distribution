package typings
package nodeDashRsaLib.nodeDashRsaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeRSANs {
  type AdvancedEncryptionScheme = AdvancedEncryptionSchemePKCS1 | AdvancedEncryptionSchemePKCS1OAEP
  type AdvancedSigningScheme = AdvancedSigningSchemePSS | AdvancedSigningSchemePKCS1
  type Data = java.lang.String | js.Object | js.Array[js.Any]
  type Encoding = nodeDashRsaLib.nodeDashRsaLibStrings.ascii | nodeDashRsaLib.nodeDashRsaLibStrings.utf8 | nodeDashRsaLib.nodeDashRsaLibStrings.utf16le | nodeDashRsaLib.nodeDashRsaLibStrings.ucs2 | nodeDashRsaLib.nodeDashRsaLibStrings.latin1 | nodeDashRsaLib.nodeDashRsaLibStrings.base64 | nodeDashRsaLib.nodeDashRsaLibStrings.hex | nodeDashRsaLib.nodeDashRsaLibStrings.binary | nodeDashRsaLib.nodeDashRsaLibStrings.buffer
  type EncryptionScheme = nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1_oaep | nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1
  type Format = FormatPem | FormatDer | FormatComponentsPrivate | FormatComponentsPublic
  type FormatComponentsPrivate = nodeDashRsaLib.nodeDashRsaLibStrings.components | nodeDashRsaLib.nodeDashRsaLibStrings.`components-pem` | nodeDashRsaLib.nodeDashRsaLibStrings.`components-der` | nodeDashRsaLib.nodeDashRsaLibStrings.`components-private` | nodeDashRsaLib.nodeDashRsaLibStrings.`components-private-pem` | nodeDashRsaLib.nodeDashRsaLibStrings.`components-private-der`
  type FormatComponentsPublic = nodeDashRsaLib.nodeDashRsaLibStrings.`components-public` | nodeDashRsaLib.nodeDashRsaLibStrings.`components-public-pem` | nodeDashRsaLib.nodeDashRsaLibStrings.`components-public-der`
  type FormatDer = nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-der` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-private-der` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-public-der` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs8-der` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs8-private-der` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs8-public-der`
  type FormatPem = nodeDashRsaLib.nodeDashRsaLibStrings.`private` | nodeDashRsaLib.nodeDashRsaLibStrings.public | nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1 | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-pem` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-private` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-private-pem` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-public` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-public-pem` | nodeDashRsaLib.nodeDashRsaLibStrings.pkcs8 | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs8-pem` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs8-private` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs8-private-pem` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs8-public` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs8-public-pem`
  type HashingAlgorithm = nodeDashRsaLib.nodeDashRsaLibStrings.ripemd160 | nodeDashRsaLib.nodeDashRsaLibStrings.md4 | nodeDashRsaLib.nodeDashRsaLibStrings.md5 | nodeDashRsaLib.nodeDashRsaLibStrings.sha | nodeDashRsaLib.nodeDashRsaLibStrings.sha1 | nodeDashRsaLib.nodeDashRsaLibStrings.sha224 | nodeDashRsaLib.nodeDashRsaLibStrings.sha256 | nodeDashRsaLib.nodeDashRsaLibStrings.sha384 | nodeDashRsaLib.nodeDashRsaLibStrings.sha512
  type Key = java.lang.String | nodeLib.Buffer | KeyComponentsPrivate | KeyComponentsPublic
  type SigningScheme = nodeDashRsaLib.nodeDashRsaLibStrings.pkcs1 | nodeDashRsaLib.nodeDashRsaLibStrings.pss
  type SigningSchemeHash = nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-ripemd160` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-md4` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-md5` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-sha` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-sha1` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-sha224` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-sha256` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-sha384` | nodeDashRsaLib.nodeDashRsaLibStrings.`pkcs1-sha512` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-ripemd160` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-md4` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-md5` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-sha` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-sha1` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-sha224` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-sha256` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-sha384` | nodeDashRsaLib.nodeDashRsaLibStrings.`pss-sha512`
}
