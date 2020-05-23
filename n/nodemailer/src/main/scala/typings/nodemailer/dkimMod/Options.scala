package typings.nodemailer.dkimMod

import typings.nodemailer.anon.Key
import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodemailer.dkimMod.SingleKeyOptions
  - typings.nodemailer.dkimMod.MultipleKeysOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def SingleKeyOptions(
    domainName: String,
    keySelector: String,
    privateKey: String | Key,
    cacheDir: String | `false` = null,
    cacheTreshold: js.UndefOr[Double] = js.undefined,
    hashAlgo: String = null,
    headerFieldNames: String = null,
    skipFields: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], keySelector = keySelector.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheTreshold)) __obj.updateDynamic("cacheTreshold")(cacheTreshold.get.asInstanceOf[js.Any])
    if (hashAlgo != null) __obj.updateDynamic("hashAlgo")(hashAlgo.asInstanceOf[js.Any])
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames.asInstanceOf[js.Any])
    if (skipFields != null) __obj.updateDynamic("skipFields")(skipFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def MultipleKeysOptions(
    keys: js.Array[SingleKeyOptions],
    cacheDir: String | `false` = null,
    cacheTreshold: js.UndefOr[Double] = js.undefined,
    hashAlgo: String = null,
    headerFieldNames: String = null,
    skipFields: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheTreshold)) __obj.updateDynamic("cacheTreshold")(cacheTreshold.get.asInstanceOf[js.Any])
    if (hashAlgo != null) __obj.updateDynamic("hashAlgo")(hashAlgo.asInstanceOf[js.Any])
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames.asInstanceOf[js.Any])
    if (skipFields != null) __obj.updateDynamic("skipFields")(skipFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

