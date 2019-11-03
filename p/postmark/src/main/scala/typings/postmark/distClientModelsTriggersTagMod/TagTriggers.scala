package typings.postmark.distClientModelsTriggersTagMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagTriggers extends js.Object {
  var Tags: js.Array[TagTrigger]
  var TotalCount: Double
}

object TagTriggers {
  @scala.inline
  def apply(Tags: js.Array[TagTrigger], TotalCount: Double): TagTriggers = {
    val __obj = js.Dynamic.literal(Tags = Tags, TotalCount = TotalCount)
  
    __obj.asInstanceOf[TagTriggers]
  }
}

