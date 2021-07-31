package typings.pathParser

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rulesMod {
  
  @JSImport("path-parser/dist/rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("path-parser/dist/rules", JSImport.Default)
  @js.native
  val default: js.Array[IRule] = js.native
  
  @scala.inline
  def defaultOrConstrained(`match`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOrConstrained")(`match`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait IRule extends StObject {
    
    var name: String
    
    var pattern: RegExp
    
    var regex: js.UndefOr[RegExp | RegExpFactory] = js.undefined
  }
  object IRule {
    
    @scala.inline
    def apply(name: String, pattern: RegExp): IRule = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRule]
    }
    
    @scala.inline
    implicit class IRuleMutableBuilder[Self <: IRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: RegExp | RegExpFactory): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexFunction1(value: /* match */ js.Any => RegExp): Self = StObject.set(x, "regex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  type RegExpFactory = js.Function1[/* match */ js.Any, RegExp]
}
