package typings.popmotionPopcorn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object springForceMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/spring-force", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def springForce(): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("springForce")().asInstanceOf[js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any]]
  inline def springForce(alterDisplacement: js.Function): js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("springForce")(alterDisplacement.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* min */ Double, /* max */ Double, /* v */ js.UndefOr[Double], js.Any]]
  
  inline def springForceExpo(min: Double, max: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("springForceExpo")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def springForceExpo(min: Double, max: Double, v: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("springForceExpo")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def springForceLinear(min: Double, max: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("springForceLinear")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def springForceLinear(min: Double, max: Double, v: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("springForceLinear")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
