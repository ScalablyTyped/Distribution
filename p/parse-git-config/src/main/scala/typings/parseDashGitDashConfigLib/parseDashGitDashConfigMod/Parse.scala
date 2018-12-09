package typings
package parseDashGitDashConfigLib.parseDashGitDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parse extends js.Object {
  /**
       * Asynchronously parse a .git/config file. Returns a promise.
       * Resolves with `null` if unable to resolve path to the git config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def apply(): js.Promise[Config | scala.Null] = js.native
  /**
       * Asynchronously parse a .git/config file.
       * If only the callback is passed, the .git/config file relative to process.cwd() is used.
       */
  def apply(cb: parseDashGitDashConfigLib.ParseCallback): scala.Unit = js.native
  /**
       * Asynchronously parse a .git/config file. Returns a promise.
       * Resolves with `null` if unable to resolve path to the git config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def apply(options: java.lang.String): js.Promise[Config | scala.Null] = js.native
  /**
       * Asynchronously parse a .git/config file.
       * If only the callback is passed, the .git/config file relative to process.cwd() is used.
       */
  def apply(options: java.lang.String, cb: parseDashGitDashConfigLib.ParseCallback): scala.Unit = js.native
  /**
       * Asynchronously parse a .git/config file. Returns a promise.
       * Resolves with `null` if unable to resolve path to the git config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def apply(options: js.Object): js.Promise[Config | scala.Null] = js.native
  /**
       * Asynchronously parse a .git/config file.
       * If only the callback is passed, the .git/config file relative to process.cwd() is used.
       */
  def apply(options: js.Object, cb: parseDashGitDashConfigLib.ParseCallback): scala.Unit = js.native
  /**
       * Asynchronously parse a .git/config file. Returns a promise.
       * Resolves with `null` if unable to resolve path to the git config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def apply(options: Options): js.Promise[Config | scala.Null] = js.native
  /**
       * Asynchronously parse a .git/config file.
       * If only the callback is passed, the .git/config file relative to process.cwd() is used.
       */
  def apply(options: Options, cb: parseDashGitDashConfigLib.ParseCallback): scala.Unit = js.native
  /**
       * Returns an object with only the properties that had ini-style keys converted to objects.
       */
  def expandKeys(config: Config): Config = js.native
  /**
       * Asynchronously parse a .git/config file. Returns a promise.
       * Resolves with `null` if unable to resolve path to the git config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def promise(): js.Promise[Config | scala.Null] = js.native
  /**
       * Asynchronously parse a .git/config file. Returns a promise.
       * Resolves with `null` if unable to resolve path to the git config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def promise(options: java.lang.String): js.Promise[Config | scala.Null] = js.native
  /**
       * Asynchronously parse a .git/config file. Returns a promise.
       * Resolves with `null` if unable to resolve path to the git config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def promise(options: js.Object): js.Promise[Config | scala.Null] = js.native
  /**
       * Asynchronously parse a .git/config file. Returns a promise.
       * Resolves with `null` if unable to resolve path to the git config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def promise(options: Options): js.Promise[Config | scala.Null] = js.native
  /**
       * Synchronously parse a .git/config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def sync(): Config = js.native
  /**
       * Synchronously parse a .git/config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def sync(options: java.lang.String): Config = js.native
  /**
       * Synchronously parse a .git/config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def sync(options: js.Object): Config = js.native
  /**
       * Synchronously parse a .git/config file.
       * If no arguments are passed, the .git/config file relative to process.cwd() is used.
       */
  def sync(options: Options): Config = js.native
}

