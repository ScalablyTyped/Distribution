package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileHash extends js.Object {
  
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
  implicit class FileHashOps[Self <: FileHash] (val x: Self) extends AnyVal {
    
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
    def setHashType(value: NullableOption[FileHashType]): Self = this.set("hashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashType: Self = this.set("hashType", js.undefined)
    
    @scala.inline
    def setHashTypeNull: Self = this.set("hashType", null)
    
    @scala.inline
    def setHashValue(value: NullableOption[String]): Self = this.set("hashValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashValue: Self = this.set("hashValue", js.undefined)
    
    @scala.inline
    def setHashValueNull: Self = this.set("hashValue", null)
  }
}
