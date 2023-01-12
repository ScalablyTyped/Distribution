package typings.orgRegex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(): js.RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.RegExp]
  inline def apply(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  @JSImport("org-regex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Only match an exact string. By default, it matches any organization names in a string. Useful with `RegExp#test()` to check if a string is a organization name.
    		@default false
    		*/
    val exact: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    }
  }
}
