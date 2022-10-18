package typings.popmotion

import typings.popmotion.libAnimationsTypesMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `libAnimationsGenerators@TestsUtilsMod` {
  
  @JSImport("popmotion/lib/animations/generators/@/tests/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animateSync(animation: Animation[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("animateSync")(animation.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def animateSync(animation: Animation[Double], timeStep: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("animateSync")(animation.asInstanceOf[js.Any], timeStep.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def animateSync(animation: Animation[Double], timeStep: Double, round: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("animateSync")(animation.asInstanceOf[js.Any], timeStep.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def animateSync(animation: Animation[Double], timeStep: Unit, round: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("animateSync")(animation.asInstanceOf[js.Any], timeStep.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
