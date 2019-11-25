package typings.nodemailer.libDkimMod

import typings.nodemailer.nodemailerNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalOptions extends js.Object {
  /** optional location for cached messages. If not set then caching is not used. */
  var cacheDir: js.UndefOr[String | `false`] = js.undefined
  /** optional size in bytes, if message is larger than this treshold it gets cached to disk (assuming cacheDir is set and writable). Defaults to 131072 (128 kB). */
  var cacheTreshold: js.UndefOr[Double] = js.undefined
  /** optional algorithm for the body hash, defaults to ‘sha256’ */
  var hashAlgo: js.UndefOr[String] = js.undefined
  /** an optional colon separated list of header keys to sign (eg. message-id:date:from:to...') */
  var headerFieldNames: js.UndefOr[String] = js.undefined
  /** optional colon separated list of header keys not to sign. This is useful if you want to sign all the relevant keys but your provider changes some values, ie Message-ID and Date. In this case you should use 'message-id:date' to prevent signing these values. */
  var skipFields: js.UndefOr[String] = js.undefined
}

object OptionalOptions {
  @scala.inline
  def apply(
    cacheDir: String | `false` = null,
    cacheTreshold: Int | Double = null,
    hashAlgo: String = null,
    headerFieldNames: String = null,
    skipFields: String = null
  ): OptionalOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (cacheTreshold != null) __obj.updateDynamic("cacheTreshold")(cacheTreshold.asInstanceOf[js.Any])
    if (hashAlgo != null) __obj.updateDynamic("hashAlgo")(hashAlgo.asInstanceOf[js.Any])
    if (headerFieldNames != null) __obj.updateDynamic("headerFieldNames")(headerFieldNames.asInstanceOf[js.Any])
    if (skipFields != null) __obj.updateDynamic("skipFields")(skipFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalOptions]
  }
}

