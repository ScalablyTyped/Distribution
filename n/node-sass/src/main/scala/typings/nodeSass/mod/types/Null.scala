package typings.nodeSass.mod.types

import typings.nodeSass.mod._ImporterReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Null
  extends Value
     with _ImporterReturnType {
  
  /**
    * This property doesn't exist, but its presence forces the typescript
    * compiler to properly type check this type. Without it, it seems to
    * allow things that aren't types.Null to match it in case statements and
    * assignments.
    */
  val ___NULL___ : js.Symbol = js.native
}
object Null {
  
  @JSImport("node-sass", "types.Null")
  @js.native
  val ^ : NullConstructor = js.native
  
  @scala.inline
  implicit class NullMutableBuilder[Self <: Null] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set___NULL___(value: js.Symbol): Self = StObject.set(x, "___NULL___", value.asInstanceOf[js.Any])
  }
}
