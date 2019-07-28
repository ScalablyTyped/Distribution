package typings.mongoose.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SchemaTypeOptsNs {
  type AsyncPromiseValidationFn[T] = js.Function1[/* value */ T, js.Promise[Boolean]]
  type AsyncValidateFn[T] = js.Function2[/* value */ T, /* done */ js.Function1[/* result */ Boolean, Unit], Unit]
  type DefaultFn[T] = js.Function1[/* repeated */ js.Any, T]
  type RequiredFn[T] = js.Function2[/* required */ Boolean, /* message */ js.UndefOr[String], T]
  type ValidateFn[T] = js.Function1[/* value */ T, Boolean]
}
