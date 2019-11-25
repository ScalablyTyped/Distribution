package typings.minio.minioMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketItemFromList extends js.Object {
  var creationDate: Date
  var name: String
}

object BucketItemFromList {
  @scala.inline
  def apply(creationDate: Date, name: String): BucketItemFromList = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketItemFromList]
  }
}

