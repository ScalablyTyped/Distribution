package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SubmitBehaviourType")
@js.native
open class SubmitBehaviourType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SubmitBehaviourType {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SubmitBehaviourType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SubmitBehaviourType.OnEndEditing")
  @js.native
  def OnEndEditing: SubmitBehaviourType = js.native
  inline def OnEndEditing_=(x: SubmitBehaviourType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnEndEditing")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SubmitBehaviourType.WhileEditing")
  @js.native
  def WhileEditing: SubmitBehaviourType = js.native
  inline def WhileEditing_=(x: SubmitBehaviourType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WhileEditing")(x.asInstanceOf[js.Any])
}
