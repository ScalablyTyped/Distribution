package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ContentType")
@js.native
open class ContentType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ContentType {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ContentType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ContentType.Json")
  @js.native
  def Json: ContentType = js.native
  inline def Json_=(x: ContentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Json")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ContentType.Xml")
  @js.native
  def Xml: ContentType = js.native
  inline def Xml_=(x: ContentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Xml")(x.asInstanceOf[js.Any])
}
