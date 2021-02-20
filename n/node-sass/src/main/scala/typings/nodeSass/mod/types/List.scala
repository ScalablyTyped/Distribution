package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List
  extends Value
     with Enumerable {
  
  def getSeparator(): scala.Boolean = js.native
  
  def setSeparator(isComma: scala.Boolean): Unit = js.native
}
object List {
  
  @JSImport("node-sass", "types.List")
  @js.native
  val ^ : ListConstructor = js.native
  
  @scala.inline
  implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSeparator(value: () => scala.Boolean): Self = StObject.set(x, "getSeparator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSeparator(value: scala.Boolean => Unit): Self = StObject.set(x, "setSeparator", js.Any.fromFunction1(value))
  }
}
