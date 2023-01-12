package typings.musickitJs.anon

import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appearson extends StObject {
  
  var `appears-on`: View[typings.musickitJs.MusicKit.Playlists]
  
  var `other-versions`: View[typings.musickitJs.MusicKit.Albums]
  
  var `related-albums`: View[typings.musickitJs.MusicKit.Albums]
  
  var `related-videos`: View[MusicVideos]
}
object Appearson {
  
  inline def apply(
    `appears-on`: View[typings.musickitJs.MusicKit.Playlists],
    `other-versions`: View[typings.musickitJs.MusicKit.Albums],
    `related-albums`: View[typings.musickitJs.MusicKit.Albums],
    `related-videos`: View[MusicVideos]
  ): Appearson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appears-on")(`appears-on`.asInstanceOf[js.Any])
    __obj.updateDynamic("other-versions")(`other-versions`.asInstanceOf[js.Any])
    __obj.updateDynamic("related-albums")(`related-albums`.asInstanceOf[js.Any])
    __obj.updateDynamic("related-videos")(`related-videos`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Appearson] (val x: Self) extends AnyVal {
    
    inline def `setAppears-on`(value: View[typings.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "appears-on", value.asInstanceOf[js.Any])
    
    inline def `setOther-versions`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "other-versions", value.asInstanceOf[js.Any])
    
    inline def `setRelated-albums`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "related-albums", value.asInstanceOf[js.Any])
    
    inline def `setRelated-videos`(value: View[MusicVideos]): Self = StObject.set(x, "related-videos", value.asInstanceOf[js.Any])
  }
}
