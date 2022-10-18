package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenGraphVideo extends StObject {
  
  var actors: js.UndefOr[js.Array[OpenGraphVideoActors]] = js.undefined
  
  var directors: js.UndefOr[js.Array[String]] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var releaseDate: js.UndefOr[String] = js.undefined
  
  var series: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  var writers: js.UndefOr[js.Array[String]] = js.undefined
}
object OpenGraphVideo {
  
  inline def apply(): OpenGraphVideo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenGraphVideo]
  }
  
  extension [Self <: OpenGraphVideo](x: Self) {
    
    inline def setActors(value: js.Array[OpenGraphVideoActors]): Self = StObject.set(x, "actors", value.asInstanceOf[js.Any])
    
    inline def setActorsUndefined: Self = StObject.set(x, "actors", js.undefined)
    
    inline def setActorsVarargs(value: OpenGraphVideoActors*): Self = StObject.set(x, "actors", js.Array(value*))
    
    inline def setDirectors(value: js.Array[String]): Self = StObject.set(x, "directors", value.asInstanceOf[js.Any])
    
    inline def setDirectorsUndefined: Self = StObject.set(x, "directors", js.undefined)
    
    inline def setDirectorsVarargs(value: String*): Self = StObject.set(x, "directors", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setReleaseDate(value: String): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setWriters(value: js.Array[String]): Self = StObject.set(x, "writers", value.asInstanceOf[js.Any])
    
    inline def setWritersUndefined: Self = StObject.set(x, "writers", js.undefined)
    
    inline def setWritersVarargs(value: String*): Self = StObject.set(x, "writers", js.Array(value*))
  }
}
