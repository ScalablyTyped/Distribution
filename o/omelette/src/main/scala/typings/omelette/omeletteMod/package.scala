package typings.omelette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object omeletteMod {
  import org.scalablytyped.runtime.StringDictionary

  type Callback = js.Function1[/* obj */ CallbackValue, Unit]
  type CallbackAsync = js.Function1[/* obj */ CallbackAsyncValue, js.Promise[Unit]]
  type Choices = js.Array[String]
  type ReplyFn[T] = js.Function1[/* value */ T, Unit]
  type TemplatePrimativeValue = String | Choices
  type TemplateValue = TemplatePrimativeValue | Callback
  type TreeValue = StringDictionary[Choices]
}
