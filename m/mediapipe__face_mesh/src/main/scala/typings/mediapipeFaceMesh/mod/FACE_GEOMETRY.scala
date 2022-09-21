package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FACE_GEOMETRY {
  
  @JSImport("@mediapipe/face_mesh", "FACE_GEOMETRY")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mediapipe/face_mesh", "FACE_GEOMETRY.DEFAULT_CAMERA_PARAMS")
  @js.native
  def DEFAULT_CAMERA_PARAMS: DefaultCameraParams = js.native
  inline def DEFAULT_CAMERA_PARAMS_=(x: DefaultCameraParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_CAMERA_PARAMS")(x.asInstanceOf[js.Any])
  
  @JSImport("@mediapipe/face_mesh", "FACE_GEOMETRY.Layout")
  @js.native
  def Layout: typings.mediapipeFaceMesh.mod.Layout = js.native
  inline def Layout_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layout")(x.asInstanceOf[js.Any])
  
  @JSImport("@mediapipe/face_mesh", "FACE_GEOMETRY.PrimitiveType")
  @js.native
  def PrimitiveType: typings.mediapipeFaceMesh.mod.PrimitiveType = js.native
  inline def PrimitiveType_=(x: PrimitiveType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrimitiveType")(x.asInstanceOf[js.Any])
  
  @JSImport("@mediapipe/face_mesh", "FACE_GEOMETRY.VertexType")
  @js.native
  def VertexType: typings.mediapipeFaceMesh.mod.VertexType = js.native
  inline def VertexType_=(x: VertexType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VertexType")(x.asInstanceOf[js.Any])
}
