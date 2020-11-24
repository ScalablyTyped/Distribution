package typings.preact.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("preact", "Fragment")
@js.native
class Fragment protected ()
  extends Component[js.Object, js.Object] {
  def this(props: js.Object) = this()
  def this(props: js.Object, context: js.Any) = this()
}
//
// Preact Built-in Components
// -----------------------------------
// TODO: Revisit what the public type of this is...
@JSImport("preact", "Fragment")
@js.native
object Fragment
  extends TopLevel[ComponentClass[js.Object, js.Object]]
