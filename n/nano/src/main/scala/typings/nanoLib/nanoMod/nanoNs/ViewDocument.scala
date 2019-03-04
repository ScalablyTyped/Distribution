package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDocument[D] extends IdentifiedDocument {
  var views: org.scalablytyped.runtime.StringDictionary[View[D]]
}

object ViewDocument {
  @scala.inline
  def apply[D](_id: java.lang.String, views: org.scalablytyped.runtime.StringDictionary[View[D]]): ViewDocument[D] = {
    val __obj = js.Dynamic.literal(_id = _id, views = views)
  
    __obj.asInstanceOf[ViewDocument[D]]
  }
}

