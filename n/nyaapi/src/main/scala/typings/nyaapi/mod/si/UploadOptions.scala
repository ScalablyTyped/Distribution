package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadOptions extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var category: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Category * / any */ String
  
  var complete: js.UndefOr[Boolean] = js.undefined
  
  var credentials: Credentials
  
  var description: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var information: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var remake: js.UndefOr[Boolean] = js.undefined
  
  var torrent: String
  
  var trusted: js.UndefOr[Boolean] = js.undefined
}
object UploadOptions {
  
  inline def apply(
    category: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Category * / any */ String,
    credentials: Credentials,
    name: String,
    torrent: String
  ): UploadOptions = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadOptions] (val x: Self) extends AnyVal {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setCategory(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Category * / any */ String
    ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setInformation(value: String): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
    
    inline def setInformationUndefined: Self = StObject.set(x, "information", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemake(value: Boolean): Self = StObject.set(x, "remake", value.asInstanceOf[js.Any])
    
    inline def setRemakeUndefined: Self = StObject.set(x, "remake", js.undefined)
    
    inline def setTorrent(value: String): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
    
    inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
    
    inline def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
  }
}
