package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdGeneration[T, U] extends StObject {
  
  var connection: js.UndefOr[js.Object | Null] = js.undefined
  
  var idGeneration: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[js.Function1[/* doc */ T, U]] = js.undefined
}
object IdGeneration {
  
  inline def apply[T, U](): IdGeneration[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdGeneration[T, U]]
  }
  
  extension [Self <: IdGeneration[?, ?], T, U](x: Self & (IdGeneration[T, U])) {
    
    inline def setConnection(value: js.Object): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setIdGeneration(value: String): Self = StObject.set(x, "idGeneration", value.asInstanceOf[js.Any])
    
    inline def setIdGenerationUndefined: Self = StObject.set(x, "idGeneration", js.undefined)
    
    inline def setTransform(value: /* doc */ T => U): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
