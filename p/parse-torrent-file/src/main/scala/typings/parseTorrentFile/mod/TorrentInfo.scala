package typings.parseTorrentFile.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TorrentInfo extends js.Object {
  
  var files: js.UndefOr[js.Array[File]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  @JSName("name.utf-8")
  var `nameDotutf-8`: js.UndefOr[String] = js.native
  
  var `piece length`: js.UndefOr[Double] = js.native
  
  var pieces: js.UndefOr[Double] = js.native
  
  var `private`: js.UndefOr[Boolean] = js.native
}
object TorrentInfo {
  
  @scala.inline
  def apply(): TorrentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TorrentInfo]
  }
  
  @scala.inline
  implicit class TorrentInfoOps[Self <: TorrentInfo] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def `setNameDotutf-8`(value: String): Self = this.set("name.utf-8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteNameDotutf-8`: Self = this.set("name.utf-8", js.undefined)
    
    @scala.inline
    def `setPiece length`(value: Double): Self = this.set("piece length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePiece length`: Self = this.set("piece length", js.undefined)
    
    @scala.inline
    def setPieces(value: Double): Self = this.set("pieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieces: Self = this.set("pieces", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
  }
}
