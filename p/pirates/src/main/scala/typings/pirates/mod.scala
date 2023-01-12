package typings.pirates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pirates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addHook(hook: Hook): RevertFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("addHook")(hook.asInstanceOf[js.Any]).asInstanceOf[RevertFunction]
  inline def addHook(hook: Hook, opts: Options): RevertFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("addHook")(hook.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RevertFunction]
  
  type Hook = js.Function2[/* code */ String, /* filename */ String, String]
  
  /**
    * A matcher function, will be called with path to a file.
    *
    * Should return truthy if the file should be hooked, falsy otherwise.
    */
  type Matcher = js.Function1[/* path */ String, Boolean]
  
  trait Options extends StObject {
    
    /**
      * The extensions to hook. Should start with '.' (ex. ['.js']).
      *
      * @default ['.js']
      */
    var ext: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * The extensions to hook. Should start with '.' (ex. ['.js']).
      *
      * Takes precedence over `ext`.
      *
      * @alias ext
      * @default ['.js']
      */
    var `extension`: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * The extensions to hook. Should start with '.' (ex. ['.js']).
      *
      * Takes precedence over `exts`, `extension` and `ext`.
      *
      * @alias exts
      * @alias extension
      * @alias ext
      * @default ['.js']
      */
    var extensions: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * The extensions to hook. Should start with '.' (ex. ['.js']).
      *
      * Takes precedence over `extension` and `ext`.
      *
      * @alias extension
      * @alias ext
      * @default ['.js']
      */
    var exts: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /**
      * Auto-ignore node_modules. Independent of any matcher.
      *
      * @default true
      */
    var ignoreNodeModules: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A matcher function, will be called with path to a file.
      *
      * Should return truthy if the file should be hooked, falsy otherwise.
      */
    var matcher: js.UndefOr[Matcher | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExt(value: js.Array[String] | String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setExtVarargs(value: String*): Self = StObject.set(x, "ext", js.Array(value*))
      
      inline def setExtension(value: js.Array[String] | String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setExtensionVarargs(value: String*): Self = StObject.set(x, "extension", js.Array(value*))
      
      inline def setExtensions(value: js.Array[String] | String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setExts(value: js.Array[String] | String): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
      
      inline def setExtsUndefined: Self = StObject.set(x, "exts", js.undefined)
      
      inline def setExtsVarargs(value: String*): Self = StObject.set(x, "exts", js.Array(value*))
      
      inline def setIgnoreNodeModules(value: Boolean): Self = StObject.set(x, "ignoreNodeModules", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNodeModulesUndefined: Self = StObject.set(x, "ignoreNodeModules", js.undefined)
      
      inline def setMatcher(value: /* path */ String => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setMatcherNull: Self = StObject.set(x, "matcher", null)
      
      inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
    }
  }
  
  /**
    * Reverts the hook when called.
    */
  type RevertFunction = js.Function0[Unit]
}
