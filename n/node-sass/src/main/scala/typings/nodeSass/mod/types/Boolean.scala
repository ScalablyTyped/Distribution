package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Boolean extends Value {
  
  def getValue(): scala.Boolean = js.native
}
object Boolean {
  
  @JSImport("node-sass", "types.Boolean")
  @js.native
  val ^ : BooleanConstructor = js.native
  
  @scala.inline
  implicit class BooleanMutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetValue(value: () => scala.Boolean): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
  }
}
