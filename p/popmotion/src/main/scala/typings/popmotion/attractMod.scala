package typings.popmotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attractMod {
  
  @JSImport("popmotion/lib/utils/attract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attract(constant: Double, origin: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("attract")(constant.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def attractExpo(constant: Double, origin: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("attractExpo")(constant.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def createAttractor(): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttractor")().asInstanceOf[js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double]]
  inline def createAttractor(alterDisplacement: js.Function): js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttractor")(alterDisplacement.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* constant */ Double, /* origin */ Double, /* v */ Double, Double]]
}
