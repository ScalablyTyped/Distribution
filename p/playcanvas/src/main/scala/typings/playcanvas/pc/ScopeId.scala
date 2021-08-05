package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The scope for a variable.
  * @property name - The variable name.
  * @param name - The variable name.
  */
trait ScopeId extends StObject {
  
  /**
    * Get variable value.
    * @returns The value.
    */
  def getValue(): js.Any
  
  /**
    * The variable name.
    */
  var name: String
  
  /**
    * Set variable value.
    * @param value - The value.
    */
  def setValue(value: js.Any): Unit
}
object ScopeId {
  
  inline def apply(getValue: () => js.Any, name: String, setValue: js.Any => Unit): ScopeId = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), name = name.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ScopeId]
  }
  
  extension [Self <: ScopeId](x: Self) {
    
    inline def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSetValue(value: js.Any => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
