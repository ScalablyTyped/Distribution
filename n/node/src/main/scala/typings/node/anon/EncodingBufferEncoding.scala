package typings.node.anon

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingBufferEncoding extends StObject {
  
  var encoding: BufferEncoding
  
  var flag: js.UndefOr[String] = js.undefined
}
object EncodingBufferEncoding {
  
  @scala.inline
  def apply(encoding: BufferEncoding): EncodingBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingBufferEncoding]
  }
  
  @scala.inline
  implicit class EncodingBufferEncodingMutableBuilder[Self <: EncodingBufferEncoding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
