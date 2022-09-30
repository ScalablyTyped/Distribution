package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoServerSelectionError")
@js.native
open class MongoServerSelectionError protected () extends MongoSystemError {
  def this(message: String, reason: TopologyDescription) = this()
  
  @JSName("name")
  def name_MMongoServerSelectionError: String = js.native
}
