package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoSystemError")
@js.native
open class MongoSystemError protected () extends MongoError {
  def this(message: String, reason: TopologyDescription) = this()
  
  @JSName("name")
  def name_MMongoSystemError: String = js.native
  
  /** An optional reason context, such as an error saved during flow of monitoring and selecting servers */
  var reason: js.UndefOr[TopologyDescription] = js.native
}
