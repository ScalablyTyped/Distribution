package typings
package parseDashGitDashConfigLib.parseDashGitDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-git-config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[Config | scala.Null] = js.native
  /**
    * Asynchronously parse a `.git/config` file. If only the callback is passed,
    * the `.git/config` file relative to `process.cwd()` is used.
    *
    * @example ```js
    * parse((err, config) => {
    *   if (err) throw err;
    *   // do stuff with config
    * });
    *
    * // or, using async/await
    * (async () => {
    *   console.log(await parse());
    *   console.log(await parse({ cwd: 'foo' }));
    *   console.log(await parse({ cwd: 'foo', path: 'some/.git/config' }));
    * })();
    * ```
    * @param options Options with `cwd` or `path`, the cwd to use, or the callback function.
    * @param callback callback function if the first argument is options or cwd.
    */
  def apply(cb: ParseCallback): scala.Unit = js.native
  def apply(options: Options | java.lang.String): js.Promise[Config | scala.Null] = js.native
  def apply(options: Options | java.lang.String, cb: ParseCallback): scala.Unit = js.native
  /**
    * Returns an object with only the properties that had ini-style keys
    * converted to objects.
    *
    * @example ```js
    * const config = parse.sync({ path: '/path/to/.gitconfig' });
    * const obj = parse.expandKeys(config);
    * ```
    * @param config The parsed git config object.
    */
  def expandKeys(config: Config): Config = js.native
  /**
    * Asynchronously parse a .git/config file. Returns a promise.
    * Resolves with `null` if unable to resolve path to the git config file.
    * If no arguments are passed, the .git/config file relative to process.cwd() is used.
    */
  def promise(): js.Promise[Config | scala.Null] = js.native
  def promise(options: java.lang.String): js.Promise[Config | scala.Null] = js.native
  def promise(options: Options): js.Promise[Config | scala.Null] = js.native
  /**
    * Resolve the git config path
    */
  def resolveConfigPath(options: java.lang.String): java.lang.String | scala.Null = js.native
  def resolveConfigPath(options: ResolveConfigOptions): java.lang.String | scala.Null = js.native
  /**
    * Synchronously parse a `.git/config` file. If no arguments are passed,
    * the `.git/config` file relative to `process.cwd()` is used.
    *
    * @example ```js
    * console.log(parse.sync());
    * console.log(parse.sync({ cwd: 'foo' }));
    * console.log(parse.sync({ cwd: 'foo', path: 'some/.git/config' }));
    * ```
    * @param options Options with `cwd` or `path`, or the cwd to use.
    */
  def sync(): Config = js.native
  def sync(options: java.lang.String): Config = js.native
  def sync(options: Options): Config = js.native
}

