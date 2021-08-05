package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotationconstraintMod {
  
  @JSImport("ol/rotationconstraint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSnapToN(n: Double): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("createSnapToN")(n.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def createSnapToZero(): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("createSnapToZero")().asInstanceOf[Type]
  inline def createSnapToZero(opt_tolerance: Double): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("createSnapToZero")(opt_tolerance.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def disable(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[js.UndefOr[Double]]
  inline def disable(rotation: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(rotation.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def none(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")().asInstanceOf[js.UndefOr[Double]]
  inline def none(rotation: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(rotation.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  type Type = js.Function2[/* p0 */ js.UndefOr[Double], /* p1 */ js.UndefOr[Boolean], js.UndefOr[Double]]
}
