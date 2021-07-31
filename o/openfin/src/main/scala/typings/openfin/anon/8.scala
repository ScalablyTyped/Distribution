package typings.openfin.anon

import typings.openfin.windowOptionMod.ContentNavigation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var newVal: js.UndefOr[ContentNavigation] = js.undefined
  
  var oldVal: js.UndefOr[ContentNavigation] = js.undefined
}
object `8` {
  
  @scala.inline
  def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVal(value: ContentNavigation): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    @scala.inline
    def setOldVal(value: ContentNavigation): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
