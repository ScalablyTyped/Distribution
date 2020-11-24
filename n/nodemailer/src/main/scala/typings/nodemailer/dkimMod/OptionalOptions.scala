package typings.nodemailer.dkimMod

import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalOptions extends js.Object {
  
  /** optional location for cached messages. If not set then caching is not used. */
  var cacheDir: js.UndefOr[String | `false`] = js.native
  
  /** optional size in bytes, if message is larger than this treshold it gets cached to disk (assuming cacheDir is set and writable). Defaults to 131072 (128 kB). */
  var cacheTreshold: js.UndefOr[Double] = js.native
  
  /** optional algorithm for the body hash, defaults to ‘sha256’ */
  var hashAlgo: js.UndefOr[String] = js.native
  
  /** an optional colon separated list of header keys to sign (eg. message-id:date:from:to...') */
  var headerFieldNames: js.UndefOr[String] = js.native
  
  /** optional colon separated list of header keys not to sign. This is useful if you want to sign all the relevant keys but your provider changes some values, ie Message-ID and Date. In this case you should use 'message-id:date' to prevent signing these values. */
  var skipFields: js.UndefOr[String] = js.native
}
object OptionalOptions {
  
  @scala.inline
  def apply(): OptionalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalOptions]
  }
  
  @scala.inline
  implicit class OptionalOptionsOps[Self <: OptionalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheDir(value: String | `false`): Self = this.set("cacheDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDir: Self = this.set("cacheDir", js.undefined)
    
    @scala.inline
    def setCacheTreshold(value: Double): Self = this.set("cacheTreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheTreshold: Self = this.set("cacheTreshold", js.undefined)
    
    @scala.inline
    def setHashAlgo(value: String): Self = this.set("hashAlgo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashAlgo: Self = this.set("hashAlgo", js.undefined)
    
    @scala.inline
    def setHeaderFieldNames(value: String): Self = this.set("headerFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFieldNames: Self = this.set("headerFieldNames", js.undefined)
    
    @scala.inline
    def setSkipFields(value: String): Self = this.set("skipFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFields: Self = this.set("skipFields", js.undefined)
  }
}
