package typings.minappEnv.global

import typings.minappEnv.ObjectConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Object")
@js.native
class Object ()
  extends StObject
     with typings.minappEnv.Object {
  def this(value: js.Any) = this()
}
object Object {
  
  /**
    * Provides functionality common to all JavaScript objects.
    */
  @scala.inline
  def apply: ObjectConstructor = js.Dynamic.global.selectDynamic("Object").asInstanceOf[ObjectConstructor]
}
