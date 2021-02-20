package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String extends Value {
  
  def getValue(): java.lang.String = js.native
  
  def setValue(s: java.lang.String): Unit = js.native
}
object String {
  
  @JSImport("node-sass", "types.String")
  @js.native
  val ^ : StringConstructor = js.native
  
  @scala.inline
  implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetValue(value: () => java.lang.String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValue(value: java.lang.String => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
  }
}
