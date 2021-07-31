package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawHashes extends StObject {
  
  /** The number of bytes for each prefix encoded below. This field can be anywhere from 4 (shortest prefix) to 32 (full SHA256 hash). */
  var prefixSize: js.UndefOr[Double] = js.undefined
  
  /** The hashes, in binary format, concatenated into one long string. Hashes are sorted in lexicographic order. For JSON API users, hashes are base64-encoded. */
  var rawHashes: js.UndefOr[String] = js.undefined
}
object RawHashes {
  
  @scala.inline
  def apply(): RawHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawHashes]
  }
  
  @scala.inline
  implicit class RawHashesMutableBuilder[Self <: RawHashes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixSize(value: Double): Self = StObject.set(x, "prefixSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixSizeUndefined: Self = StObject.set(x, "prefixSize", js.undefined)
    
    @scala.inline
    def setRawHashes(value: String): Self = StObject.set(x, "rawHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawHashesUndefined: Self = StObject.set(x, "rawHashes", js.undefined)
  }
}
