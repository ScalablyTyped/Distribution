package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hashes extends StObject {
  
  // The CRC32 value of the file in little endian (if available). Read-only.
  var crc32Hash: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A proprietary hash of the file that can be used to determine if the contents of the file have changed (if available).
    * Read-only.
    */
  var quickXorHash: js.UndefOr[NullableOption[String]] = js.undefined
  
  // SHA1 hash for the contents of the file (if available). Read-only.
  var sha1Hash: js.UndefOr[NullableOption[String]] = js.undefined
  
  // SHA256 hash for the contents of the file (if available). Read-only.
  var sha256Hash: js.UndefOr[NullableOption[String]] = js.undefined
}
object Hashes {
  
  @scala.inline
  def apply(): Hashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hashes]
  }
  
  @scala.inline
  implicit class HashesMutableBuilder[Self <: Hashes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrc32Hash(value: NullableOption[String]): Self = StObject.set(x, "crc32Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrc32HashNull: Self = StObject.set(x, "crc32Hash", null)
    
    @scala.inline
    def setCrc32HashUndefined: Self = StObject.set(x, "crc32Hash", js.undefined)
    
    @scala.inline
    def setQuickXorHash(value: NullableOption[String]): Self = StObject.set(x, "quickXorHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickXorHashNull: Self = StObject.set(x, "quickXorHash", null)
    
    @scala.inline
    def setQuickXorHashUndefined: Self = StObject.set(x, "quickXorHash", js.undefined)
    
    @scala.inline
    def setSha1Hash(value: NullableOption[String]): Self = StObject.set(x, "sha1Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1HashNull: Self = StObject.set(x, "sha1Hash", null)
    
    @scala.inline
    def setSha1HashUndefined: Self = StObject.set(x, "sha1Hash", js.undefined)
    
    @scala.inline
    def setSha256Hash(value: NullableOption[String]): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256HashNull: Self = StObject.set(x, "sha256Hash", null)
    
    @scala.inline
    def setSha256HashUndefined: Self = StObject.set(x, "sha256Hash", js.undefined)
  }
}
