package typings.node.childProcessMod

import typings.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpawnSyncOptionsWithBufferEncoding
  extends StObject
     with SpawnSyncOptions {
  
  @JSName("encoding")
  var encoding_SpawnSyncOptionsWithBufferEncoding: js.UndefOr[buffer_ | Null] = js.undefined
}
object SpawnSyncOptionsWithBufferEncoding {
  
  @scala.inline
  def apply(): SpawnSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnSyncOptionsWithBufferEncoding]
  }
  
  @scala.inline
  implicit class SpawnSyncOptionsWithBufferEncodingMutableBuilder[Self <: SpawnSyncOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
