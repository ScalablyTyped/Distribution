package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononDialogComponent extends StObject {
  
  def on(event: String, callback: js.Function1[/* value */ js.UndefOr[Any], Unit]): PhononDialogComponent
}
object PhononDialogComponent {
  
  inline def apply(on: (String, js.Function1[/* value */ js.UndefOr[Any], Unit]) => PhononDialogComponent): PhononDialogComponent = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[PhononDialogComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhononDialogComponent] (val x: Self) extends AnyVal {
    
    inline def setOn(value: (String, js.Function1[/* value */ js.UndefOr[Any], Unit]) => PhononDialogComponent): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
