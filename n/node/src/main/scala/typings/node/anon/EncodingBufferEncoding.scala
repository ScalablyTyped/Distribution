package typings.node.anon

import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.OpenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingBufferEncoding extends StObject {
  
  var encoding: BufferEncoding
  
  var flag: js.UndefOr[OpenMode] = js.undefined
}
object EncodingBufferEncoding {
  
  inline def apply(encoding: BufferEncoding): EncodingBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingBufferEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodingBufferEncoding] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: OpenMode): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
