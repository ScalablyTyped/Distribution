package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerCertificate extends js.Object {
  var exponent: java.lang.String
  var ext_key_usage: js.Array[java.lang.String]
  var fingerprint: java.lang.String
  var infoAccess: /* import warning: ImportType.apply Failed type conversion: {[index: string] : std.Array<string> | undefined, [index: string] : std.Array<string> | undefined} */ js.Any
  var issuer: Certificate
  var modulus: java.lang.String
  var raw: nodeLib.Buffer
  var serialNumber: java.lang.String
  var subject: Certificate
  var subjectaltname: java.lang.String
  var valid_from: java.lang.String
  var valid_to: java.lang.String
}

