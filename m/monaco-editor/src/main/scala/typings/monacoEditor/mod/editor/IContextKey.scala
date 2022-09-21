package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IContextKey[T /* <: ContextKeyValue */] extends StObject {
  
  def get(): js.UndefOr[T]
  
  def reset(): Unit
  
  def set(value: T): Unit
}
object IContextKey {
  
  inline def apply[T /* <: ContextKeyValue */](get: () => js.UndefOr[T], reset: () => Unit, set: T => Unit): IContextKey[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IContextKey[T]]
  }
  
  extension [Self <: IContextKey[?], T /* <: ContextKeyValue */](x: Self & IContextKey[T]) {
    
    inline def setGet(value: () => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
