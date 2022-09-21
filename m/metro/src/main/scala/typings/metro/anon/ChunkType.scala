package typings.metro.anon

import typings.metro.metroStrings.worker_stderr_chunk
import typings.metro.reportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkType
  extends StObject
     with ReportableEvent {
  
  var chunk: String
  
  var `type`: worker_stderr_chunk
}
object ChunkType {
  
  inline def apply(chunk: String): ChunkType = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("worker_stderr_chunk")
    __obj.asInstanceOf[ChunkType]
  }
  
  extension [Self <: ChunkType](x: Self) {
    
    inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setType(value: worker_stderr_chunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
