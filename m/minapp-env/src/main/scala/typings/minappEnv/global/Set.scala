package typings.minappEnv.global

import typings.minappEnv.Iterable
import typings.minappEnv.SetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Set")
@js.native
class Set[T] ()
  extends StObject
     with typings.minappEnv.Set[T] {
  def this(iterable: Iterable[T]) = this()
  def this(values: typings.minappEnv.Array[T]) = this()
}
object Set {
  
  @scala.inline
  def apply: SetConstructor = js.Dynamic.global.selectDynamic("Set").asInstanceOf[SetConstructor]
}
