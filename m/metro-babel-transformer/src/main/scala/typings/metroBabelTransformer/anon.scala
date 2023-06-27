package typings.metroBabelTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ast extends StObject {
    
    var ast: Any
    
    var metadata: Any
  }
  object Ast {
    
    inline def apply(ast: Any, metadata: Any): Ast = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ast] (val x: Self) extends AnyVal {
      
      inline def setAst(value: Any): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    }
  }
}
