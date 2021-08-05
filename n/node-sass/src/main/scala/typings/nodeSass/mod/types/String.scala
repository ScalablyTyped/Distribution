package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String
  extends StObject
     with Value {
  
  def getValue(): java.lang.String
  
  def setValue(s: java.lang.String): Unit
}
object String {
  
  @JSImport("node-sass", "types.String")
  @js.native
  val ^ : StringConstructor = js.native
  
  extension [Self <: String](x: Self) {
    
    inline def setGetValue(value: () => java.lang.String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    inline def setSetValue(value: java.lang.String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
