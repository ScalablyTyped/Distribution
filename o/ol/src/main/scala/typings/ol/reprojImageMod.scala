package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojImageMod {
  
  /**
    * @typedef {function(import("../extent.js").Extent, number, number) : import("../ImageBase.js").default} FunctionType
    */
  /**
    * @classdesc
    * Class encapsulating single reprojected image.
    * See {@link module:ol/source/Image~ImageSource}.
    */
  @JSImport("ol/reproj/Image", JSImport.Default)
  @js.native
  open class default protected () extends ReprojImage {
    /**
      * @param {import("../proj/Projection.js").default} sourceProj Source projection (of the data).
      * @param {import("../proj/Projection.js").default} targetProj Target projection.
      * @param {import("../extent.js").Extent} targetExtent Target extent.
      * @param {number} targetResolution Target resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {FunctionType} getImageFunction
      *     Function returning source images (extent, resolution, pixelRatio).
      * @param {boolean} interpolate Use linear interpolation when resampling.
      */
    def this(
      sourceProj: typings.ol.projProjectionMod.default,
      targetProj: typings.ol.projProjectionMod.default,
      targetExtent: Extent,
      targetResolution: Double,
      pixelRatio: Double,
      getImageFunction: FunctionType,
      interpolate: Boolean
    ) = this()
  }
  
  type FunctionType = js.Function3[
    /* arg0 */ Extent, 
    /* arg1 */ Double, 
    /* arg2 */ Double, 
    typings.ol.imageBaseMod.default
  ]
  
  /**
    * @typedef {function(import("../extent.js").Extent, number, number) : import("../ImageBase.js").default} FunctionType
    */
  /**
    * @classdesc
    * Class encapsulating single reprojected image.
    * See {@link module:ol/source/Image~ImageSource}.
    */
  @js.native
  trait ReprojImage
    extends typings.ol.imageBaseMod.default {
    
    /**
      * @private
      * @type {HTMLCanvasElement}
      */
    /* private */ var canvas_ : Any = js.native
    
    /**
      * @return {import("../proj/Projection.js").default} Projection.
      */
    def getProjection(): typings.ol.projProjectionMod.default = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var interpolate_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var maxSourceExtent_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var reproject_ : Any = js.native
    
    /**
      * @private
      * @type {import("../ImageBase.js").default}
      */
    /* private */ var sourceImage_ : Any = js.native
    
    /**
      * @private
      * @type {?import("../events.js").EventsKey}
      */
    /* private */ var sourceListenerKey_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var sourcePixelRatio_ : Any = js.native
    
    /**
      * @private
      * @type {import("../extent.js").Extent}
      */
    /* private */ var targetExtent_ : Any = js.native
    
    /**
      * @private
      * @type {import("../proj/Projection.js").default}
      */
    /* private */ var targetProj_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var targetResolution_ : Any = js.native
    
    /**
      * @private
      * @type {!import("./Triangulation.js").default}
      */
    /* private */ var triangulation_ : Any = js.native
    
    /**
      * @private
      */
    /* private */ var unlistenSource_ : Any = js.native
  }
}
