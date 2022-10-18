package typings.mongodb.mod

import typings.bson.mod.ObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "CommandFailedEvent")
@js.native
open class CommandFailedEvent () extends StObject {
  
  var address: String = js.native
  
  var commandName: String = js.native
  
  var connectionId: js.UndefOr[String | scala.Double] = js.native
  
  var duration: scala.Double = js.native
  
  var failure: js.Error = js.native
  
  /* Excluded from this release type: __constructor */
  def hasServiceId: Boolean = js.native
  
  var requestId: scala.Double = js.native
  
  var serviceId: js.UndefOr[ObjectId] = js.native
}
