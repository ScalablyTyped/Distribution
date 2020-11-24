package typings.postcssImport.mod

import typings.postcss.mod.AcceptedPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtImportOptions extends js.Object {
  
  /**
    * An array of folder names to add to Node's resolver. Values will be appended to the default resolve directories: `["node_modules", "web_modules"]`.
    *
    * This option is only for adding additional directories to default resolver. If you provide your own resolver via the `resolve` configuration option above, then this value will be ignored.
    */
  var addModulesDirectories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * You can overwrite the default loading way by setting this option. This function gets `(filename, importOptions)` arguments and returns content or promised content.
    */
  var load: js.UndefOr[
    js.Function2[/* filename */ String, /* importOptions */ this.type, String | js.Promise[String]]
  ] = js.native
  
  /**
    * A string or an array of paths in where to look for files.
    */
  var path: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * An array of plugins to be applied on each imported files.
    */
  var plugins: js.UndefOr[js.Array[AcceptedPlugin]] = js.native
  
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
  ] = js.native
  
  /**
    * Define the root where to resolve path (eg: place where `node_modules` are). Should not be used that much.
    *
    * _Note: nested @import will additionally benefit of the relative dirname of imported files._
    *
    * Default: `process.cwd()` or dirname of [the postcss from](https://github.com/postcss/postcss#node-source)
    */
  var root: js.UndefOr[String] = js.native
  
  /**
    * By default, similar files (based on the same content) are being skipped. It's to optimize output and skip similar files like `normalize.css` for example. If this behavior is not what you
    * want, just set this option to false to disable it.
    *
    * @default true
    */
  var skipDuplicates: js.UndefOr[Boolean] = js.native
}
object AtImportOptions {
  
  @scala.inline
  def apply(): AtImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtImportOptions]
  }
  
  @scala.inline
  implicit class AtImportOptionsOps[Self <: AtImportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddModulesDirectoriesVarargs(value: String*): Self = this.set("addModulesDirectories", js.Array(value :_*))
    
    @scala.inline
    def setAddModulesDirectories(value: js.Array[String]): Self = this.set("addModulesDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddModulesDirectories: Self = this.set("addModulesDirectories", js.undefined)
    
    @scala.inline
    def setLoad(value: (/* filename */ String, AtImportOptions) => String | js.Promise[String]): Self = this.set("load", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String | js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: AcceptedPlugin*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[AcceptedPlugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setResolve(
      value: (/* id */ String, /* basedir */ String, AtImportOptions) => String | js.Array[String] | (js.Thenable[String | js.Array[String]])
    ): Self = this.set("resolve", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSkipDuplicates(value: Boolean): Self = this.set("skipDuplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipDuplicates: Self = this.set("skipDuplicates", js.undefined)
  }
}
