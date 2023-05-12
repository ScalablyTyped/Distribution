package typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetSelectionType")
@js.native
open class CustomWidgetSelectionType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object CustomWidgetSelectionType {
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetSelectionType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetSelectionType.Multi")
  @js.native
  def Multi: CustomWidgetSelectionType = js.native
  inline def Multi_=(x: CustomWidgetSelectionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Multi")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetSelectionType.None")
  @js.native
  def None: CustomWidgetSelectionType = js.native
  inline def None_=(x: CustomWidgetSelectionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetSelectionType.Single")
  @js.native
  def Single: CustomWidgetSelectionType = js.native
  inline def Single_=(x: CustomWidgetSelectionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Single")(x.asInstanceOf[js.Any])
}
