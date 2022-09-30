package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait List
  extends StObject
     with Enumerable
     with Value {
  
  def getSeparator(): scala.Boolean
  
  def setSeparator(isComma: scala.Boolean): Unit
}
object List {
  
  @JSImport("node-sass", "types.List")
  @js.native
  val ^ : ListConstructor = js.native
  
  extension [Self <: typings.nodeSass.mod.types.List](x: Self) {
    
    inline def setGetSeparator(value: () => scala.Boolean): Self = StObject.set(x, "getSeparator", js.Any.fromFunction0(value))
    
    inline def setSetSeparator(value: scala.Boolean => Unit): Self = StObject.set(x, "setSeparator", js.Any.fromFunction1(value))
  }
}
