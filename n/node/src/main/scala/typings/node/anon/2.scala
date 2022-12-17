package typings.node.anon

import typings.node.fsMod.BufferEncodingOption
import typings.node.nodeStrings.buffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with BufferEncodingOption {
  
  var encoding: buffer_
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(encoding = "buffer")
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
