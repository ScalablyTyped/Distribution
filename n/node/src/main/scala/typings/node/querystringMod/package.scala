package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object querystringMod {
  import org.scalablytyped.runtime.StringDictionary

  type ParsedUrlQuery = StringDictionary[String | js.Array[String]]
  type ParsedUrlQueryInput = StringDictionary[
    js.UndefOr[String | Double | Boolean | (js.Array[Boolean | Double | String]) | Null]
  ]
}
