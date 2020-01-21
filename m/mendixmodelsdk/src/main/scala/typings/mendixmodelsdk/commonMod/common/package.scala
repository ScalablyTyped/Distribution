package typings.mendixmodelsdk.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object common {
  /**
    * Callback interface returning data of some type `T`.
    */
  type ICallback[T] = js.Function1[/* data */ T, scala.Unit]
  /**
    * Callback interface returning an error at most.
    */
  type IErrorCallback = js.Function1[/* err */ js.Any, scala.Unit]
  /**
    * Callback interface returning nothing, not even an error.
    */
  type IVoidCallback = js.Function0[scala.Unit]
}
