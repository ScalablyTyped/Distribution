package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 4x4 matrix.
  */
@JSGlobal("pc.Mat4")
@js.native
open class Mat4 ()
  extends typings.playcanvas.mod.Mat4
object Mat4 {
  
  @JSGlobal("pc.Mat4")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A constant matrix set to the identity.
    *
    * @type {Mat4}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Mat4.IDENTITY")
  @js.native
  val IDENTITY: typings.playcanvas.mod.Mat4 = js.native
  
  /**
    * A constant matrix with all elements set to 0.
    *
    * @type {Mat4}
    * @readonly
    */
  /* static member */
  @JSGlobal("pc.Mat4.ZERO")
  @js.native
  val ZERO: typings.playcanvas.mod.Mat4 = js.native
  
  /* static member */
  inline def getPerspectiveHalfSize(halfSize: Any, fov: Any, aspect: Any, znear: Any, fovIsHorizontal: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_getPerspectiveHalfSize")(halfSize.asInstanceOf[js.Any], fov.asInstanceOf[js.Any], aspect.asInstanceOf[js.Any], znear.asInstanceOf[js.Any], fovIsHorizontal.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
