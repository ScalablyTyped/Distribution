package typings.node.anon

import typings.node.bufferMod.global.BufferEncoding
import typings.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recursive extends StObject {
  
  var encoding: BufferEncoding | Null
  
  var recursive: js.UndefOr[Boolean] = js.undefined
  
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}
object Recursive {
  
  inline def apply(): Recursive = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[Recursive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recursive] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
