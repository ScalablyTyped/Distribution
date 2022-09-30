package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.FormValidations")
@js.native
open class FormValidations protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object FormValidations {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormValidations")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormValidations.All")
  @js.native
  def All: FormValidations = js.native
  inline def All_=(x: FormValidations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormValidations.None")
  @js.native
  def None: FormValidations = js.native
  inline def None_=(x: FormValidations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormValidations.Widget")
  @js.native
  def Widget: FormValidations = js.native
  inline def Widget_=(x: FormValidations): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Widget")(x.asInstanceOf[js.Any])
}
