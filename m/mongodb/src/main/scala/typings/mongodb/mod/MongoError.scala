package typings.mongodb.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "MongoError")
@js.native
open class MongoError protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: js.Error) = this()
  
  def addErrorLabel(label: String): Unit = js.native
  
  @JSName("cause")
  var cause_MongoError: js.UndefOr[js.Error] = js.native
  
  /* Excluded from this release type: [kErrorLabels] */
  /**
    * This is a number in MongoServerError and a string in MongoDriverError
    * @privateRemarks
    * Define the type override on the subclasses when we can use the override keyword
    */
  var code: js.UndefOr[scala.Double | String] = js.native
  
  var connectionGeneration: js.UndefOr[scala.Double] = js.native
  
  /** Legacy name for server error responses */
  def errmsg: String = js.native
  
  def errorLabels: js.Array[String] = js.native
  
  /**
    * Checks the error to see if it has an error label
    *
    * @param label - The error label to check for
    * @returns returns true if the error has the provided error label
    */
  def hasErrorLabel(label: String): Boolean = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  @JSName("name")
  def name_MMongoError: String = js.native
  
  var topologyVersion: js.UndefOr[TopologyVersion] = js.native
}
