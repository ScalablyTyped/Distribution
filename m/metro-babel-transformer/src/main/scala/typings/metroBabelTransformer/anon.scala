package typings.metroBabelTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ast extends StObject {
    
    var ast: Any
    
    var functionMap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FBSourceFunctionMap */ Any) | Null
  }
  object Ast {
    
    inline def apply(ast: Any): Ast = {
      val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], functionMap = null)
      __obj.asInstanceOf[Ast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ast] (val x: Self) extends AnyVal {
      
      inline def setAst(value: Any): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setFunctionMap(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FBSourceFunctionMap */ Any
      ): Self = StObject.set(x, "functionMap", value.asInstanceOf[js.Any])
      
      inline def setFunctionMapNull: Self = StObject.set(x, "functionMap", null)
    }
  }
}
