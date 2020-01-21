package typings.moonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentOptions[Props /* <: java.lang.String */, Data, Methods] = (typings.moonjs.mod.ComponentOptionsProperties[Props, js.Function0[Data], Methods]) with (typings.std.ThisType[
    typings.moonjs.mod.Instance[Data with Methods with (typings.std.Record[Props, _])]
  ])
  type ConstructorOptions[Props /* <: java.lang.String */, Data, Methods] = (typings.moonjs.mod.ComponentOptionsProperties[Props, js.Function0[Data] | Data, Methods]) with (typings.std.ThisType[
    typings.moonjs.mod.Instance[Data with Methods with (typings.std.Record[Props, _])]
  ])
}
