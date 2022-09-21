package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A frustum is a shape that defines the viewing space of a camera. It can be used to determine
  * visibility of points and bounding spheres. Typically, you would not create a Frustum shape
  * directly, but instead query {@link CameraComponent#frustum}.
  */
@JSGlobal("pc.Frustum")
@js.native
open class Frustum ()
  extends typings.playcanvas.mod.Frustum
object Frustum {
  
  @JSGlobal("pc.Frustum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getPoints(camera: Any, near: Any, far: Any): js.Array[typings.playcanvas.mod.Vec3] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPoints")(camera.asInstanceOf[js.Any], near.asInstanceOf[js.Any], far.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.playcanvas.mod.Vec3]]
}
