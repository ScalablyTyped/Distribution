package typings.msRestAzure.mod

import typings.msRest.mod.ApiKeyCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

