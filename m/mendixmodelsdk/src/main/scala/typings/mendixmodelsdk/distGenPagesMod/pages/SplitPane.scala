package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: deleted
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SplitPane")
@js.native
abstract class SplitPane protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FSplitPane: IModel = js.native
  def animatedResize(): Boolean = js.native
  def animatedResize(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  def firstWidget(): Widget | Null = js.native
  def firstWidget(newValue: Widget): js.Any = js.native
  @JSName("firstWidget")
  def firstWidget_Any(): js.Any = js.native
  /**
    * In version 7.15.0: introduced
    */
  def firstWidgets(): IList[Widget] = js.native
  def height(): Double = js.native
  def height(newValue: Double): js.Any = js.native
  def position(): Double = js.native
  def position(newValue: Double): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  def secondWidget(): Widget | Null = js.native
  def secondWidget(newValue: Widget): js.Any = js.native
  @JSName("secondWidget")
  def secondWidget_Any(): js.Any = js.native
  /**
    * In version 7.15.0: introduced
    */
  def secondWidgets(): IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SplitPane")
@js.native
object SplitPane extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

