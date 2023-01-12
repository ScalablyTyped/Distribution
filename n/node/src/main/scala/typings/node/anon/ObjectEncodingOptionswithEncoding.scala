package typings.node.anon

import typings.node.bufferMod.global.BufferEncoding
import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.ObjectEncodingOptions & {  withFileTypes :true} */
trait ObjectEncodingOptionswithEncoding extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  
  var withFileTypes: `true`
}
object ObjectEncodingOptionswithEncoding {
  
  inline def apply(): ObjectEncodingOptionswithEncoding = {
    val __obj = js.Dynamic.literal(withFileTypes = true)
    __obj.asInstanceOf[ObjectEncodingOptionswithEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectEncodingOptionswithEncoding] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
  }
}
