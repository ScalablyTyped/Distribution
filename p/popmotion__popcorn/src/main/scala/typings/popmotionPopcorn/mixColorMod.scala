package typings.popmotionPopcorn

import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixColorMod {
  
  @JSImport("@popmotion/popcorn/lib/utils/mix-color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(from: String, to: String): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def default(from: String, to: HSLA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def default(from: String, to: RGBA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def default(from: HSLA, to: String): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def default(from: HSLA, to: HSLA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def default(from: HSLA, to: RGBA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def default(from: RGBA, to: String): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def default(from: RGBA, to: HSLA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  @scala.inline
  def default(from: RGBA, to: RGBA): js.Function1[/* v */ Double, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Double, js.Any]]
  
  @scala.inline
  def mixLinearColor(from: Double, to: Double, v: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mixLinearColor")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Double]
}
