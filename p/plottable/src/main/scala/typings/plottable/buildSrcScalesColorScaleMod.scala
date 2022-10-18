package typings.plottable

import typings.plottable.buildSrcScalesScaleMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcScalesColorScaleMod {
  
  @JSImport("plottable/build/src/scales/colorScale", "Color")
  @js.native
  /**
    * A Color Scale maps string values to color hex values expressed as a string.
    *
    * @constructor
    * @param {string} [scaleType] One of "Category10"/"Category20"/"Category20b"/"Category20c".
    *   (see https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors)
    *   If not supplied, reads the colors defined using CSS -- see plottable.css.
    */
  open class Color () extends Scale[String, String] {
    def this(scaleType: String) = this()
    
    /* private */ var _d3Scale: Any = js.native
    
    /* private */ var _rangeLength: Any = js.native
    
    /* private */ var _tracker: Any = js.native
  }
  /* static members */
  object Color {
    
    @JSImport("plottable/build/src/scales/colorScale", "Color")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/scales/colorScale", "Color._LOOP_LIGHTEN_FACTOR")
    @js.native
    def _LOOP_LIGHTEN_FACTOR: Any = js.native
    inline def _LOOP_LIGHTEN_FACTOR_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LOOP_LIGHTEN_FACTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales/colorScale", "Color._MAXIMUM_COLORS_FROM_CSS")
    @js.native
    def _MAXIMUM_COLORS_FROM_CSS: Any = js.native
    inline def _MAXIMUM_COLORS_FROM_CSS_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MAXIMUM_COLORS_FROM_CSS")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales/colorScale", "Color._getPlottableColors")
    @js.native
    def _getPlottableColors: Any = js.native
    inline def _getPlottableColors_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getPlottableColors")(x.asInstanceOf[js.Any])
    
    @JSImport("plottable/build/src/scales/colorScale", "Color._plottableColorCache")
    @js.native
    def _plottableColorCache: Any = js.native
    inline def _plottableColorCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_plottableColorCache")(x.asInstanceOf[js.Any])
    
    inline def invalidateColorCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("invalidateColorCache")().asInstanceOf[Unit]
  }
}
