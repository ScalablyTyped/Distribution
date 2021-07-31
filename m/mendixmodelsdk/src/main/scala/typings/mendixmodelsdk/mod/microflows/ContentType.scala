package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.ContentType")
@js.native
class ContentType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.ContentType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ContentType {
  
  @JSImport("mendixmodelsdk", "microflows.ContentType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ContentType.Json")
  @js.native
  def Json: typings.mendixmodelsdk.microflowsMod.microflows.ContentType = js.native
  @scala.inline
  def Json_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ContentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Json")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ContentType.Xml")
  @js.native
  def Xml: typings.mendixmodelsdk.microflowsMod.microflows.ContentType = js.native
  @scala.inline
  def Xml_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ContentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Xml")(x.asInstanceOf[js.Any])
}
