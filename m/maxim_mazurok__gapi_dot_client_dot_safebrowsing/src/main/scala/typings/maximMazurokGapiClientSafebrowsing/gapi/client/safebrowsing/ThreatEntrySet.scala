package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreatEntrySet extends js.Object {
  
  /** The compression type for the entries in this set. */
  var compressionType: js.UndefOr[String] = js.native
  
  /** The raw SHA256-formatted entries. */
  var rawHashes: js.UndefOr[RawHashes] = js.native
  
  /** The raw removal indices for a local list. */
  var rawIndices: js.UndefOr[RawIndices] = js.native
  
  /**
    * The encoded 4-byte prefixes of SHA256-formatted entries, using a Golomb-Rice encoding. The hashes are converted to uint32, sorted in ascending order, then delta encoded and stored
    * as encoded_data.
    */
  var riceHashes: js.UndefOr[RiceDeltaEncoding] = js.native
  
  /**
    * The encoded local, lexicographically-sorted list indices, using a Golomb-Rice encoding. Used for sending compressed removal indices. The removal indices (uint32) are sorted in
    * ascending order, then delta encoded and stored as encoded_data.
    */
  var riceIndices: js.UndefOr[RiceDeltaEncoding] = js.native
}
object ThreatEntrySet {
  
  @scala.inline
  def apply(): ThreatEntrySet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatEntrySet]
  }
  
  @scala.inline
  implicit class ThreatEntrySetOps[Self <: ThreatEntrySet] (val x: Self) extends AnyVal {
    
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
    def setCompressionType(value: String): Self = this.set("compressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressionType: Self = this.set("compressionType", js.undefined)
    
    @scala.inline
    def setRawHashes(value: RawHashes): Self = this.set("rawHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawHashes: Self = this.set("rawHashes", js.undefined)
    
    @scala.inline
    def setRawIndices(value: RawIndices): Self = this.set("rawIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawIndices: Self = this.set("rawIndices", js.undefined)
    
    @scala.inline
    def setRiceHashes(value: RiceDeltaEncoding): Self = this.set("riceHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiceHashes: Self = this.set("riceHashes", js.undefined)
    
    @scala.inline
    def setRiceIndices(value: RiceDeltaEncoding): Self = this.set("riceIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRiceIndices: Self = this.set("riceIndices", js.undefined)
  }
}
