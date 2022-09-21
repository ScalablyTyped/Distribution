package typings.oauth2Server.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2-server", "OAuthError")
@js.native
open class OAuthError protected ()
  extends StObject
     with Error {
  def this(messageOrError: String) = this()
  def this(messageOrError: js.Error) = this()
  def this(messageOrError: String, properties: js.Object) = this()
  def this(messageOrError: js.Error, properties: js.Object) = this()
  
  /**
    * The HTTP error code.
    */
  var code: Double = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
