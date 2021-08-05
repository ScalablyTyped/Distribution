package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadData extends StObject {
  
  var anonymous: Boolean
  
  var category: String
  
  var complete: Boolean
  
  var credentials: String
  
  var description: String
  
  var hidden: Boolean
  
  var information: String
  
  var name: String
  
  var remake: Boolean
  
  var torrent: String
  
  var trusted: Boolean
}
object UploadData {
  
  inline def apply(
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
  
  extension [Self <: UploadData](x: Self) {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: String): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemake(value: Boolean): Self = StObject.set(x, "remake", value.asInstanceOf[js.Any])
    
    inline def setTorrent(value: String): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
    
    inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
  }
}
