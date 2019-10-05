package typings.parseDashGitDashConfig.parseDashGitDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-git-config", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Promise[Config | Null] = js.native
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
  def apply(cb: ParseCallback): Unit = js.native
  def apply(options: String): js.Promise[Config | Null] = js.native
  def apply(options: String, cb: ParseCallback): Unit = js.native
  def apply(options: Options): js.Promise[Config | Null] = js.native
  def apply(options: Options, cb: ParseCallback): Unit = js.native
}

