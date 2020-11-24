package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawHashes extends js.Object {
  
  /** The number of bytes for each prefix encoded below. This field can be anywhere from 4 (shortest prefix) to 32 (full SHA256 hash). */
  var prefixSize: js.UndefOr[Double] = js.native
  
  /** The hashes, in binary format, concatenated into one long string. Hashes are sorted in lexicographic order. For JSON API users, hashes are base64-encoded. */
  var rawHashes: js.UndefOr[String] = js.native
}
object RawHashes {
  
  @scala.inline
  def apply(): RawHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawHashes]
  }
  
  @scala.inline
  implicit class RawHashesOps[Self <: RawHashes] (val x: Self) extends AnyVal {
    
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
    def setPrefixSize(value: Double): Self = this.set("prefixSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixSize: Self = this.set("prefixSize", js.undefined)
    
    @scala.inline
    def setRawHashes(value: String): Self = this.set("rawHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawHashes: Self = this.set("rawHashes", js.undefined)
  }
}
