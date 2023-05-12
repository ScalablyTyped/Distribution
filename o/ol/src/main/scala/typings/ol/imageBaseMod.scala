package typings.ol

import typings.ol.extentMod.Extent
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageBaseMod {
  
  /**
    * @abstract
    */
  @JSImport("ol/ImageBase", JSImport.Default)
  @js.native
  open class default protected () extends ImageBase {
    /**
      * @param {import("./extent.js").Extent} extent Extent.
      * @param {number|undefined} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("./ImageState.js").default} state State.
      */
    def this(extent: Extent, resolution: Double, pixelRatio: Double, state: Any) = this()
    def this(extent: Extent, resolution: Unit, pixelRatio: Double, state: Any) = this()
  }
  
  /**
    * @abstract
    */
  @js.native
  trait ImageBase
    extends typings.ol.eventsTargetMod.default {
    
    /**
      * @protected
      */
    /* protected */ def changed(): Unit = js.native
    
    /**
      * @protected
      * @type {import("./extent.js").Extent}
      */
    /* protected */ var extent: Extent = js.native
    
    /**
      * @return {import("./extent.js").Extent} Extent.
      */
    def getExtent(): Extent = js.native
    
    /**
      * @abstract
      * @return {HTMLCanvasElement|HTMLImageElement|HTMLVideoElement} Image.
      */
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    
    /**
      * @return {number} PixelRatio.
      */
    def getPixelRatio(): Double = js.native
    
    /**
      * @return {number} Resolution.
      */
    def getResolution(): Double = js.native
    
    /**
      * @return {import("./ImageState.js").default} State.
      */
    def getState(): Any = js.native
    
    /**
      * Load not yet loaded URI.
      * @abstract
      */
    def load(): Unit = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var pixelRatio_ : Any = js.native
    
    /**
      * @protected
      * @type {number|undefined}
      */
    /* protected */ var resolution: js.UndefOr[Double] = js.native
    
    /**
      * @protected
      * @type {import("./ImageState.js").default}
      */
    /* protected */ var state: Any = js.native
  }
}
