package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistResponse extends StObject {
  
  var data: js.UndefOr[PlaylistData] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object PlaylistResponse {
  
  @scala.inline
  def apply(): PlaylistResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistResponse]
  }
  
  @scala.inline
  implicit class PlaylistResponseMutableBuilder[Self <: PlaylistResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: PlaylistData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
