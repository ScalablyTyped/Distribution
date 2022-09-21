package typings.photoshop

import typings.photoshop.constantsMod.BlendMode
import typings.photoshop.constantsMod.DocumentFill
import typings.photoshop.constantsMod.LabelColors
import typings.photoshop.constantsMod.NewDocumentMode
import typings.photoshop.layerMod.Layer
import typings.photoshop.solidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createOptionsMod {
  
  @JSImport("photoshop/dom/objects/CreateOptions", "DocumentCreateOptions")
  @js.native
  /** @ignore */
  open class DocumentCreateOptions () extends StObject {
    
    /** Depth */
    var depth: js.UndefOr[Double] = js.native
    
    /** Fill color of the document */
    var fill: js.UndefOr[DocumentFill] = js.native
    
    /** Custom fill color of the document */
    var fillColor: js.UndefOr[SolidColor] = js.native
    
    /** Height of image in px */
    var height: js.UndefOr[Double] = js.native
    
    /** ImageMode class */
    var mode: js.UndefOr[NewDocumentMode] = js.native
    
    /** The name to give the new document */
    var name: js.UndefOr[String] = js.native
    
    /** Pixel Scale Factor */
    var pixelScaleFactor: js.UndefOr[Double] = js.native
    
    /** Preset */
    var preset: js.UndefOr[String] = js.native
    
    /** JSON Preset, requires JSONified string */
    var presetJSON: js.UndefOr[String] = js.native
    
    /** Color Profile using profile name */
    var profile: js.UndefOr[String] = js.native
    
    /** Resolution of image  */
    var resolution: js.UndefOr[Double] = js.native
    
    /**
      * The class name of the referenced object
      * @default "DocumentCreateOptions"
      */
    val typename: String = js.native
    
    /** Width of image in px */
    var width: js.UndefOr[Double] = js.native
  }
  
  @JSImport("photoshop/dom/objects/CreateOptions", "GroupLayerCreateOptions")
  @js.native
  /** @ignore */
  open class GroupLayerCreateOptions () extends StObject {
    
    /**
      * Label color of the newly created layer group
      * @options none red orange yellowColor green blue violet gray
      * @default none
      */
    var color: js.UndefOr[LabelColors] = js.native
    
    /**
      * Layer(s) to populate the newly created group
      */
    var fromLayers: js.UndefOr[Layer | js.Array[Layer]] = js.native
    
    /**
      * Blend mode of the newly created layer group
      * @options // TODO:
      * @default normal
      */
    var mode: js.UndefOr[BlendMode] = js.native
    
    /**
      * Name of the newly created layer group
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Opacity of the newly created layer group
      *
      * @default 100
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * The class name of the referenced object
      * @default "GroupLayerCreateOptions"
      */
    val typename: String = js.native
  }
  
  @JSImport("photoshop/dom/objects/CreateOptions", "LayerCreateOptions")
  @js.native
  /** @ignore */
  open class LayerCreateOptions () extends StObject {
    
    /**
      * Blend mode of the newly created layer
      * @options // TODO:
      * @default normal
      */
    var blendMode: js.UndefOr[BlendMode] = js.native
    
    /**
      * Label color of the newly created layer
      * @options none red orange yellowColor green blue violet gray
      * @default none
      */
    var color: js.UndefOr[LabelColors] = js.native
    
    /**
      * Whether to fill with neutral color when applying Blend Mode
      *
      * @default false
      */
    var fillNeutral: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to use previous layer to create clipping mask
      *
      * @default false
      */
    var group: js.UndefOr[Boolean] = js.native
    
    /**
      * Blend mode of the newly created layer. Deprecated, please use [[LayerCreateOptions.blendMode]]
      * as it will override this value.
      * @options // TODO:
      * @default normal
      */
    var mode: js.UndefOr[BlendMode] = js.native
    
    /**
      * Name of the newly created layer
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Opacity of the newly created layer
      *
      * @default 100
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /**
      * The class name of the referenced object
      * @default "LayerCreateOptions"
      */
    val typename: String = js.native
  }
}
