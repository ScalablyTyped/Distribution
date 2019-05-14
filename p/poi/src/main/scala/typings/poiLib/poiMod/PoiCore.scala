package typings
package poiLib.poiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://poi.js.org/api.html#constructor-argv
  */
@js.native
trait PoiCore extends js.Object {
  var cli: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CAC */ js.Any = js.native
  /** The current running command */
  var command: /* import warning: ImportType.apply Failed type conversion: any['command'] */ js.Any = js.native
  var config: Config = js.native
  var configLoader: ConfigLoader = js.native
  var isProd: scala.Boolean = js.native
  var mode: Mode = js.native
  def createWebpackChain(): webpackDashChainLib.webpackDashChainMod.^ = js.native
  def createWebpackChain(opts: org.scalablytyped.runtime.StringDictionary[js.Any]): webpackDashChainLib.webpackDashChainMod.^ = js.native
  def createWebpackCompiler(config: webpackLib.webpackMod.Configuration): webpackLib.webpackMod.ICompiler = js.native
  def getCacheConfig(
    dir: java.lang.String,
    keys: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    files: js.Array[java.lang.String]
  ): poiLib.Anon_CacheDirectory = js.native
  /** Check if a package is included in the `dependencies` or `devDependencies` field your `package.json` */
  def hasDependency(name: java.lang.String): scala.Boolean = js.native
  def hasPlugin(name: java.lang.String): scala.Boolean = js.native
  def hook(hookName: java.lang.String, handler: HookHandler): scala.Unit = js.native
  def localRequire(pkg: java.lang.String): js.Any = js.native
  def localRequire(pkg: java.lang.String, cwd: java.lang.String): js.Any = js.native
  def localResolve(pkg: java.lang.String): java.lang.String | scala.Null = js.native
  def localResolve(pkg: java.lang.String, cwd: java.lang.String): java.lang.String | scala.Null = js.native
  def resolveCwd(args: java.lang.String*): java.lang.String = js.native
  def resolveOutDir(args: java.lang.String*): java.lang.String = js.native
  def run(): js.Promise[scala.Unit] = js.native
}

