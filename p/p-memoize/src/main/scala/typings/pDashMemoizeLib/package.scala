package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashMemoizeLib {
  type PMemoize = js.Function2[
    /* f */ js.Function1[/* repeated */ js.Any, js.Any], 
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify MemOptions */ /* memoizeOptions */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify MemOptions */ js.Any
    ], 
    js.Function1[/* repeated */ js.Any, js.Any]
  ]
}
