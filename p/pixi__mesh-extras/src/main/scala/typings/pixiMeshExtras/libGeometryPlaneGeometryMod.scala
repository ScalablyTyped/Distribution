package typings.pixiMeshExtras

import typings.pixiMesh.mod.MeshGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeometryPlaneGeometryMod {
  
  @JSImport("@pixi/mesh-extras/lib/geometry/PlaneGeometry", "PlaneGeometry")
  @js.native
  /**
    * @param width - The width of the plane.
    * @param height - The height of the plane.
    * @param segWidth - Number of horizontal segments.
    * @param segHeight - Number of vertical segments.
    */
  open class PlaneGeometry () extends MeshGeometry {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
    def this(width: Double, height: Double, segWidth: Double) = this()
    def this(width: Double, height: Unit, segWidth: Double) = this()
    def this(width: Unit, height: Double, segWidth: Double) = this()
    def this(width: Unit, height: Unit, segWidth: Double) = this()
    def this(width: Double, height: Double, segWidth: Double, segHeight: Double) = this()
    def this(width: Double, height: Double, segWidth: Unit, segHeight: Double) = this()
    def this(width: Double, height: Unit, segWidth: Double, segHeight: Double) = this()
    def this(width: Double, height: Unit, segWidth: Unit, segHeight: Double) = this()
    def this(width: Unit, height: Double, segWidth: Double, segHeight: Double) = this()
    def this(width: Unit, height: Double, segWidth: Unit, segHeight: Double) = this()
    def this(width: Unit, height: Unit, segWidth: Double, segHeight: Double) = this()
    def this(width: Unit, height: Unit, segWidth: Unit, segHeight: Double) = this()
    
    /**
      * Refreshes plane coordinates
      * @private
      */
    def build(): Unit = js.native
    
    var height: Double = js.native
    
    var segHeight: Double = js.native
    
    var segWidth: Double = js.native
    
    var width: Double = js.native
  }
}
