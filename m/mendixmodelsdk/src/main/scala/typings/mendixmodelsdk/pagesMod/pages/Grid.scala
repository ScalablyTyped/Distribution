package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Grid")
@js.native
abstract class Grid protected () extends ListenTargetWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FGrid: IModel = js.native
  def controlBar: GridControlBar = js.native
  def controlBar(newValue: GridControlBar): js.Any = js.native
  def defaultButtonTrigger: ClickTypeType = js.native
  def defaultButtonTrigger(newValue: ClickTypeType): js.Any = js.native
  def isControlBarVisible: Boolean = js.native
  def isControlBarVisible(newValue: Boolean): js.Any = js.native
  def isPagingEnabled: Boolean = js.native
  def isPagingEnabled(newValue: Boolean): js.Any = js.native
  def refreshTime: Double = js.native
  def refreshTime(newValue: Double): js.Any = js.native
  def selectFirst: Boolean = js.native
  def selectFirst(newValue: Boolean): js.Any = js.native
  def selectionMode: GridSelectionMode = js.native
  def selectionMode(newValue: GridSelectionMode): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.Grid")
@js.native
object Grid extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

