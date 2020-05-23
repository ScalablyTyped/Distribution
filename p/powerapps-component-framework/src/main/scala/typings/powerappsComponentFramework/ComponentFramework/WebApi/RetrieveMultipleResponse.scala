package typings.powerappsComponentFramework.ComponentFramework.WebApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveMultipleResponse extends js.Object {
  /**
    * An array of JSON objects, where each object represents the retrieved entity record containing attributes and their values
    */
  var entities: js.Array[Entity]
  /**
    * If the number of records being retrieved is more than the value specified in the 'maxPageSize' parameter in the request, this attribute returns the URL to return next set of records.
    */
  var nextLink: String
}

object RetrieveMultipleResponse {
  @scala.inline
  def apply(entities: js.Array[Entity], nextLink: String): RetrieveMultipleResponse = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], nextLink = nextLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMultipleResponse]
  }
}

