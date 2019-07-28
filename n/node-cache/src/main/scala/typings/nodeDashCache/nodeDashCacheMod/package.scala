package typings.nodeDashCache

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashCacheMod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* data */ js.UndefOr[T], Unit]
  type Data = StringDictionary[WrappedValue[js.Any]]
  /**
    * Since 4.1.0: Key-validation: The keys can be given as either string or number,
    * but are casted to a string internally anyway.
    */
  type Key = String | Double
}
