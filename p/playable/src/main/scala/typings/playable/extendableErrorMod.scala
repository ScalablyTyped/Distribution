package typings.playable

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/core/dependency-container/errors/ExtendableError", JSImport.Namespace)
@js.native
object extendableErrorMod extends js.Object {
  
  @js.native
  class default protected () extends Error {
    def this(message: String) = this()
  }
  
  type ExtendableError = Error
}
