package typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.ContentType")
@js.native
open class ContentType protected ()
  extends typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ContentType {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.ContentType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.ContentType.Json")
  @js.native
  def Json: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType = js.native
  inline def Json_=(x: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Json")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "microflows.ContentType.Xml")
  @js.native
  def Xml: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType = js.native
  inline def Xml_=(x: typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Xml")(x.asInstanceOf[js.Any])
}
