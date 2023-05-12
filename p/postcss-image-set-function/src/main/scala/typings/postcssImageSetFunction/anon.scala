package typings.postcssImageSetFunction

import typings.postcss.mod.Declaration
import typings.postcss.mod.Postcss
import typings.postcss.mod.Result
import typings.postcssImageSetFunction.postcssImageSetFunctionBooleans.`false`
import typings.postcssImageSetFunction.postcssImageSetFunctionStrings.`throw`
import typings.postcssImageSetFunction.postcssImageSetFunctionStrings.ignore
import typings.postcssImageSetFunction.postcssImageSetFunctionStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decl extends StObject {
    
    var decl: Declaration
    
    var oninvalid: warn | `throw` | ignore | `false`
    
    var postcss: Postcss
    
    var preserve: Boolean
    
    var result: Result
  }
  object Decl {
    
    inline def apply(
      decl: Declaration,
      oninvalid: warn | `throw` | ignore | `false`,
      postcss: Postcss,
      preserve: Boolean,
      result: Result
    ): Decl = {
      val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], oninvalid = oninvalid.asInstanceOf[js.Any], postcss = postcss.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Decl] (val x: Self) extends AnyVal {
      
      inline def setDecl(value: Declaration): Self = StObject.set(x, "decl", value.asInstanceOf[js.Any])
      
      inline def setOninvalid(value: warn | `throw` | ignore | `false`): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setPostcss(value: Postcss): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
