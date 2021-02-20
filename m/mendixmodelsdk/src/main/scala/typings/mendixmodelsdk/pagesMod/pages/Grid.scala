package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Grid")
@js.native
abstract class Grid protected () extends ListenTargetWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def controlBar: GridControlBar = js.native
  def controlBar_=(newValue: GridControlBar): Unit = js.native
  
  def defaultButtonTrigger: ClickTypeType = js.native
  def defaultButtonTrigger_=(newValue: ClickTypeType): Unit = js.native
  
  def isControlBarVisible: Boolean = js.native
  def isControlBarVisible_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.13.0: deleted
    */
  def isPagingEnabled: Boolean = js.native
  def isPagingEnabled_=(newValue: Boolean): Unit = js.native
  
  def refreshTime: Double = js.native
  def refreshTime_=(newValue: Double): Unit = js.native
  
  def selectFirst: Boolean = js.native
  def selectFirst_=(newValue: Boolean): Unit = js.native
  
  def selectionMode: GridSelectionMode = js.native
  def selectionMode_=(newValue: GridSelectionMode): Unit = js.native
  
  /**
    * In version 8.13.0: introduced
    */
  def showPagingBar: ShowPagingBarType = js.native
  def showPagingBar_=(newValue: ShowPagingBarType): Unit = js.native
}
object Grid {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Grid")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Grid.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.Grid.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
