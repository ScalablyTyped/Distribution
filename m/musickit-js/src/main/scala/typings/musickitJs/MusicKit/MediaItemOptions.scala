package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options to use when defining a media item.
  */
trait MediaItemOptions extends StObject {
  
  /**
    * The attributes for the media item.
    */
  var attributes: js.UndefOr[Any] = js.undefined
  
  /**
    * The identifier for the media item.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The type for the media item.
    */
  var `type`: js.UndefOr[Any] = js.undefined
}
object MediaItemOptions {
  
  inline def apply(): MediaItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaItemOptions]
  }
  
  extension [Self <: MediaItemOptions](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
