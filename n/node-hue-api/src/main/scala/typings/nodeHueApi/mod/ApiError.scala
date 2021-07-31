package typings.nodeHueApi.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-hue-api", "ApiError")
@js.native
class ApiError protected ()
  extends StObject
     with Error {
  def this(error: js.Object) = this()
  
  var address: String = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  var `type`: js.Any = js.native
}
