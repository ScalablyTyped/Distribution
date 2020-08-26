package typings.nivoPie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typings.nivoPie.mod.PieDatum, java.lang.String]
  type PieMouseEventHandler[T] = js.Function2[
    /* datum */ typings.nivoPie.mod.PieDatum, 
    /* event */ typings.react.mod.MouseEvent[T, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}
