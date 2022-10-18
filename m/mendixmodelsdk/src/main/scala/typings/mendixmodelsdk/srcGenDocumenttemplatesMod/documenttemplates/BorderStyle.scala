package typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.BorderStyle")
@js.native
open class BorderStyle protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object BorderStyle {
  
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.BorderStyle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.BorderStyle.Dashed")
  @js.native
  def Dashed: BorderStyle = js.native
  inline def Dashed_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dashed")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.BorderStyle.Dotted")
  @js.native
  def Dotted: BorderStyle = js.native
  inline def Dotted_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dotted")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.BorderStyle.None")
  @js.native
  def None: BorderStyle = js.native
  inline def None_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.BorderStyle.Solid")
  @js.native
  def Solid: BorderStyle = js.native
  inline def Solid_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solid")(x.asInstanceOf[js.Any])
}
