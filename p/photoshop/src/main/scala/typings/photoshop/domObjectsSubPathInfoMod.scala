package typings.photoshop

import typings.photoshop.domConstantsMod.ShapeOperation
import typings.photoshop.domObjectsPathPointInfoMod.PathPointInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsSubPathInfoMod {
  
  @JSImport("photoshop/dom/objects/SubPathInfo", "SubPathInfo")
  @js.native
  /** @ignore */
  open class SubPathInfo () extends StObject {
    
    /* private */ var _closed: Any = js.native
    
    /* private */ var _entireSubPath: Any = js.native
    
    /* private */ var _operation: Any = js.native
    
    /**
      * True if the path describes an enclosed area.
      * @minVersion 23.3
      */
    def closed: Boolean = js.native
    def closed_=(value: Boolean): Unit = js.native
    
    /**
      * An array composed of the sub-path's [[PathPoint]] objects.
      *
      * @minVersion 23.3
      */
    def entireSubPath: js.Array[PathPointInfo] = js.native
    def entireSubPath_=(value: js.Array[PathPointInfo]): Unit = js.native
    
    /**
      * The subpath's operation on other subpaths. Specifies how to combine the shapes if
      * the destination path already has a selection.
      * @minVersion 23.3
      */
    def operation: ShapeOperation = js.native
    def operation_=(value: ShapeOperation): Unit = js.native
    
    /**
      * The class name of the referenced object: *"SubPathInfo"*.
      * @minVersion 23.3
      */
    def typename: typings.photoshop.photoshopStrings.SubPathInfo = js.native
  }
}
