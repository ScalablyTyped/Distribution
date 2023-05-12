package typings.photoshop

import typings.photoshop.domCollectionsPathPointsMod.PathPoints
import typings.photoshop.domConstantsMod.ShapeOperation
import typings.photoshop.domPathItemMod.PathItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domSubPathItemMod {
  
  @JSImport("photoshop/dom/SubPathItem", "SubPathItem")
  @js.native
  open class SubPathItem protected () extends StObject {
    /**
      * @ignore
      */
    def this(index: Double, pathId: Double, docId: Double) = this()
    
    /**
      * True if the path is closed.
      * @minVersion 23.3
      */
    def closed: Boolean = js.native
    
    /**
      * How this `SubPathItem` behaves when it intersects another. Specifies how to combine the shapes
      * if the destination path already has a selection.
      * @minVersion 23.3
      */
    def operation: ShapeOperation = js.native
    
    /**
      * The path that contains this subpath.
      * @minVersion 23.3
      */
    def parent: PathItem = js.native
    
    /**
      * The collection of the [[PathPoint]]s on this `SubPathItem`.
      * @minVersion 23.3
      */
    def pathPoints: PathPoints = js.native
    
    /**
      * The class name of the referenced object: *"SubPathItem"*.
      * @minVersion 23.3
      */
    def typename: typings.photoshop.photoshopStrings.SubPathItem = js.native
  }
}
