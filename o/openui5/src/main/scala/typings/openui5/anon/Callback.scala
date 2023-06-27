package typings.openui5.anon

import typings.openui5.sapUiCoreElementMod.default
import typings.openui5.sapUiCoreThemingParametersMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  /**
    * If given, the callback is only executed in case there are still parameters pending and one or more of
    * the requested parameters is missing.
    */
  var callback: js.UndefOr[js.Function1[/* p1 */ Value, Unit]] = js.undefined
  
  /**
    * the (array with) CSS parameter name(s)
    */
  var name: String | js.Array[String]
  
  /**
    * Element / control instance to take into account when looking for a parameter value. This can make a difference
    * when a parameter value is overridden in a theme scope set via a CSS class.
    */
  var scopeElement: js.UndefOr[default] = js.undefined
}
object Callback {
  
  inline def apply(name: String | js.Array[String]): Callback = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* p1 */ Value => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setScopeElement(value: default): Self = StObject.set(x, "scopeElement", value.asInstanceOf[js.Any])
    
    inline def setScopeElementUndefined: Self = StObject.set(x, "scopeElement", js.undefined)
  }
}
