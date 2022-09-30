package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpMethod")
@js.native
open class HttpMethod protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object HttpMethod {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpMethod")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpMethod.Delete")
  @js.native
  def Delete: HttpMethod = js.native
  inline def Delete_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Delete")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpMethod.Get")
  @js.native
  def Get: HttpMethod = js.native
  inline def Get_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Get")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpMethod.Patch")
  @js.native
  def Patch: HttpMethod = js.native
  inline def Patch_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Patch")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpMethod.Post")
  @js.native
  def Post: HttpMethod = js.native
  inline def Post_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Post")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.HttpMethod.Put")
  @js.native
  def Put: HttpMethod = js.native
  inline def Put_=(x: HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Put")(x.asInstanceOf[js.Any])
}
