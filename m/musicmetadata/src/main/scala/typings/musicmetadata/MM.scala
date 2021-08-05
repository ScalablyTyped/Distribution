package typings.musicmetadata

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MM {
  
  trait Metadata extends StObject {
    
    var album: String
    
    var albumartist: js.Array[String]
    
    var artist: js.Array[String]
    
    var disk: NoOf
    
    var duration: Double
    
    var genre: js.Array[String]
    
    var picture: js.Array[Picture]
    
    var title: String
    
    var track: NoOf
    
    var year: String
  }
  object Metadata {
    
    inline def apply(
      album: String,
      albumartist: js.Array[String],
      artist: js.Array[String],
      disk: NoOf,
      duration: Double,
      genre: js.Array[String],
      picture: js.Array[Picture],
      title: String,
      track: NoOf,
      year: String
    ): Metadata = {
      val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], albumartist = albumartist.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], disk = disk.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      inline def setAlbumartist(value: js.Array[String]): Self = StObject.set(x, "albumartist", value.asInstanceOf[js.Any])
      
      inline def setAlbumartistVarargs(value: String*): Self = StObject.set(x, "albumartist", js.Array(value :_*))
      
      inline def setArtist(value: js.Array[String]): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      inline def setArtistVarargs(value: String*): Self = StObject.set(x, "artist", js.Array(value :_*))
      
      inline def setDisk(value: NoOf): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setGenre(value: js.Array[String]): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
      
      inline def setGenreVarargs(value: String*): Self = StObject.set(x, "genre", js.Array(value :_*))
      
      inline def setPicture(value: js.Array[Picture]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureVarargs(value: Picture*): Self = StObject.set(x, "picture", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: NoOf): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait NoOf extends StObject {
    
    var no: Double
    
    var of: Double
  }
  object NoOf {
    
    inline def apply(no: Double, of: Double): NoOf = {
      val __obj = js.Dynamic.literal(no = no.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoOf]
    }
    
    extension [Self <: NoOf](x: Self) {
      
      inline def setNo(value: Double): Self = StObject.set(x, "no", value.asInstanceOf[js.Any])
      
      inline def setOf(value: Double): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var duration: js.UndefOr[Boolean] = js.undefined
    
    var fileSize: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDuration(value: Boolean): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
    }
  }
  
  trait Picture extends StObject {
    
    var data: Buffer
    
    var format: String
  }
  object Picture {
    
    inline def apply(data: Buffer, format: String): Picture = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Picture]
    }
    
    extension [Self <: Picture](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
