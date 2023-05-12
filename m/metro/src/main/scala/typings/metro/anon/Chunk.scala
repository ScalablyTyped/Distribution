package typings.metro.anon

import typings.metro.metroStrings.worker_stdout_chunk
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk
  extends StObject
     with ReportableEvent {
  
  var chunk: String
  
  var `type`: worker_stdout_chunk
}
object Chunk {
  
  inline def apply(chunk: String): Chunk = {
    val __obj = js.Dynamic.literal(chunk = chunk.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("worker_stdout_chunk")
    __obj.asInstanceOf[Chunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
    
    inline def setChunk(value: String): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setType(value: worker_stdout_chunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
