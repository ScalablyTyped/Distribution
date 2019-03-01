package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters[QM /* <: Model */]
  extends /* filterName */ org.scalablytyped.runtime.StringDictionary[
      js.Function1[/* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], scala.Unit]
    ]

object Filters {
  @scala.inline
  def apply[QM /* <: Model */](
    StringDictionary: /* filterName */ org.scalablytyped.runtime.StringDictionary[
      js.Function1[/* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], scala.Unit]
    ] = null
  ): Filters[QM] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Filters[QM]]
  }
}

