package typings.atNivoStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoStreamMod {
  import typings.atNivoStream.Anon_0
  import typings.react.reactMod.ReactNode

  type DatumToNumber = js.Function1[/* datum */ Datum, Double]
  type StackFunc[T] = js.Function1[/* data */ js.Array[T], js.Array[js.Array[Anon_0[T]]]]
  type TooltipFormatter[T] = js.Function1[/* value */ T, ReactNode]
  type TooltipLabel[T] = js.Function1[/* value */ T, String]
}
