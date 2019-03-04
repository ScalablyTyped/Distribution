package typings
package podcastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItunesCategory extends js.Object {
  var name: java.lang.String
  var subcats: js.Array[IItunesSubCategory]
}

object IItunesCategory {
  @scala.inline
  def apply(name: java.lang.String, subcats: js.Array[IItunesSubCategory]): IItunesCategory = {
    val __obj = js.Dynamic.literal(name = name, subcats = subcats)
  
    __obj.asInstanceOf[IItunesCategory]
  }
}

