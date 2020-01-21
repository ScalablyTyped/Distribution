package typings.nivoStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DatumToNumber = js.Function1[/* datum */ typings.nivoStream.mod.Datum, scala.Double]
  type StackFunc[T] = js.Function1[/* data */ js.Array[T], js.Array[js.Array[typings.nivoStream.Anon0[T]]]]
  type TooltipFormatter[T] = js.Function1[/* value */ T, typings.react.mod.ReactNode]
  type TooltipLabel[T] = js.Function1[/* value */ T, java.lang.String]
}
