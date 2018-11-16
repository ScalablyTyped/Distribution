package typings
package nodemailerLib.libDkimMod.DKIMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MultipleKeysOptions extends OptionalOptions {
  /** is an optional array of key objects (domainName, keySelector, privateKey) if you want to add more than one signature to the message. If this value is set then the default key values are ignored */
  var keys: js.Array[SingleKeyOptions]
}

