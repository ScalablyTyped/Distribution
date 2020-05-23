package typings.nodemailer.dkimMod

import typings.nodemailer.nodemailerBooleans.`false`
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
    cacheDir: String | `false` = null,
    cacheTreshold: js.UndefOr[Double] = js.undefined,
    hashAlgo: String = null,
    headerFieldNames: String = null,
    skipFields: String = null
  ): MultipleKeysOptions = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheTreshold)) __obj.updateDynamic("cacheTreshold")(cacheTreshold.get.asInstanceOf[js.Any])
    if (hashAlgo != null) __obj.updateDynamic("hashAlgo")(hashAlgo.asInstanceOf[js.Any])
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames.asInstanceOf[js.Any])
    if (skipFields != null) __obj.updateDynamic("skipFields")(skipFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleKeysOptions]
  }
}

