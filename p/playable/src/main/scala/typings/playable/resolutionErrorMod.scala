package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolutionErrorMod {
  
  @JSImport("playable/dist/src/core/dependency-container/errors/ResolutionError", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.playable.extendableErrorMod.default {
    def this(name: String, resolutionStack: js.Array[String]) = this()
    def this(name: String, resolutionStack: js.Array[String], message: String) = this()
  }
  
  type ResolutionError = typings.playable.extendableErrorMod.default
}
