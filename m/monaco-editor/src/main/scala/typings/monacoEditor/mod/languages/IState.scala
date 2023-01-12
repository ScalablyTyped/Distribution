package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IState extends StObject {
  
  def equals(other: IState): Boolean
}
object IState {
  
  inline def apply(equals_ : IState => Boolean): IState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IState] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: IState => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
  }
}
