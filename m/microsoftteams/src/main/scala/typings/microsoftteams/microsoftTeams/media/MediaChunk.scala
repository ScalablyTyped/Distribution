package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Media chunks an output of getMedia API from platform
  */
trait MediaChunk extends StObject {
  
  /**
    * Base 64 data for the requested uri
    */
  var chunk: String
  
  /**
    * chunk sequence number
    */
  var chunkSequence: Double
}
object MediaChunk {
  
  inline def apply(chunk: String, chunkSequence: Double): MediaChunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], chunkSequence = chunkSequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaChunk] (val x: Self) extends AnyVal {
    
    inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkSequence(value: Double): Self = StObject.set(x, "chunkSequence", value.asInstanceOf[js.Any])
  }
}
