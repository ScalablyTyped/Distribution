package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curryRangeMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/curry-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(func: RangeFunction): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any]]
  
  type RangeFunction = js.Function3[/* min */ Double, /* max */ Double, /* v */ Double, js.Any]
}
