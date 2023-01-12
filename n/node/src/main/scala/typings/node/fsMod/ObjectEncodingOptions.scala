package typings.node.fsMod

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectEncodingOptions
  extends StObject
     with _EncodingOption {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
}
object ObjectEncodingOptions {
  
  inline def apply(): ObjectEncodingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectEncodingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectEncodingOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
