package typings.phin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phinMod {
  import typings.phin.Anon_Data
  import typings.phin.Anon_Form
  import typings.std.Error
  import typings.std.NonNullable

  type ICallback[T] = js.Function2[/* error */ Null, /* response */ NonNullable[T], Unit]
  // NOTE: Typescript cannot infer type of union callback on the consumer side
  // https://github.com/Microsoft/TypeScript/pull/17819#issuecomment-363636904
  type IErrorCallback = js.Function2[/* error */ Error | String, /* response */ Null, Unit]
  // Form and data property has been written this way so they're mutually exclusive.
  type IWithData[T /* <: js.Object */] = T with Anon_Data
  type IWithForm[T /* <: js.Object */] = T with Anon_Form
}
