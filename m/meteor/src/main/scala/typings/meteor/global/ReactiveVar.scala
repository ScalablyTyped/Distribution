package typings.meteor.global

import typings.meteor.ReactiveVarStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ReactiveVar")
@js.native
open class ReactiveVar[T] protected ()
  extends StObject
     with typings.meteor.ReactiveVar[T] {
  /**
    * Constructor for a ReactiveVar, which represents a single reactive variable.
    * @param initialValue The initial value to set. `equalsFunc` is ignored when setting the initial value.
    * @param equalsFunc A function of two arguments, called on the old value and the new value whenever the ReactiveVar is set. If it returns true, no set is performed. If omitted, the default
    * `equalsFunc` returns true if its arguments are `===` and are of type number, boolean, string, undefined, or null.
    */
  def this(initialValue: T) = this()
  def this(initialValue: T, equalsFunc: js.Function2[/* oldValue */ T, /* newValue */ T, Boolean]) = this()
  
  /**
    * Returns the current value of the ReactiveVar, establishing a reactive dependency.
    */
  /* CompleteClass */
  override def get(): T = js.native
  
  /**
    * Sets the current value of the ReactiveVar, invalidating the Computations that called `get` if `newValue` is different from the old value.
    */
  /* CompleteClass */
  override def set(newValue: T): Unit = js.native
}
object ReactiveVar {
  
  inline def apply: ReactiveVarStatic = js.Dynamic.global.selectDynamic("ReactiveVar").asInstanceOf[ReactiveVarStatic]
}
