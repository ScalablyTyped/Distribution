package typings.parcelTypes.anon

import typings.parcelTypes.mod.AST
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ast extends StObject {
  
  var ast: AST
  
  var logger: PluginLogger
  
  var options: PluginOptions
}
object Ast {
  
  inline def apply(ast: AST, logger: PluginLogger, options: PluginOptions): Ast = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ast]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ast] (val x: Self) extends AnyVal {
    
    inline def setAst(value: AST): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
