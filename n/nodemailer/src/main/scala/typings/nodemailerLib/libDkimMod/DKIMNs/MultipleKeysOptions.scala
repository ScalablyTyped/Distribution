package typings
package nodemailerLib.libDkimMod.DKIMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleKeysOptions
  extends OptionalOptions
     with Options {
  /** is an optional array of key objects (domainName, keySelector, privateKey) if you want to add more than one signature to the message. If this value is set then the default key values are ignored */
  var keys: js.Array[SingleKeyOptions]
}

object MultipleKeysOptions {
  @scala.inline
  def apply(
    keys: js.Array[SingleKeyOptions],
    cacheDir: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = null,
    cacheTreshold: scala.Int | scala.Double = null,
    hashAlgo: java.lang.String = null,
    headerFieldNames: java.lang.String = null,
    skipFields: java.lang.String = null
  ): MultipleKeysOptions = {
    val __obj = js.Dynamic.literal(keys = keys)
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (cacheTreshold != null) __obj.updateDynamic("cacheTreshold")(cacheTreshold.asInstanceOf[js.Any])
    if (hashAlgo != null) __obj.updateDynamic("hashAlgo")(hashAlgo)
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames)
    if (skipFields != null) __obj.updateDynamic("skipFields")(skipFields)
    __obj.asInstanceOf[MultipleKeysOptions]
  }
}

