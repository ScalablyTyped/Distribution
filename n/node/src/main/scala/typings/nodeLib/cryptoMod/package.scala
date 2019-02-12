package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type Binary = nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView
  type BinaryLike = java.lang.String | Binary
  type CipherCCMTypes = nodeLib.nodeLibStrings.`aes-128-ccm` | nodeLib.nodeLibStrings.`aes-192-ccm` | nodeLib.nodeLibStrings.`aes-256-ccm`
  type CipherGCMTypes = nodeLib.nodeLibStrings.`aes-128-gcm` | nodeLib.nodeLibStrings.`aes-192-gcm` | nodeLib.nodeLibStrings.`aes-256-gcm`
  type CipherKey = BinaryLike | KeyObject
  type ECDHKeyFormat = nodeLib.nodeLibStrings.compressed | nodeLib.nodeLibStrings.uncompressed | nodeLib.nodeLibStrings.hybrid
  type HexBase64BinaryEncoding = nodeLib.nodeLibStrings.binary | nodeLib.nodeLibStrings.base64 | nodeLib.nodeLibStrings.hex
  type HexBase64Latin1Encoding = nodeLib.nodeLibStrings.latin1 | nodeLib.nodeLibStrings.hex | nodeLib.nodeLibStrings.base64
  type KeyFormat = nodeLib.nodeLibStrings.pem | nodeLib.nodeLibStrings.der
  type KeyLike = java.lang.String | nodeLib.Buffer | KeyObject
  type KeyObjectType = nodeLib.nodeLibStrings.secret | nodeLib.nodeLibStrings.public | nodeLib.nodeLibStrings.`private`
  type KeyType = nodeLib.nodeLibStrings.rsa | nodeLib.nodeLibStrings.dsa | nodeLib.nodeLibStrings.ec
  type Utf8AsciiBinaryEncoding = nodeLib.nodeLibStrings.utf8 | nodeLib.nodeLibStrings.ascii | nodeLib.nodeLibStrings.binary
  type Utf8AsciiLatin1Encoding = nodeLib.nodeLibStrings.utf8 | nodeLib.nodeLibStrings.ascii | nodeLib.nodeLibStrings.latin1
}
