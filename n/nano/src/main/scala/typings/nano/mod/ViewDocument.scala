package typings.nano.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDocument[D] extends IdentifiedDocument {
  var views: StringDictionary[View[D]]
}

object ViewDocument {
  @scala.inline
  def apply[D](_id: String, views: StringDictionary[View[D]]): ViewDocument[D] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewDocument[D]]
  }
}

