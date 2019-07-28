package typings.mendixmodelsdk.distCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonNs {
  /**
    * Callback interface returning data of some type `T`.
    */
  type ICallback[T] = js.Function1[/* data */ T, Unit]
  /**
    * Callback interface returning an error at most.
    */
  type IErrorCallback = js.Function1[/* err */ js.Any, Unit]
  /**
    * Callback interface returning nothing, not even an error.
    */
  type IVoidCallback = js.Function0[Unit]
}
