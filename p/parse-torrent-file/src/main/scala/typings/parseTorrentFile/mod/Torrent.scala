package typings.parseTorrentFile.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Torrent extends js.Object {
  
  var announce: js.UndefOr[String] = js.native
  
  var `announce-list`: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  var comment: js.UndefOr[Buffer] = js.native
  
  var `created by`: js.UndefOr[String] = js.native
  
  var `creation date`: js.UndefOr[Double] = js.native
  
  var info: js.UndefOr[TorrentInfo] = js.native
  
  var `url-list`: js.UndefOr[Buffer] = js.native
}
object Torrent {
  
  @scala.inline
  def apply(): Torrent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Torrent]
  }
  
  @scala.inline
  implicit class TorrentOps[Self <: Torrent] (val x: Self) extends AnyVal {
    
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
    def setAnnounce(value: String): Self = this.set("announce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnounce: Self = this.set("announce", js.undefined)
    
    @scala.inline
    def `setAnnounce-listVarargs`(value: js.Array[String]*): Self = this.set("announce-list", js.Array(value :_*))
    
    @scala.inline
    def `setAnnounce-list`(value: js.Array[js.Array[String]]): Self = this.set("announce-list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAnnounce-list`: Self = this.set("announce-list", js.undefined)
    
    @scala.inline
    def setComment(value: Buffer): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def `setCreated by`(value: String): Self = this.set("created by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCreated by`: Self = this.set("created by", js.undefined)
    
    @scala.inline
    def `setCreation date`(value: Double): Self = this.set("creation date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteCreation date`: Self = this.set("creation date", js.undefined)
    
    @scala.inline
    def setInfo(value: TorrentInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    
    @scala.inline
    def `setUrl-list`(value: Buffer): Self = this.set("url-list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteUrl-list`: Self = this.set("url-list", js.undefined)
  }
}
