package typings.mongodb.anon

import typings.mongodb.mongodbStrings.date
import typings.mongodb.mongodbStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  @JSName("$type")
  var $type: date | timestamp = js.native
}

object Type {
  @scala.inline
  def apply($type: date | timestamp): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$type(value: date | timestamp): Self = this.set("$type", value.asInstanceOf[js.Any])
  }
  
}

