package typings.parse.mod

import org.scalablytyped.runtime.Shortcut
import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.ObjectConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Object extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("parse", "Object")
  @js.native
  class ^[T /* <: Attributes */] protected ()
    extends StObject
       with typings.parse.mod.global.Parse.Object[T] {
    def this(className: String, attributes: T) = this()
    def this(className: String, attributes: T, options: js.Any) = this()
  }
  
  @JSImport("parse", "Object")
  @js.native
  val ^ : js.Object & ObjectConstructor = js.native
  
  type _To = js.Object & ObjectConstructor
  
  /* This means you don't have to write `^`, but can instead just say `Object.foo` */
  override def _to: js.Object & ObjectConstructor = ^
}
