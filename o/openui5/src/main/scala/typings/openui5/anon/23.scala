package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  /**
    * The toolbar item that was pressed
    */
  var srcControl: js.UndefOr[default] = js.undefined
}
object `23` {
  
  inline def apply(): `23` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `23`] (val x: Self) extends AnyVal {
    
    inline def setSrcControl(value: default): Self = StObject.set(x, "srcControl", value.asInstanceOf[js.Any])
    
    inline def setSrcControlUndefined: Self = StObject.set(x, "srcControl", js.undefined)
  }
}
