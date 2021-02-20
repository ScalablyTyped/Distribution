package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactiveVarMod {
  
  @js.native
  trait ReactiveVar[T] extends StObject {
    
    def get(): T = js.native
    
    def set(newValue: T): Unit = js.native
  }
  object ReactiveVar {
    
    @JSImport("meteor/reactive-var", "ReactiveVar")
    @js.native
    val ^ : typings.meteor.reactiveVarMod.ReactiveVarStatic = js.native
    
    @scala.inline
    implicit class ReactiveVarMutableBuilder[Self <: typings.meteor.reactiveVarMod.ReactiveVar[_], T] (val x: Self with typings.meteor.reactiveVarMod.ReactiveVar[T]) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/reactive-var", "ReactiveVar")
  @js.native
  class ReactiveVarCls[T] protected ()
    extends typings.meteor.reactiveVarMod.ReactiveVar[T] {
    def this(initialValue: T) = this()
    def this(initialValue: T, equalsFunc: js.Function2[/* oldValue */ T, /* newValue */ T, Boolean]) = this()
  }
  
  @js.native
  trait ReactiveVarStatic
    extends Instantiable1[/* initialValue */ js.Object, typings.meteor.reactiveVarMod.ReactiveVar[js.Object]]
       with Instantiable2[
          /* initialValue */ js.Object, 
          /* equalsFunc */ js.Function2[/* oldValue */ js.Object, /* newValue */ js.Object, Boolean], 
          typings.meteor.reactiveVarMod.ReactiveVar[js.Object]
        ]
}
