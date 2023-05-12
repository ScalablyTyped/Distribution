package typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAssociationType")
@js.native
open class CustomWidgetAssociationType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object CustomWidgetAssociationType {
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAssociationType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAssociationType.Reference")
  @js.native
  def Reference: CustomWidgetAssociationType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.CustomWidgetAssociationType.ReferenceSet")
  @js.native
  def ReferenceSet: CustomWidgetAssociationType = js.native
  inline def ReferenceSet_=(x: CustomWidgetAssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReferenceSet")(x.asInstanceOf[js.Any])
  
  inline def Reference_=(x: CustomWidgetAssociationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Reference")(x.asInstanceOf[js.Any])
}
