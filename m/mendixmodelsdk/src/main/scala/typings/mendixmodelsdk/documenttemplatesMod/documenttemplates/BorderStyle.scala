package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.BorderStyle")
@js.native
class BorderStyle protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object BorderStyle {
  
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.BorderStyle")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.BorderStyle.Dashed")
  @js.native
  def Dashed: BorderStyle = js.native
  @scala.inline
  def Dashed_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dashed")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.BorderStyle.Dotted")
  @js.native
  def Dotted: BorderStyle = js.native
  @scala.inline
  def Dotted_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dotted")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.BorderStyle.None")
  @js.native
  def None: BorderStyle = js.native
  @scala.inline
  def None_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.BorderStyle.Solid")
  @js.native
  def Solid: BorderStyle = js.native
  @scala.inline
  def Solid_=(x: BorderStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Solid")(x.asInstanceOf[js.Any])
}
