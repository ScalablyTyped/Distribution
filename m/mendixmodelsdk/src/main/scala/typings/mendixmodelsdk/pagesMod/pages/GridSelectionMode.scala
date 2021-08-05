package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridSelectionMode")
@js.native
class GridSelectionMode protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object GridSelectionMode {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridSelectionMode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridSelectionMode.Multi")
  @js.native
  def Multi: GridSelectionMode = js.native
  inline def Multi_=(x: GridSelectionMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Multi")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridSelectionMode.None")
  @js.native
  def None: GridSelectionMode = js.native
  inline def None_=(x: GridSelectionMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridSelectionMode.SimpleMulti")
  @js.native
  def SimpleMulti: GridSelectionMode = js.native
  inline def SimpleMulti_=(x: GridSelectionMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SimpleMulti")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridSelectionMode.Single")
  @js.native
  def Single: GridSelectionMode = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.GridSelectionMode.SingleAndMaintain")
  @js.native
  def SingleAndMaintain: GridSelectionMode = js.native
  inline def SingleAndMaintain_=(x: GridSelectionMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SingleAndMaintain")(x.asInstanceOf[js.Any])
  
  inline def Single_=(x: GridSelectionMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Single")(x.asInstanceOf[js.Any])
}
