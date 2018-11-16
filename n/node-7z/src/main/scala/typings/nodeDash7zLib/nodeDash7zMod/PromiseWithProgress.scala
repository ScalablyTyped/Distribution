package typings
package nodeDash7zLib.nodeDash7zMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// node-7z uses `when` promises which have a progress method, however they are deprecated
// internally node-7z uses the progress events to emit files that are extracted,
// (also the progress event emits an array of strings, which doesn't correlate with any promise<T>)
// so instead of patching `when` promises I'm extending the generic Promise for use internally
@js.native
trait PromiseWithProgress[T]
  extends stdLib.Promise[T] {
  def progress(progress: js.Function1[/* files */ js.Array[java.lang.String], scala.Unit]): this.type = js.native
}

