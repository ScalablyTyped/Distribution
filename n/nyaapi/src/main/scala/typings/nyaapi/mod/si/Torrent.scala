package typings.nyaapi.mod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Torrent extends js.Object {
  
  var category: String = js.native
  
  var completed: String = js.native
  
  var date: String = js.native
  
  var filesize: String = js.native
  
  var hash: String = js.native
  
  var id: String = js.native
  
  var leechers: String = js.native
  
  var magnet: String = js.native
  
  var name: String = js.native
  
  var seeders: String = js.native
  
  var sub_category: String = js.native
  
  var torrent: String = js.native
}
object Torrent {
  
  @scala.inline
  def apply(
    category: String,
    completed: String,
    date: String,
    filesize: String,
    hash: String,
    id: String,
    leechers: String,
    magnet: String,
    name: String,
    seeders: String,
    sub_category: String,
    torrent: String
  ): Torrent = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], filesize = filesize.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], sub_category = sub_category.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any])
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: String): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesize(value: String): Self = this.set("filesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeechers(value: String): Self = this.set("leechers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnet(value: String): Self = this.set("magnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeeders(value: String): Self = this.set("seeders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub_category(value: String): Self = this.set("sub_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorrent(value: String): Self = this.set("torrent", value.asInstanceOf[js.Any])
  }
}
