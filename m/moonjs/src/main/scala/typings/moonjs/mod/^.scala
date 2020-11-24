package typings.moonjs.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("moonjs", JSImport.Namespace)
@js.native
class ^[Props /* <: String */, Data, Methods] () extends Instance[Data with Methods with (Record[Props, _])] {
  def this(options: ConstructorOptions[Props, Data, Methods]) = this()
}
@JSImport("moonjs", JSImport.Namespace)
@js.native
object ^ extends TopLevel[MoonStatic]
