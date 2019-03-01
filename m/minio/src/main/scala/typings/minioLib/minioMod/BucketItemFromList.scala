package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketItemFromList extends js.Object {
  var creationDate: stdLib.Date
  var name: java.lang.String
}

object BucketItemFromList {
  @scala.inline
  def apply(creationDate: stdLib.Date, name: java.lang.String): BucketItemFromList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("creationDate")(creationDate)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BucketItemFromList]
  }
}

