package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "CommandStartedEvent")
@js.native
open class CommandStartedEvent () extends StObject {
  
  var address: String = js.native
  
  var command: Document = js.native
  
  var commandName: String = js.native
  
  var commandObj: js.UndefOr[Document] = js.native
  
  var connectionId: js.UndefOr[String | scala.Double] = js.native
  
  var databaseName: String = js.native
  
  /* Excluded from this release type: __constructor */
  def hasServiceId: Boolean = js.native
  
  var requestId: scala.Double = js.native
  
  var serviceId: js.UndefOr[typings.bson.mod.ObjectId] = js.native
}
