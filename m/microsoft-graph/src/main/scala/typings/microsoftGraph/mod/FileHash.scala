package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileHash extends StObject {
  
  // File hash type. Possible values are: unknown, sha1, sha256, md5, authenticodeHash256, lsHash, ctph, peSha1, peSha256.
  var hashType: js.UndefOr[NullableOption[FileHashType]] = js.native
  
  // Value of the file hash.
  var hashValue: js.UndefOr[NullableOption[String]] = js.native
}
object FileHash {
  
  @scala.inline
  def apply(): FileHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileHash]
  }
  
  @scala.inline
  implicit class FileHashMutableBuilder[Self <: FileHash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashType(value: NullableOption[FileHashType]): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashTypeNull: Self = StObject.set(x, "hashType", null)
    
    @scala.inline
    def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    
    @scala.inline
    def setHashValue(value: NullableOption[String]): Self = StObject.set(x, "hashValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashValueNull: Self = StObject.set(x, "hashValue", null)
    
    @scala.inline
    def setHashValueUndefined: Self = StObject.set(x, "hashValue", js.undefined)
  }
}
