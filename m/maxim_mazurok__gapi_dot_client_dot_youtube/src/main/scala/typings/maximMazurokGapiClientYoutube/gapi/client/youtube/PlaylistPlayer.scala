package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistPlayer extends StObject {
  
  /** An <iframe> tag that embeds a player that will play the playlist. */
  var embedHtml: js.UndefOr[String] = js.undefined
}
object PlaylistPlayer {
  
  inline def apply(): PlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistPlayer]
  }
  
  extension [Self <: PlaylistPlayer](x: Self) {
    
    inline def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    inline def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
  }
}
