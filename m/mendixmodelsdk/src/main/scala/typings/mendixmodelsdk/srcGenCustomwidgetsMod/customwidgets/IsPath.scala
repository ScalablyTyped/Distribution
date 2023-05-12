package typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath")
@js.native
open class IsPath protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object IsPath {
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath.No")
  @js.native
  def No: IsPath = js.native
  inline def No_=(x: IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath.Optional")
  @js.native
  def Optional: IsPath = js.native
  inline def Optional_=(x: IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Optional")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.IsPath.Yes")
  @js.native
  def Yes: IsPath = js.native
  inline def Yes_=(x: IsPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Yes")(x.asInstanceOf[js.Any])
}
