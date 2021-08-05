package typings.node.anon

import typings.node.BufferEncoding
import typings.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.BaseEncodingOptions & {  withFileTypes :false | undefined} */
trait BaseEncodingOptionswithFi extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}
object BaseEncodingOptionswithFi {
  
  inline def apply(): BaseEncodingOptionswithFi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEncodingOptionswithFi]
  }
  
  extension [Self <: BaseEncodingOptionswithFi](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
