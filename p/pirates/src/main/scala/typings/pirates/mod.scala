package typings.pirates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pirates", "addHook")
  @js.native
  def addHook(hook: Hook): RevertFunction = js.native
  @JSImport("pirates", "addHook")
  @js.native
  def addHook(hook: Hook, opts: Options): RevertFunction = js.native
  
  type Hook = js.Function2[/* code */ String, /* filename */ String, String]
  
  type Matcher = js.Function1[/* code */ String, Boolean]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The extensions to hook. Should start with '.' (ex. ['.js']).
      *
      * @default ['.js']
      */
    var exts: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Auto-ignore node_modules. Independent of any matcher.
      *
      * @default true
      */
    var ignoreNodeModules: js.UndefOr[Boolean] = js.native
    
    /** A matcher function, will be called with path to a file. Should return truthy if the file should be hooked, falsy otherwise. */
    var matcher: js.UndefOr[Matcher] = js.native
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
      def setExts(value: js.Array[String]): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtsUndefined: Self = StObject.set(x, "exts", js.undefined)
      
      @scala.inline
      def setExtsVarargs(value: String*): Self = StObject.set(x, "exts", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreNodeModules(value: Boolean): Self = StObject.set(x, "ignoreNodeModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNodeModulesUndefined: Self = StObject.set(x, "ignoreNodeModules", js.undefined)
      
      @scala.inline
      def setMatcher(value: /* code */ String => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    }
  }
  
  type RevertFunction = js.Function0[Unit]
}
