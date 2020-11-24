package typings.popmotionPopcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@popmotion/popcorn/lib/utils/curry-range", JSImport.Namespace)
@js.native
object curryRangeMod extends js.Object {
  
  def default(func: RangeFunction): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], _] = js.native
  
  type RangeFunction = js.Function3[/* min */ Double, /* max */ Double, /* v */ Double, js.Any]
}
