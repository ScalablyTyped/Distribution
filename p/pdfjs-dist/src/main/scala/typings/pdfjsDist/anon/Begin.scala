package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Begin extends StObject {
  
  var begin: Any
  
  var chunk: Any
}
object Begin {
  
  inline def apply(begin: Any, chunk: Any): Begin = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], chunk = chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Begin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Begin] (val x: Self) extends AnyVal {
    
    inline def setBegin(value: Any): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setChunk(value: Any): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
  }
}
