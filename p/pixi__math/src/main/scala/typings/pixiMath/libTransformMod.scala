package typings.pixiMath

import typings.pixiMath.libMatrixMod.Matrix
import typings.pixiMath.libObservablePointMod.ObservablePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Transform * / any */ @JSImport("@pixi/math/lib/Transform", "Transform")
  @js.native
  open class Transform () extends StObject {
    
    /** The locally unique ID of the local transform used to calculate the current local transformation matrix. */
    /* protected */ var _currentLocalID: Double = js.native
    
    /**
      * The X-coordinate value of the normalized local X axis,
      * the first column of the local transformation matrix without a scale.
      */
    /* protected */ var _cx: Double = js.native
    
    /**
      * The X-coordinate value of the normalized local Y axis,
      * the second column of the local transformation matrix without a scale.
      */
    /* protected */ var _cy: Double = js.native
    
    /** The locally unique ID of the local transform. */
    /* protected */ var _localID: Double = js.native
    
    /** The locally unique ID of the parent's world transform used to calculate the current world transformation matrix. */
    var _parentID: Double = js.native
    
    /** The rotation amount. */
    /* protected */ var _rotation: Double = js.native
    
    /**
      * The Y-coordinate value of the normalized local X axis,
      * the first column of the local transformation matrix without a scale.
      */
    /* protected */ var _sx: Double = js.native
    
    /**
      * The Y-coordinate value of the normalized local Y axis,
      * the second column of the local transformation matrix without a scale.
      */
    /* protected */ var _sy: Double = js.native
    
    /** The locally unique ID of the world transform. */
    var _worldID: Double = js.native
    
    /** The local transformation matrix. */
    var localTransform: Matrix = js.native
    
    /** Called when a value changes. */
    /* protected */ def onChange(): Unit = js.native
    
    /** The pivot point of the displayObject that it rotates around. */
    var pivot: ObservablePoint[Any] = js.native
    
    /** The coordinate of the object relative to the local coordinates of the parent. */
    var position: ObservablePoint[Any] = js.native
    
    /** The rotation of the object in radians. */
    def rotation: Double = js.native
    def rotation_=(value: Double): Unit = js.native
    
    /** The scale factor of the object. */
    var scale: ObservablePoint[Any] = js.native
    
    /**
      * Decomposes a matrix and sets the transforms properties based on it.
      * @param matrix - The matrix to decompose
      */
    def setFromMatrix(matrix: Matrix): Unit = js.native
    
    /** The skew amount, on the x and y axis. */
    var skew: ObservablePoint[Any] = js.native
    
    /** Updates the local transformation matrix. */
    def updateLocalTransform(): Unit = js.native
    
    /** Called when the skew or the rotation changes. */
    /* protected */ def updateSkew(): Unit = js.native
    
    /**
      * Updates the local and the world transformation matrices.
      * @param parentTransform - The parent transform
      */
    def updateTransform(parentTransform: Transform): Unit = js.native
    
    /** The world transformation matrix. */
    var worldTransform: Matrix = js.native
  }
  /* static members */
  object Transform {
    
    /**
      * A default (identity) transform.
      * @static
      * @type {PIXI.Transform}
      */
    @JSImport("@pixi/math/lib/Transform", "Transform.IDENTITY")
    @js.native
    val IDENTITY: Transform = js.native
  }
}
