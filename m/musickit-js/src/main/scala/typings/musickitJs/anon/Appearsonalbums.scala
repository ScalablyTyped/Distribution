package typings.musickitJs.anon

import typings.musickitJs.MusicKit.MusicVideos
import typings.musickitJs.MusicKit.Songs
import typings.musickitJs.MusicKit.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appearsonalbums extends StObject {
  
  var `appears-on-albums`: View[typings.musickitJs.MusicKit.Albums]
  
  var `compilation-albums`: Attributes
  
  var `featured-albums`: View[typings.musickitJs.MusicKit.Albums]
  
  var `featured-playlists`: View[typings.musickitJs.MusicKit.Playlists]
  
  var `full-albums`: View[typings.musickitJs.MusicKit.Albums]
  
  var `latest-release`: View[typings.musickitJs.MusicKit.Albums]
  
  var `live-albums`: View[typings.musickitJs.MusicKit.Albums]
  
  var `similar-artists`: View[typings.musickitJs.MusicKit.Artists]
  
  var singles: View[typings.musickitJs.MusicKit.Albums]
  
  var `top-music-videos`: View[MusicVideos]
  
  var `top-songs`: View[Songs]
}
object Appearsonalbums {
  
  inline def apply(
    `appears-on-albums`: View[typings.musickitJs.MusicKit.Albums],
    `compilation-albums`: Attributes,
    `featured-albums`: View[typings.musickitJs.MusicKit.Albums],
    `featured-playlists`: View[typings.musickitJs.MusicKit.Playlists],
    `full-albums`: View[typings.musickitJs.MusicKit.Albums],
    `latest-release`: View[typings.musickitJs.MusicKit.Albums],
    `live-albums`: View[typings.musickitJs.MusicKit.Albums],
    `similar-artists`: View[typings.musickitJs.MusicKit.Artists],
    singles: View[typings.musickitJs.MusicKit.Albums],
    `top-music-videos`: View[MusicVideos],
    `top-songs`: View[Songs]
  ): Appearsonalbums = {
    val __obj = js.Dynamic.literal(singles = singles.asInstanceOf[js.Any])
    __obj.updateDynamic("appears-on-albums")(`appears-on-albums`.asInstanceOf[js.Any])
    __obj.updateDynamic("compilation-albums")(`compilation-albums`.asInstanceOf[js.Any])
    __obj.updateDynamic("featured-albums")(`featured-albums`.asInstanceOf[js.Any])
    __obj.updateDynamic("featured-playlists")(`featured-playlists`.asInstanceOf[js.Any])
    __obj.updateDynamic("full-albums")(`full-albums`.asInstanceOf[js.Any])
    __obj.updateDynamic("latest-release")(`latest-release`.asInstanceOf[js.Any])
    __obj.updateDynamic("live-albums")(`live-albums`.asInstanceOf[js.Any])
    __obj.updateDynamic("similar-artists")(`similar-artists`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-music-videos")(`top-music-videos`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-songs")(`top-songs`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearsonalbums]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Appearsonalbums] (val x: Self) extends AnyVal {
    
    inline def `setAppears-on-albums`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "appears-on-albums", value.asInstanceOf[js.Any])
    
    inline def `setCompilation-albums`(value: Attributes): Self = StObject.set(x, "compilation-albums", value.asInstanceOf[js.Any])
    
    inline def `setFeatured-albums`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "featured-albums", value.asInstanceOf[js.Any])
    
    inline def `setFeatured-playlists`(value: View[typings.musickitJs.MusicKit.Playlists]): Self = StObject.set(x, "featured-playlists", value.asInstanceOf[js.Any])
    
    inline def `setFull-albums`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "full-albums", value.asInstanceOf[js.Any])
    
    inline def `setLatest-release`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "latest-release", value.asInstanceOf[js.Any])
    
    inline def `setLive-albums`(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "live-albums", value.asInstanceOf[js.Any])
    
    inline def `setSimilar-artists`(value: View[typings.musickitJs.MusicKit.Artists]): Self = StObject.set(x, "similar-artists", value.asInstanceOf[js.Any])
    
    inline def setSingles(value: View[typings.musickitJs.MusicKit.Albums]): Self = StObject.set(x, "singles", value.asInstanceOf[js.Any])
    
    inline def `setTop-music-videos`(value: View[MusicVideos]): Self = StObject.set(x, "top-music-videos", value.asInstanceOf[js.Any])
    
    inline def `setTop-songs`(value: View[Songs]): Self = StObject.set(x, "top-songs", value.asInstanceOf[js.Any])
  }
}
