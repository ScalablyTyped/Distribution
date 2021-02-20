package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Torrent extends StObject {
  
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
  implicit class TorrentMutableBuilder[Self <: Torrent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesize(value: String): Self = StObject.set(x, "filesize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeechers(value: String): Self = StObject.set(x, "leechers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagnet(value: String): Self = StObject.set(x, "magnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeeders(value: String): Self = StObject.set(x, "seeders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub_category(value: String): Self = StObject.set(x, "sub_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorrent(value: String): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
  }
}
