package typings.mediapipeFaceMesh.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mediapipe/face_mesh", "FaceMesh")
@js.native
open class FaceMesh ()
  extends StObject
     with FaceMeshInterface {
  def this(config: FaceMeshConfig) = this()
  
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def initialize(): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def onResults(listener: ResultsListener): Unit = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def send(inputs: InputMap): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def setOptions(options: Options): Unit = js.native
}
