package typings.meteorTypings

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorReactiveVarMod {
  
  trait ReactiveVar[T] extends StObject {
    
    def get(): T
    
    def set(newValue: T): Unit
  }
  object ReactiveVar {
    
    @JSImport("meteor/reactive-var", "ReactiveVar")
    @js.native
    val ^ : typings.meteorTypings.meteorReactiveVarMod.ReactiveVarStatic = js.native
    
    extension [Self <: typings.meteorTypings.meteorReactiveVarMod.ReactiveVar[?], T](x: Self & typings.meteorTypings.meteorReactiveVarMod.ReactiveVar[T]) {
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/reactive-var", "ReactiveVar")
  @js.native
  open class ReactiveVarCls[T] protected ()
    extends StObject
       with typings.meteorTypings.meteorReactiveVarMod.ReactiveVar[T] {
    def this(initialValue: T) = this()
    def this(initialValue: T, equalsFunc: js.Function) = this()
    
    /* CompleteClass */
    override def get(): T = js.native
    
    /* CompleteClass */
    override def set(newValue: T): Unit = js.native
  }
  
  @js.native
  trait ReactiveVarStatic
    extends StObject
       with Instantiable1[
          /* initialValue */ js.Object, 
          typings.meteorTypings.meteorReactiveVarMod.ReactiveVar[js.Object]
        ]
       with Instantiable2[
          /* initialValue */ js.Object, 
          /* equalsFunc */ js.Function, 
          typings.meteorTypings.meteorReactiveVarMod.ReactiveVar[js.Object]
        ]
}
