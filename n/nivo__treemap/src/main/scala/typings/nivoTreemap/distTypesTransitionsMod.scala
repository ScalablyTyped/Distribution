package typings.nivoTreemap

import typings.reactSpringCore.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionsMod {
  
  @JSImport("@nivo/treemap/dist/types/transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def htmlLabelTransform(x: SpringValue[Double], y: SpringValue[Double], rotation: SpringValue[Double]): Interpolation[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlLabelTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Interpolation[String, Any]]
  
  inline def htmlNodeTransform(x: SpringValue[Double], y: SpringValue[Double]): Interpolation[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlNodeTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Interpolation[String, Any]]
  
  inline def htmlParentLabelTransform(x: SpringValue[Double], y: SpringValue[Double], rotation: SpringValue[Double]): Interpolation[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlParentLabelTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Interpolation[String, Any]]
  
  inline def svgLabelTransform(x: SpringValue[Double], y: SpringValue[Double], rotation: SpringValue[Double]): Interpolation[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("svgLabelTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Interpolation[String, Any]]
  
  inline def svgNodeTransform(x: SpringValue[Double], y: SpringValue[Double]): Interpolation[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("svgNodeTransform")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Interpolation[String, Any]]
}
