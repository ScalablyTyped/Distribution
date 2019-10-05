package typings.mendixmodelsdk.distGenPagesMod.pages

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
  var animatedResize: Boolean = js.native
  /**
    * In version 7.15.0: deleted
    */
  var firstWidget: Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  val firstWidgets: IList[Widget] = js.native
  var height: Double = js.native
  var position: Double = js.native
  /**
    * In version 7.15.0: deleted
    */
  var secondWidget: Widget | Null = js.native
  /**
    * In version 7.15.0: introduced
    */
  val secondWidgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SplitPane")
@js.native
object SplitPane extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

