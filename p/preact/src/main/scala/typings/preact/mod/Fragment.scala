package typings.preact.mod

import typings.preact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("preact", "Fragment")
@js.native
class Fragment protected ()
  extends Component[js.Object, js.Object] {
  def this(props: js.Object) = this()
  def this(props: js.Object, context: js.Any) = this()
}
object Fragment {
  
  //
  // Preact Built-in Components
  // -----------------------------------
  // TODO: Revisit what the public type of this is...
  inline def apply: ComponentClass[js.Object, js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[ComponentClass[js.Object, js.Object]]
}
