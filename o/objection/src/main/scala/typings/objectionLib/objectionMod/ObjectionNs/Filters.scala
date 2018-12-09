package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Filters[QM /* <: Model */]
  extends /* filterName */ ScalablyTyped.runtime.StringDictionary[
      js.Function1[/* queryBuilder */ QueryBuilder[QM, js.Array[QM], js.Array[QM]], scala.Unit]
    ]

