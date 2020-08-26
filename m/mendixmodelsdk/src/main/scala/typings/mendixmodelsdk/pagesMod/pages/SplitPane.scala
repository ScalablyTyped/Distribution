package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
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
  def animatedResize: Boolean = js.native
  def animatedResize_=(newValue: Boolean): Unit = js.native
  /**
    * In version 7.15.0: deleted
    */
  def firstWidget: Widget | Null = js.native
  def firstWidget_=(newValue: Widget | Null): Unit = js.native
  /**
    * In version 7.15.0: introduced
    */
  def firstWidgets: IList[Widget] = js.native
  def height: Double = js.native
  def height_=(newValue: Double): Unit = js.native
  def position: Double = js.native
  def position_=(newValue: Double): Unit = js.native
  /**
    * In version 7.15.0: deleted
    */
  def secondWidget: Widget | Null = js.native
  def secondWidget_=(newValue: Widget | Null): Unit = js.native
  /**
    * In version 7.15.0: introduced
    */
  def secondWidgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SplitPane")
@js.native
object SplitPane extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

