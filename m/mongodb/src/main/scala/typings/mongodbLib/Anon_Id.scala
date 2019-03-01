package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id
  extends /* index */ org.scalablytyped.runtime.StringDictionary[scala.Double] {
  var `_id_`: scala.Double
}

object Anon_Id {
  @scala.inline
  def apply(
    `_id_`: scala.Double,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(`_id_` = `_id_`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Id]
  }
}

