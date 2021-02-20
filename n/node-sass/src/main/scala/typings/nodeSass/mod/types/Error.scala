package typings.nodeSass.mod.types

import typings.nodeSass.mod._ImporterReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error
  extends ReturnValue
     with _ImporterReturnType {
  
  /**
    * This property doesn't exist, but its presence forces the typescript
    * compiler to properly type check this type. Without it, it seems to
    * allow things that aren't types.Error to match it in case statements and
    * assignments.
    */
  val ___SASS_ERROR___ : js.Symbol = js.native
}
object Error {
  
  @JSImport("node-sass", "types.Error")
  @js.native
  val ^ : ErrorConstructor = js.native
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set___SASS_ERROR___(value: js.Symbol): Self = StObject.set(x, "___SASS_ERROR___", value.asInstanceOf[js.Any])
  }
}
