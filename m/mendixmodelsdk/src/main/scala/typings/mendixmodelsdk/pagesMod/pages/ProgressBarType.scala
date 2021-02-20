package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ProgressBarType")
@js.native
class ProgressBarType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ProgressBarType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ProgressBarType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ProgressBarType.Blocking")
  @js.native
  def Blocking: ProgressBarType = js.native
  @scala.inline
  def Blocking_=(x: ProgressBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Blocking")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ProgressBarType.NonBlocking")
  @js.native
  def NonBlocking: ProgressBarType = js.native
  @scala.inline
  def NonBlocking_=(x: ProgressBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NonBlocking")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ProgressBarType.None")
  @js.native
  def None: ProgressBarType = js.native
  @scala.inline
  def None_=(x: ProgressBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
}
