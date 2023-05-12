package typings.photoshop

import typings.photoshop.anon.X
import typings.photoshop.domCollectionsSubPathItemsMod.SubPathItems
import typings.photoshop.domConstantsMod.ColorBlendMode
import typings.photoshop.domConstantsMod.PathKind
import typings.photoshop.domConstantsMod.SelectionType
import typings.photoshop.domConstantsMod.ToolType
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domLayerMod.Layer
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPathItemMod {
  
  @JSImport("photoshop/dom/PathItem", "PathItem")
  @js.native
  open class PathItem protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double, docId: Double) = this()
    
    /**
      * Deselects this `pathItem` object.
      * @minVersion 23.3
      */
    def deselect(): js.Promise[Unit] = js.native
    
    /**
      * The ID of the document of this pathItem.
      * @minVersion 23.3
      */
    def docId: Double = js.native
    
    /**
      * Duplicates the `pathItem` object with the new name, returning the duplicate.
      * @minVersion 23.3
      */
    def duplicate(): js.Promise[PathItem] = js.native
    def duplicate(name: String): js.Promise[PathItem] = js.native
    
    /**
      * Fills the area enclosed by this path.
      *
      * `opacity` is a percentage, in the `[0.0 ... 100.0]` range.
      *
      * `feather` is in pixels, in the `[0.0 ... 250.0]` range.
      *
      * If `wholePath` is true, all subpaths are used when doing the fill.
      * @minVersion 23.3
      */
    def fillPath(
      fillColor: js.UndefOr[SolidColor],
      mode: js.UndefOr[ColorBlendMode],
      opacity: js.UndefOr[Double],
      preserveTransparency: js.UndefOr[Boolean],
      feather: js.UndefOr[Double],
      wholePath: js.UndefOr[Boolean],
      antiAlias: js.UndefOr[Boolean]
    ): js.Promise[Unit] = js.native
    
    /**
      * For use with batchPlay operations. This pathItem ID, along with its document ID
      * can be used to represent this pathItem for the lifetime of this document.
      * @minVersion 23.3
      */
    def id: Double = js.native
    
    /**
      * The specific kind of path.
      * @minVersion 23.3
      */
    def kind: PathKind = js.native
    def kind_=(kind: PathKind): Unit = js.native
    
    /**
      * Makes this the clipping path for this document.
      *
      * `flatness` tells the PostScript printer how to approximate curves in the path.
      * @minVersion 23.3
      */
    def makeClippingPath(): js.Promise[Unit] = js.native
    def makeClippingPath(flatness: Double): js.Promise[Unit] = js.native
    
    /**
      * Makes a selection object whose border is this path.
      *
      * `feather` is in pixels, in the range [0.0...250.0]
      *
      * `operation`, by default, is `SelectionType.REPLACE`
      * @minVersion 23.3
      */
    def makeSelection(): js.Promise[Unit] = js.native
    def makeSelection(feather: Double): js.Promise[Unit] = js.native
    def makeSelection(feather: Double, antiAlias: Boolean): js.Promise[Unit] = js.native
    def makeSelection(feather: Double, antiAlias: Boolean, operation: SelectionType): js.Promise[Unit] = js.native
    def makeSelection(feather: Double, antiAlias: Unit, operation: SelectionType): js.Promise[Unit] = js.native
    def makeSelection(feather: Unit, antiAlias: Boolean): js.Promise[Unit] = js.native
    def makeSelection(feather: Unit, antiAlias: Boolean, operation: SelectionType): js.Promise[Unit] = js.native
    def makeSelection(feather: Unit, antiAlias: Unit, operation: SelectionType): js.Promise[Unit] = js.native
    
    /**
      * Name of this path
      * @minVersion 23.3
      */
    def name: String = js.native
    def name_=(name: String): Unit = js.native
    
    /**
      * The document in which the path resides.
      * @minVersion 23.3
      */
    def parent: Document = js.native
    
    /**
      * Deletes this object.
      * @minVersion 23.3
      */
    def remove(): js.Promise[Unit] = js.native
    
    /**
      * Makes this the active or selected `PathItem` object.
      * @minVersion 23.3
      */
    def select(): js.Promise[Unit] = js.native
    
    /**
      * Strokes the path with the specified tool
      *
      * `tool` is optional, and by default will use `ToolType.PENCIL`
      *
      * `simulatePressure` is false by default.
      *
      * If the tool is `ToolType.CLONESTAMP` or `ToolType.HEALINGBRUSH`, `sourceOrigin` must be provided as a
      * an object with x and y properties (in pixels) to indicate the location of the stroke source. `sourceLayer`
      * is optional, and by default will use the active layer in the document.
      * @minVersion 23.3
      */
    def strokePath(): js.Promise[Unit] = js.native
    def strokePath(tool: Unit, simulatePressure: Boolean): js.Promise[Unit] = js.native
    def strokePath(tool: Unit, simulatePressure: Boolean, sourceOrigin: Unit, sourceLayer: Layer): js.Promise[Unit] = js.native
    def strokePath(tool: Unit, simulatePressure: Boolean, sourceOrigin: X): js.Promise[Unit] = js.native
    def strokePath(tool: Unit, simulatePressure: Boolean, sourceOrigin: X, sourceLayer: Layer): js.Promise[Unit] = js.native
    def strokePath(tool: Unit, simulatePressure: Unit, sourceOrigin: Unit, sourceLayer: Layer): js.Promise[Unit] = js.native
    def strokePath(tool: Unit, simulatePressure: Unit, sourceOrigin: X): js.Promise[Unit] = js.native
    def strokePath(tool: Unit, simulatePressure: Unit, sourceOrigin: X, sourceLayer: Layer): js.Promise[Unit] = js.native
    def strokePath(tool: ToolType): js.Promise[Unit] = js.native
    def strokePath(tool: ToolType, simulatePressure: Boolean): js.Promise[Unit] = js.native
    def strokePath(tool: ToolType, simulatePressure: Boolean, sourceOrigin: Unit, sourceLayer: Layer): js.Promise[Unit] = js.native
    def strokePath(tool: ToolType, simulatePressure: Boolean, sourceOrigin: X): js.Promise[Unit] = js.native
    def strokePath(tool: ToolType, simulatePressure: Boolean, sourceOrigin: X, sourceLayer: Layer): js.Promise[Unit] = js.native
    def strokePath(tool: ToolType, simulatePressure: Unit, sourceOrigin: Unit, sourceLayer: Layer): js.Promise[Unit] = js.native
    def strokePath(tool: ToolType, simulatePressure: Unit, sourceOrigin: X): js.Promise[Unit] = js.native
    def strokePath(tool: ToolType, simulatePressure: Unit, sourceOrigin: X, sourceLayer: Layer): js.Promise[Unit] = js.native
    
    /**
      * The contained [[SubPathItem]]s in this path.
      * @minVersion 23.3
      */
    def subPathItems: SubPathItems = js.native
    
    /**
      * The class name of the referenced object: *"PathItem"*.
      * @minVersion 23.3
      */
    def typename: typings.photoshop.photoshopStrings.PathItem = js.native
  }
}
