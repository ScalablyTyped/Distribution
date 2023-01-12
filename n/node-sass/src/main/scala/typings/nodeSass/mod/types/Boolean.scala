package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boolean
  extends StObject
     with Value {
  
  def getValue(): scala.Boolean
}
object Boolean {
  
  @JSImport("node-sass", "types.Boolean")
  @js.native
  val ^ : BooleanConstructor = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
    
    inline def setGetValue(value: () => scala.Boolean): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
  }
}
