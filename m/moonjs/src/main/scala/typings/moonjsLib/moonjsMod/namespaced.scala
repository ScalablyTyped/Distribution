package typings
package moonjsLib.moonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moonjs", JSImport.Namespace)
@js.native
class namespaced[Props /* <: java.lang.String */, Data, Methods] ()
  extends moonjsLib.moonjsMod.MoonNs.Instance[Data with Methods with (stdLib.Record[Props, _])] {
  def this(options: moonjsLib.moonjsMod.MoonNs.ConstructorOptions[Props, Data, Methods]) = this()
}

