package typings.nestedErrorStacks

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nested-error-stacks", JSImport.Namespace)
  @js.native
  class ^ () extends Error {
    def this(message: js.Any) = this()
    def this(message: js.UndefOr[scala.Nothing], nested: Error) = this()
    def this(message: js.Any, nested: Error) = this()
  }
  
  type NestedError = Error
}
