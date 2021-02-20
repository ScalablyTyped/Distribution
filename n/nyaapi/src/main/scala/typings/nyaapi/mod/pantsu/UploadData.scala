package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadData extends StObject {
  
  var c: Category = js.native
  
  var description: String = js.native
  
  var hidden: Boolean = js.native
  
  var languages: js.Array[String] = js.native
  
  var magnet: String = js.native
  
  var name: String = js.native
  
  var remake: Boolean = js.native
  
  var status: Double = js.native
  
  var torrent: String = js.native
  
  var username: String = js.native
  
  var website_link: String = js.native
}
object UploadData {
  
  @scala.inline
  def apply(
    c: Category,
    description: String,
    hidden: Boolean,
    languages: js.Array[String],
    magnet: String,
    name: String,
    remake: Boolean,
    status: Double,
    torrent: String,
    username: String,
    website_link: String
  ): UploadData = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remake = remake.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website_link = website_link.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
  
  @scala.inline
  implicit class UploadDataMutableBuilder[Self <: UploadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: Category): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    @scala.inline
    def setMagnet(value: String): Self = StObject.set(x, "magnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemake(value: Boolean): Self = StObject.set(x, "remake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorrent(value: String): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsite_link(value: String): Self = StObject.set(x, "website_link", value.asInstanceOf[js.Any])
  }
}
