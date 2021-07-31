package typings.playmusic.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object PlaylistOptions {
  
  @scala.inline
  def apply(): PlaylistOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistOptions]
  }
  
  @scala.inline
  implicit class PlaylistOptionsMutableBuilder[Self <: PlaylistOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
