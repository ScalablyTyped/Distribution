package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notAFunctionErrorMod {
  
  @JSImport("playable/dist/src/core/dependency-container/errors/NotAFunctionError", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.playable.extendableErrorMod.default {
    def this(functionName: String, expectedType: String, givenType: String) = this()
  }
  
  type NotAFunctionError = typings.playable.extendableErrorMod.default
}
