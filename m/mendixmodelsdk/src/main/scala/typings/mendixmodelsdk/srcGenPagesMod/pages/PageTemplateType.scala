package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplateType")
@js.native
open class PageTemplateType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object PageTemplateType {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplateType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplateType.Edit")
  @js.native
  def Edit: PageTemplateType = js.native
  inline def Edit_=(x: PageTemplateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Edit")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplateType.Select")
  @js.native
  def Select: PageTemplateType = js.native
  inline def Select_=(x: PageTemplateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Select")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.PageTemplateType.Standard")
  @js.native
  def Standard: PageTemplateType = js.native
  inline def Standard_=(x: PageTemplateType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Standard")(x.asInstanceOf[js.Any])
}
