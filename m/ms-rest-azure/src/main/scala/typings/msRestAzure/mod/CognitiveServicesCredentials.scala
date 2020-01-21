package typings.msRestAzure.mod

import typings.msRest.mod.ApiKeyCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ms-rest-azure", "CognitiveServicesCredentials")
@js.native
class CognitiveServicesCredentials protected () extends ApiKeyCredentials {
  /**
    * Creates a new CognitiveServicesCredentials object.
    *
    * @constructor
    * @param {string} subscriptionKey   The CognitiveServices subscription key
    */
  def this(subscriptionKey: String) = this()
}

