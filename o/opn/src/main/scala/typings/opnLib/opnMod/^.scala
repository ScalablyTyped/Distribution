package typings
package opnLib.opnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Uses the command `open` on OS X, `start` on Windows and `xdg-open` on other platforms.
    *
    * Returns a promise for the spawned child process. You would normally not need to use this for
    * anything, but it can be useful if you'd like to attach custom event listeners or perform
    * other operations directly on the spawned process.
    *
    * @param target The thing you want to open. Can be a URL, file, or executable.
    *     Opens in the default app for the file type. For example, URLs open in your default
    *     browser.
    * @param options Options to be passed to opn.
    */
  def apply(target: java.lang.String): js.Promise[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
  def apply(target: java.lang.String, options: opnLib.opnMod.OpnNs.Options): js.Promise[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
}

