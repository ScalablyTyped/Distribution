package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convenience interface for when you have a bunch of objects of different
  * types in a single collection. You discriminate between them using their
  * 'type' field.
  */
trait IObject extends js.Object {
  /**
    * The object's type.
    */
  var `type`: String
}

object IObject {
  @scala.inline
  def apply(`type`: String): IObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObject]
  }
}

