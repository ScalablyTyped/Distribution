package typings
package nodeDashCacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashCacheMod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* data */ js.UndefOr[T], scala.Unit]
  type Data = org.scalablytyped.runtime.StringDictionary[WrappedValue[js.Any]]
  /**
    * Since 4.1.0: Key-validation: The keys can be given as either string or number,
    * but are casted to a string internally anyway.
    */
  type Key = java.lang.String | scala.Double
}
