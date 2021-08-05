package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.BaseEncodingOptions & {  withFileTypes :true} */
trait BaseEncodingOptionswithFiEncoding extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  
  var withFileTypes: `true`
}
object BaseEncodingOptionswithFiEncoding {
  
  inline def apply(): BaseEncodingOptionswithFiEncoding = {
    val __obj = js.Dynamic.literal(withFileTypes = true)
    __obj.asInstanceOf[BaseEncodingOptionswithFiEncoding]
  }
  
  extension [Self <: BaseEncodingOptionswithFiEncoding](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
  }
}
