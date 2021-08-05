package typings.node.anon

import typings.node.BufferEncoding
import typings.node.fsMod.OpenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingFlag extends StObject {
  
  var encoding: BufferEncoding
  
  var flag: js.UndefOr[OpenMode] = js.undefined
}
object EncodingFlag {
  
  inline def apply(encoding: BufferEncoding): EncodingFlag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingFlag]
  }
  
  extension [Self <: EncodingFlag](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: OpenMode): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
