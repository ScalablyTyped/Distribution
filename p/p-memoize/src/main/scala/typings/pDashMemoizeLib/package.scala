package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashMemoizeLib {
  type PMemoize = js.Function2[
    /* f */ js.Function1[/* repeated */js.Any, js.Any], 
    /* memoizeOptions */ js.UndefOr[js.Any], 
    js.Function1[/* repeated */js.Any, js.Any]
  ]
}
