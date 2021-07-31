package typings.popmotion

import typings.styleValueTypes.typesMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixColorMod {
  
  @JSImport("popmotion/lib/utils/mix-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mixColor(from: String, to: String): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: String, to: Color): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: Color, to: String): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def mixColor(from: Color, to: Color): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  
  @scala.inline
  def mixLinearColor(from: Double, to: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mixLinearColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
}
