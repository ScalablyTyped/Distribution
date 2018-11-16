package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NdefTag extends Tag {
  var canMakeReadOnly: scala.Boolean
  var isWritable: scala.Boolean
  var maxSize: scala.Double
  var ndefMessage: js.Array[NdefRecord]
}

