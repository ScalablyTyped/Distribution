package typings.node.anon

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk extends StObject {
  
  var chunk: js.Any
  
  var encoding: BufferEncoding
}
object Chunk {
  
  @scala.inline
  def apply(chunk: js.Any, encoding: BufferEncoding): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  
  @scala.inline
  implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChunk(value: js.Any): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
