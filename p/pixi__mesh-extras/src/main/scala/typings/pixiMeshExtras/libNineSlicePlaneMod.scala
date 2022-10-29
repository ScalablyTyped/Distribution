package typings.pixiMeshExtras

import typings.pixiCore.libGeometryBufferMod.ITypedArray
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMeshExtras.libSimplePlaneMod.SimplePlane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNineSlicePlaneMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.NineSlicePlane * / any */ @JSImport("@pixi/mesh-extras/lib/NineSlicePlane", "NineSlicePlane")
  @js.native
  open class NineSlicePlane protected () extends SimplePlane {
    /**
      * @param texture - The texture to use on the NineSlicePlane.
      * @param {number} [leftWidth=10] - size of the left vertical bar (A)
      * @param {number} [topHeight=10] - size of the top horizontal bar (C)
      * @param {number} [rightWidth=10] - size of the right vertical bar (B)
      * @param {number} [bottomHeight=10] - size of the bottom horizontal bar (D)
      */
    def this(texture: Texture[Resource]) = this()
    def this(texture: Texture[Resource], leftWidth: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Double, topHeight: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Unit, topHeight: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Double, topHeight: Double, rightWidth: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Double, topHeight: Unit, rightWidth: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Unit, topHeight: Double, rightWidth: Double) = this()
    def this(texture: Texture[Resource], leftWidth: Unit, topHeight: Unit, rightWidth: Double) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Double,
      topHeight: Double,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Double,
      topHeight: Double,
      rightWidth: Unit,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Double,
      topHeight: Unit,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Double,
      topHeight: Unit,
      rightWidth: Unit,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Unit,
      topHeight: Double,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Unit,
      topHeight: Double,
      rightWidth: Unit,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Unit,
      topHeight: Unit,
      rightWidth: Double,
      bottomHeight: Double
    ) = this()
    def this(
      texture: Texture[Resource],
      leftWidth: Unit,
      topHeight: Unit,
      rightWidth: Unit,
      bottomHeight: Double
    ) = this()
    
    /**
      * The height of the bottom row (d)
      * @private
      */
    var _bottomHeight: Double = js.native
    
    /**
      * Returns the smaller of a set of vertical and horizontal scale of nine slice corners.
      * @returns Smaller number of vertical and horizontal scale.
      */
    /* private */ var _getMinScale: Any = js.native
    
    /**
      * The width of the left column (a).
      * @private
      */
    var _leftWidth: Double = js.native
    
    /* private */ var _origHeight: Any = js.native
    
    /* private */ var _origWidth: Any = js.native
    
    /** Refreshes NineSlicePlane coords. All of them. */
    /* private */ var _refresh: Any = js.native
    
    /**
      * The width of the right column (b)
      * @private
      */
    var _rightWidth: Double = js.native
    
    /**
      * The height of the top row (c)
      * @private
      */
    var _topHeight: Double = js.native
    
    /** The height of the bottom row. */
    def bottomHeight: Double = js.native
    def bottomHeight_=(value: Double): Unit = js.native
    
    /** The width of the left column. */
    def leftWidth: Double = js.native
    def leftWidth_=(value: Double): Unit = js.native
    
    /** The width of the right column. */
    def rightWidth: Double = js.native
    def rightWidth_=(value: Double): Unit = js.native
    
    /** The height of the top row. */
    def topHeight: Double = js.native
    def topHeight_=(value: Double): Unit = js.native
    
    /** Updates the horizontal vertices. */
    def updateHorizontalVertices(): Unit = js.native
    
    /** Updates the vertical vertices. */
    def updateVerticalVertices(): Unit = js.native
    
    def vertices: ITypedArray = js.native
    def vertices_=(value: ITypedArray): Unit = js.native
  }
}
