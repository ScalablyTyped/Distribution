package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.renderCanvasMod.BuilderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCanvasBuilderGroupMod {
  
  @JSImport("ol/render/canvas/BuilderGroup", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BuilderGroup {
    /**
      * @param {number} tolerance Tolerance.
      * @param {import("../../extent.js").Extent} maxExtent Max extent.
      * @param {number} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      */
    def this(tolerance: Double, maxExtent: Extent, resolution: Double, pixelRatio: Double) = this()
  }
  
  @js.native
  trait BuilderGroup extends StObject {
    
    /**
      * @private
      * @type {!Object<string, !Object<import("../canvas.js").BuilderType, Builder>>}
      */
    /* private */ var buildersByZIndex_ : Any = js.native
    
    /**
      * @return {!Object<string, !Object<import("../canvas.js").BuilderType, import("./Builder.js").SerializableInstructions>>} The serializable instructions
      */
    def finish(): StringDictionary[Any] = js.native
    
    /**
      * @param {number|undefined} zIndex Z index.
      * @param {import("../canvas.js").BuilderType} builderType Replay type.
      * @return {import("../VectorContext.js").default} Replay.
      */
    def getBuilder(zIndex: Double, builderType: BuilderType): typings.ol.renderVectorContextMod.default = js.native
    def getBuilder(zIndex: Unit, builderType: BuilderType): typings.ol.renderVectorContextMod.default = js.native
    
    /**
      * @private
      * @type {import("../../extent.js").Extent}
      */
    /* private */ var maxExtent_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var pixelRatio_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var resolution_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var tolerance_ : Any = js.native
  }
}
