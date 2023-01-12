package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new album.
  */
trait INewAlbum extends StObject {
  
  /**
    * A description of the album.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the album.
    */
  var name: String
}
object INewAlbum {
  
  inline def apply(name: String): INewAlbum = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewAlbum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INewAlbum] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
