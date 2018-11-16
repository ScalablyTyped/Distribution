package typings
package monacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object monacoDashEditorMod {
  type IEvent[T] = js.Function2[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArg */ js.UndefOr[js.Any], 
    IDisposable
  ]
  type ProgressCallback[TProgress] = js.Function1[/* progress */ TProgress, scala.Unit]
  type TValueCallback[T] = js.Function1[/* value */ T | stdLib.PromiseLike[T], scala.Unit]
  type Thenable[T] = stdLib.PromiseLike[T]
}
