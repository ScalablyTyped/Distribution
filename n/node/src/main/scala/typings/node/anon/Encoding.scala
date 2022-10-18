package typings.node.anon

import typings.node.fsMod.BufferEncodingOption
import typings.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encoding
  extends StObject
     with BufferEncodingOption {
  
  var encoding: buffer_
}
object Encoding {
  
  inline def apply(): Encoding = {
    val __obj = js.Dynamic.literal(encoding = "buffer")
    __obj.asInstanceOf[Encoding]
  }
  
  extension [Self <: Encoding](x: Self) {
    
    inline def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
