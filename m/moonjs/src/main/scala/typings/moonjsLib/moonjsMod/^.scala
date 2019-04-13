package typings
package moonjsLib.moonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moonjs", JSImport.Namespace)
@js.native
class ^[Props /* <: java.lang.String */, Data, Methods] ()
  extends Instance[Data with Methods with (stdLib.Record[Props, _])] {
  def this(options: ConstructorOptions[Props, Data, Methods]) = this()
}

@JSImport("moonjs", JSImport.Namespace)
@js.native
object ^
  extends org.scalablytyped.runtime.TopLevel[MoonStatic]

