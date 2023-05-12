package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "CommandSucceededEvent")
@js.native
open class CommandSucceededEvent () extends StObject {
  
  var address: String = js.native
  
  var commandName: String = js.native
  
  var connectionId: js.UndefOr[String | scala.Double] = js.native
  
  var duration: scala.Double = js.native
  
  /* Excluded from this release type: name */
  /* Excluded from this release type: __constructor */
  def hasServiceId: Boolean = js.native
  
  var reply: Any = js.native
  
  var requestId: scala.Double = js.native
  
  var serviceId: js.UndefOr[typings.bson.mod.ObjectId] = js.native
}
