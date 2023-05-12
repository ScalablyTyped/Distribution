package typings.pkijs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "ChainValidationError")
@js.native
open class ChainValidationError protected ()
  extends StObject
     with Error {
  def this(code: ChainValidationCode, message: String) = this()
  
  var code: ChainValidationCode = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
object ChainValidationError {
  
  /* static member */
  @JSImport("pkijs", "ChainValidationError.NAME")
  @js.native
  val NAME: /* "ChainValidationError" */ String = js.native
}
