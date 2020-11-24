package typings.poi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.poi.anon.CacheDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://poi.js.org/api.html#constructor-argv
  */
@js.native
trait PoiCore extends js.Object {
  
  var cli: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CAC */ js.Any = js.native
  
  /** The current running command */
  var command: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CAC * / any['command'] */ js.Any = js.native
  
  var config: Config = js.native
  
  var configLoader: ConfigLoader = js.native
  
  def createWebpackChain(): typings.webpackChain.mod.^ = js.native
  def createWebpackChain(opts: StringDictionary[js.Any]): typings.webpackChain.mod.^ = js.native
  
  def createWebpackCompiler(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any
  ): js.Any = js.native
  
  def getCacheConfig(dir: String, keys: StringDictionary[String], files: js.Array[String]): CacheDirectory = js.native
  
  /** Check if a package is included in the `dependencies` or `devDependencies` field your `package.json` */
  def hasDependency(name: String): Boolean = js.native
  
  def hasPlugin(name: String): Boolean = js.native
  
  def hook(hookName: String, handler: HookHandler): Unit = js.native
  
  var isProd: Boolean = js.native
  
  def localRequire(pkg: String): js.Any = js.native
  def localRequire(pkg: String, cwd: String): js.Any = js.native
  
  def localResolve(pkg: String): String | Null = js.native
  def localResolve(pkg: String, cwd: String): String | Null = js.native
  
  var mode: Mode = js.native
  
  def resolveCwd(args: String*): String = js.native
  
  def resolveOutDir(args: String*): String = js.native
  
  def run(): js.Promise[Unit] = js.native
}
