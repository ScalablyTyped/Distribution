package typings.nodeDashSass.nodeDashSassMod.types

import org.scalablytyped.runtime.TopLevel
import typings.nodeDashSass.nodeDashSassMod._ImporterReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error
  extends ReturnValue
     with _ImporterReturnType {
  /**
  		 * This property doesn't exist, but its presence forces the typescript
  		 * compiler to properly type check this type. Without it, it seems to
  		 * allow things that aren't types.Error to match it in case statements and
  		 * assignments.
  		 */
  val ___SASS_ERROR___ : js.Symbol
}

@JSImport("node-sass", "types.Error")
@js.native
object Error extends TopLevel[ErrorConstructor]

