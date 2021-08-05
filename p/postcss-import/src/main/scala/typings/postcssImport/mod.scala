package typings.postcssImport

import typings.postcss.mod.AcceptedPlugin
import typings.postcss.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This plugin can consume local files, node modules or web_modules. To resolve path of an `@import` rule, it can look into root directory (by default `process.cwd()`), `web_modules`, `node_modules`
    * or local modules. _When importing a module, it will look for `index.css` or file referenced in `package.json` in the `style` or `main` fields._ You can also provide manually multiples paths where
    * to look at.
    *
    * **Notes:**
    *
    * - **This plugin should probably be used as the first plugin of your list. This way, other plugins will work on the AST as if there were only a single file to process, and will probably work as you
    *   can expect**.
    * - This plugin works great with [postcss-url](https://github.com/postcss/postcss-url) plugin, which will allow you to adjust assets `url()` (or even inline them) after inlining imported files.
    * - In order to optimize output, **this plugin will only import a file once** on a given scope (root, media query…). Tests are made from the path & the content of imported files (using a hash table).
    *   If this behavior is not what you want, look at `skipDuplicates` option
    * - **If you are looking for glob, or sass like imports (prefixed partials)**, please look at [postcss-easy-import](https://github.com/trysound/postcss-easy-import) (which use this plugin under the
    *   hood).
    * - Imports which are not modified (by `options.filter` or because they are remote imports) are moved to the top of the output.
    * - **This plugin attempts to follow the CSS `@import` spec**; `@import` statements must precede all other statements (besides `@charset`).
    */
  inline def apply(): Transformer = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transformer]
  inline def apply(options: AtImportOptions): Transformer = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transformer]
  
  @JSImport("postcss-import", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AtImportOptions extends StObject {
    
    /**
      * An array of folder names to add to Node's resolver. Values will be appended to the default resolve directories: `["node_modules", "web_modules"]`.
      *
      * This option is only for adding additional directories to default resolver. If you provide your own resolver via the `resolve` configuration option above, then this value will be ignored.
      */
    var addModulesDirectories: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * You can overwrite the default loading way by setting this option. This function gets `(filename, importOptions)` arguments and returns content or promised content.
      */
    var load: js.UndefOr[
        js.Function2[/* filename */ String, /* importOptions */ this.type, String | js.Promise[String]]
      ] = js.undefined
    
    /**
      * A string or an array of paths in where to look for files.
      */
    var path: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * An array of plugins to be applied on each imported files.
      */
    var plugins: js.UndefOr[js.Array[AcceptedPlugin]] = js.undefined
    
    /**
      * You can provide a custom path resolver with this option. This function gets `(id, basedir, importOptions)` arguments and should return a path, an array of paths or a promise resolving to
      * the path(s). If you do not return an absolute path, your path will be resolved to an absolute path using the default resolver. You can use
      * [resolve](https://github.com/substack/node-resolve) for this.
      */
    var resolve: js.UndefOr[
        js.Function3[
          /* id */ String, 
          /* basedir */ String, 
          /* importOptions */ this.type, 
          String | js.Array[String] | (js.Thenable[String | js.Array[String]])
        ]
      ] = js.undefined
    
    /**
      * Define the root where to resolve path (eg: place where `node_modules` are). Should not be used that much.
      *
      * _Note: nested @import will additionally benefit of the relative dirname of imported files._
      *
      * Default: `process.cwd()` or dirname of [the postcss from](https://github.com/postcss/postcss#node-source)
      */
    var root: js.UndefOr[String] = js.undefined
    
    /**
      * By default, similar files (based on the same content) are being skipped. It's to optimize output and skip similar files like `normalize.css` for example. If this behavior is not what you
      * want, just set this option to false to disable it.
      *
      * @default true
      */
    var skipDuplicates: js.UndefOr[Boolean] = js.undefined
  }
  object AtImportOptions {
    
    inline def apply(): AtImportOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtImportOptions]
    }
    
    extension [Self <: AtImportOptions](x: Self) {
      
      inline def setAddModulesDirectories(value: js.Array[String]): Self = StObject.set(x, "addModulesDirectories", value.asInstanceOf[js.Any])
      
      inline def setAddModulesDirectoriesUndefined: Self = StObject.set(x, "addModulesDirectories", js.undefined)
      
      inline def setAddModulesDirectoriesVarargs(value: String*): Self = StObject.set(x, "addModulesDirectories", js.Array(value :_*))
      
      inline def setLoad(value: (/* filename */ String, AtImportOptions) => String | js.Promise[String]): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setPath(value: String | js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setPlugins(value: js.Array[AcceptedPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: AcceptedPlugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setResolve(
        value: (/* id */ String, /* basedir */ String, AtImportOptions) => String | js.Array[String] | (js.Thenable[String | js.Array[String]])
      ): Self = StObject.set(x, "resolve", js.Any.fromFunction3(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSkipDuplicates(value: Boolean): Self = StObject.set(x, "skipDuplicates", value.asInstanceOf[js.Any])
      
      inline def setSkipDuplicatesUndefined: Self = StObject.set(x, "skipDuplicates", js.undefined)
    }
  }
}
