package typings.pathParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRulesMod {
  
  @JSImport("path-parser/dist/rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("path-parser/dist/rules", JSImport.Default)
  @js.native
  val default: js.Array[IRule] = js.native
  
  inline def defaultOrConstrained(`match`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOrConstrained")(`match`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IRule extends StObject {
    
    var name: String
    
    var pattern: js.RegExp
    
    var regex: js.UndefOr[js.RegExp | RegExpFactory] = js.undefined
  }
  object IRule {
    
    inline def apply(name: String, pattern: js.RegExp): IRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRule] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: js.RegExp | RegExpFactory): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexFunction1(value: /* match */ Any => js.RegExp): Self = StObject.set(x, "regex", js.Any.fromFunction1(value))
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  type RegExpFactory = js.Function1[/* match */ Any, js.RegExp]
}
