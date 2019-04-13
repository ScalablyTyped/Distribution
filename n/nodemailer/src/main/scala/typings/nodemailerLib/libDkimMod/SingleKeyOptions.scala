package typings
package nodemailerLib.libDkimMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleKeyOptions
  extends OptionalOptions
     with Options {
  /** is the domain name to use in the signature */
  var domainName: java.lang.String
  /** is the DKIM key selector */
  var keySelector: java.lang.String
  /** is the private key for the selector in PEM format */
  var privateKey: java.lang.String | nodemailerLib.Anon_Key
}

object SingleKeyOptions {
  @scala.inline
  def apply(
    domainName: java.lang.String,
    keySelector: java.lang.String,
    privateKey: java.lang.String | nodemailerLib.Anon_Key,
    cacheDir: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = null,
    cacheTreshold: scala.Int | scala.Double = null,
    hashAlgo: java.lang.String = null,
    headerFieldNames: java.lang.String = null,
    skipFields: java.lang.String = null
  ): SingleKeyOptions = {
    val __obj = js.Dynamic.literal(domainName = domainName, keySelector = keySelector, privateKey = privateKey.asInstanceOf[js.Any])
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (cacheTreshold != null) __obj.updateDynamic("cacheTreshold")(cacheTreshold.asInstanceOf[js.Any])
    if (hashAlgo != null) __obj.updateDynamic("hashAlgo")(hashAlgo)
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames)
    if (skipFields != null) __obj.updateDynamic("skipFields")(skipFields)
    __obj.asInstanceOf[SingleKeyOptions]
  }
}

