package typings
package podcastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItunesSubCategory extends js.Object {
  var name: java.lang.String
  var subcat: js.Array[java.lang.String]
}

object IItunesSubCategory {
  @scala.inline
  def apply(name: java.lang.String, subcat: js.Array[java.lang.String]): IItunesSubCategory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("subcat")(subcat)
    __obj.asInstanceOf[IItunesSubCategory]
  }
}

