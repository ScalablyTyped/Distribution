package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: js.UndefOr[js.Any] = js.undefined
  
  var load: js.UndefOr[js.Any] = js.undefined
  
  var remove: js.UndefOr[js.Any] = js.undefined
}
object Add {
  
  @scala.inline
  def apply(): Add = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Add]
  }
  
  @scala.inline
  implicit class AddMutableBuilder[Self <: Add] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Any): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setLoad(value: js.Any): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    @scala.inline
    def setRemove(value: js.Any): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
