package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadData extends StObject {
  
  var anonymous: Boolean = js.native
  
  var category: String = js.native
  
  var complete: Boolean = js.native
  
  var credentials: String = js.native
  
  var description: String = js.native
  
  var hidden: Boolean = js.native
  
  var information: String = js.native
  
  var name: String = js.native
  
  var remake: Boolean = js.native
  
  var torrent: String = js.native
  
  var trusted: Boolean = js.native
}
object UploadData {
  
  @scala.inline
  def apply(
    anonymous: Boolean,
    category: String,
    complete: Boolean,
    credentials: String,
    description: String,
    hidden: Boolean,
    information: String,
    name: String,
    remake: Boolean,
    torrent: String,
    trusted: Boolean
  ): UploadData = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remake = remake.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
  
  @scala.inline
  implicit class UploadDataMutableBuilder[Self <: UploadData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformation(value: String): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemake(value: Boolean): Self = StObject.set(x, "remake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTorrent(value: String): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
  }
}
