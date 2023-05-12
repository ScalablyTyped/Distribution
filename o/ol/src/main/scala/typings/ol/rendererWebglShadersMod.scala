package typings.ol

import typings.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererWebglShadersMod {
  
  @JSImport("ol/renderer/webgl/shaders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/renderer/webgl/shaders", "FILL_FRAGMENT_SHADER")
  @js.native
  val FILL_FRAGMENT_SHADER: String = js.native
  
  @JSImport("ol/renderer/webgl/shaders", "FILL_VERTEX_SHADER")
  @js.native
  val FILL_VERTEX_SHADER: String = js.native
  
  @JSImport("ol/renderer/webgl/shaders", "POINT_FRAGMENT_SHADER")
  @js.native
  val POINT_FRAGMENT_SHADER: String = js.native
  
  @JSImport("ol/renderer/webgl/shaders", "POINT_VERTEX_SHADER")
  @js.native
  val POINT_VERTEX_SHADER: String = js.native
  
  @JSImport("ol/renderer/webgl/shaders", "STROKE_FRAGMENT_SHADER")
  @js.native
  val STROKE_FRAGMENT_SHADER: String = js.native
  
  @JSImport("ol/renderer/webgl/shaders", "STROKE_VERTEX_SHADER")
  @js.native
  val STROKE_VERTEX_SHADER: String = js.native
  
  inline def packColor(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("packColor")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def packColor(color: Color): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("packColor")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.color
    - typings.ol.olStrings.opacity
    - typings.ol.olStrings.width
  */
  trait DefaultAttributes extends StObject
  object DefaultAttributes {
    
    inline def color: typings.ol.olStrings.color = "color".asInstanceOf[typings.ol.olStrings.color]
    
    inline def opacity: typings.ol.olStrings.opacity = "opacity".asInstanceOf[typings.ol.olStrings.opacity]
    
    inline def width: typings.ol.olStrings.width = "width".asInstanceOf[typings.ol.olStrings.width]
  }
}
