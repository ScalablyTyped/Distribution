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
  type Thenable[T] = stdLib.PromiseLike[T]
}
