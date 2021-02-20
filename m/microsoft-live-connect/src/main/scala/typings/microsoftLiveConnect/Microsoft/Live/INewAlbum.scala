package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a new album.
  */
@js.native
trait INewAlbum extends StObject {
  
  /**
    * A description of the album.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of the album.
    */
  var name: String = js.native
}
object INewAlbum {
  
  @scala.inline
  def apply(name: String): INewAlbum = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewAlbum]
  }
  
  @scala.inline
  implicit class INewAlbumMutableBuilder[Self <: INewAlbum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
