package typings.msRestAzure.mod

import typings.msRest.mod.ApiKeyCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ms-rest-azure", "TopicCredentials")
@js.native
class TopicCredentials protected () extends ApiKeyCredentials {
  /**
    * Creates a new EventGrid TopicCredentials object.
    *
    * @constructor
    * @param {string} topicKey   The EventGrid topic key
    */
  def this(topicKey: String) = this()
}
