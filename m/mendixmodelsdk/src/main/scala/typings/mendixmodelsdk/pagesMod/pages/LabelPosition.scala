package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LabelPosition")
@js.native
class LabelPosition protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object LabelPosition {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LabelPosition")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LabelPosition.AfterControl")
  @js.native
  def AfterControl: LabelPosition = js.native
  @scala.inline
  def AfterControl_=(x: LabelPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AfterControl")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LabelPosition.BeforeControl")
  @js.native
  def BeforeControl: LabelPosition = js.native
  @scala.inline
  def BeforeControl_=(x: LabelPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BeforeControl")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LabelPosition.Default")
  @js.native
  def Default: LabelPosition = js.native
  @scala.inline
  def Default_=(x: LabelPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
}
