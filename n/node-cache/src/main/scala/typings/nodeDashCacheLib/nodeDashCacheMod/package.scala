package typings
package nodeDashCacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashCacheMod {
  type Callback[T] = js.Function2[/* err */ js.Any, /* data */ js.UndefOr[T], scala.Unit]
  type Data = org.scalablytyped.runtime.StringDictionary[WrappedValue[js.Any]]
}
