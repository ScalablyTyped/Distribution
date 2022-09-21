package typings.mz.anon

import typings.mz.mzBooleans.`false`
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithFileTypes extends StObject {
  
  var encoding: BufferEncoding | Null
  
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}
object WithFileTypes {
  
  inline def apply(): WithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[WithFileTypes]
  }
  
  extension [Self <: WithFileTypes](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
