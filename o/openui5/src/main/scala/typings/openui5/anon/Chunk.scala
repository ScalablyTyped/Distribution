package typings.openui5.anon

import typings.openui5.sapUiUx3FeedChunkMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk extends StObject {
  
  /**
    * New chunk
    */
  var chunk: js.UndefOr[default] = js.undefined
}
object Chunk {
  
  inline def apply(): Chunk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chunk]
  }
  
  extension [Self <: Chunk](x: Self) {
    
    inline def setChunk(value: default): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
  }
}
