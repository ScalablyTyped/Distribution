package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Onselect extends StObject {
  
  var onselect: js.UndefOr[js.Function0[Unit]] = js.native
}
object Onselect {
  
  @scala.inline
  def apply(): Onselect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onselect]
  }
  
  @scala.inline
  implicit class OnselectMutableBuilder[Self <: Onselect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnselect(value: () => Unit): Self = StObject.set(x, "onselect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
  }
}
