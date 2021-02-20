package typings.orgRegex

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** 
  	@example
  	```
  	import orgRegex from  'org-regex';
  	orgRegex({exact: true}).test('@ava');
  	//=> true
  	'foo @ava bar @ava/init'.match(orgRegex());
  	//=> ['@ava']
  	```
  	*/
  @JSImport("org-regex", JSImport.Namespace)
  @js.native
  def apply(): RegExp = js.native
  @JSImport("org-regex", JSImport.Namespace)
  @js.native
  def apply(options: Options): RegExp = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Only match an exact string. By default, it matches any organization names in a string. Useful with `RegExp#test()` to check if a string is a organization name.
    		@default false
    		*/
    val exact: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    }
  }
}
