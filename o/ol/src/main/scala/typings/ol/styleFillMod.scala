package typings.ol

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleFillMod {
  
  /**
    * @module ol/style/Fill
    */
  /**
    * @typedef {Object} Options
    * @property {import("../color.js").Color|import("../colorlike.js").ColorLike|null} [color=null] A color, gradient or pattern.
    * See {@link module:ol/color~Color} and {@link module:ol/colorlike~ColorLike} for possible formats.
    * Default null; if null, the Canvas/renderer default black will be used.
    */
  /**
    * @classdesc
    * Set fill style for vector features.
    * @api
    */
  @JSImport("ol/style/Fill", JSImport.Default)
  @js.native
  /**
    * @param {Options} [options] Options.
    */
  open class default ()
    extends StObject
       with Fill {
    def this(options: Options) = this()
  }
  
  /**
    * @module ol/style/Fill
    */
  /**
    * @typedef {Object} Options
    * @property {import("../color.js").Color|import("../colorlike.js").ColorLike|null} [color=null] A color, gradient or pattern.
    * See {@link module:ol/color~Color} and {@link module:ol/colorlike~ColorLike} for possible formats.
    * Default null; if null, the Canvas/renderer default black will be used.
    */
  /**
    * @classdesc
    * Set fill style for vector features.
    * @api
    */
  @js.native
  trait Fill extends StObject {
    
    /**
      * @private
      * @type {import("../color.js").Color|import("../colorlike.js").ColorLike|null}
      */
    /* private */ var color_ : Any = js.native
    
    /**
      * Get the fill color.
      * @return {import("../color.js").Color|import("../colorlike.js").ColorLike|null} Color.
      * @api
      */
    def getColor(): Color | ColorLike | Null = js.native
    
    /**
      * Set the color.
      *
      * @param {import("../color.js").Color|import("../colorlike.js").ColorLike|null} color Color.
      * @api
      */
    def setColor(): Unit = js.native
    def setColor(color: Color): Unit = js.native
    def setColor(color: ColorLike): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * A color, gradient or pattern.
      * See {@link module :ol/color~Color} and {@link module :ol/colorlike~ColorLike} for possible formats.
      * Default null; if null, the Canvas/renderer default black will be used.
      */
    var color: js.UndefOr[Color | ColorLike | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color | ColorLike): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorNull: Self = StObject.set(x, "color", null)
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    }
  }
}
