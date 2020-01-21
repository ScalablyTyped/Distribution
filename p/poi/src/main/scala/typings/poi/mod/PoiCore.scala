package typings.poi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.poi.AnonCacheDirectory
import typings.webpack.mod.Configuration
import typings.webpack.mod.ICompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var isProd: Boolean = js.native
  var mode: Mode = js.native
  def createWebpackChain(): typings.webpackChain.mod.^ = js.native
  def createWebpackChain(opts: StringDictionary[js.Any]): typings.webpackChain.mod.^ = js.native
  def createWebpackCompiler(config: Configuration): ICompiler = js.native
  def getCacheConfig(dir: String, keys: StringDictionary[String], files: js.Array[String]): AnonCacheDirectory = js.native
  /** Check if a package is included in the `dependencies` or `devDependencies` field your `package.json` */
  def hasDependency(name: String): Boolean = js.native
  def hasPlugin(name: String): Boolean = js.native
  def hook(hookName: String, handler: HookHandler): Unit = js.native
  def localRequire(pkg: String): js.Any = js.native
  def localRequire(pkg: String, cwd: String): js.Any = js.native
  def localResolve(pkg: String): String | Null = js.native
  def localResolve(pkg: String, cwd: String): String | Null = js.native
  def resolveCwd(args: String*): String = js.native
  def resolveOutDir(args: String*): String = js.native
  def run(): js.Promise[Unit] = js.native
}

