package typings.moonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object moonjsMod {
  import typings.std.Record
  import typings.std.ThisType

  type ComponentOptions[Props /* <: String */, Data, Methods] = (ComponentOptionsProperties[Props, js.Function0[Data], Methods]) with (ThisType[Instance[Data with Methods with (Record[Props, _])]])
  type ConstructorOptions[Props /* <: String */, Data, Methods] = (ComponentOptionsProperties[Props, js.Function0[Data] | Data, Methods]) with (ThisType[Instance[Data with Methods with (Record[Props, _])]])
}
