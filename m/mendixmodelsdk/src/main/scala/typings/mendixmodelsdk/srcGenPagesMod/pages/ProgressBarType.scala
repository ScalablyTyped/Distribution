package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ProgressBarType")
@js.native
open class ProgressBarType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ProgressBarType {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ProgressBarType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ProgressBarType.Blocking")
  @js.native
  def Blocking: ProgressBarType = js.native
  inline def Blocking_=(x: ProgressBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Blocking")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ProgressBarType.NonBlocking")
  @js.native
  def NonBlocking: ProgressBarType = js.native
  inline def NonBlocking_=(x: ProgressBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NonBlocking")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ProgressBarType.None")
  @js.native
  def None: ProgressBarType = js.native
  inline def None_=(x: ProgressBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
}
