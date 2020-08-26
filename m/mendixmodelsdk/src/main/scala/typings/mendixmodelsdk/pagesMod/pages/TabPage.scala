package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/tab-container relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TabPage")
@js.native
class TabPage protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTabPage: IModel = js.native
  def caption: Text = js.native
  def caption_=(newValue: Text): Unit = js.native
  def conditionalVisibilitySettings: ConditionalVisibilitySettings | Null = js.native
  def conditionalVisibilitySettings_=(newValue: ConditionalVisibilitySettings | Null): Unit = js.native
  def containerAsTabContainer: TabContainer = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  def refreshOnShow: Boolean = js.native
  def refreshOnShow_=(newValue: Boolean): Unit = js.native
  /**
    * In version 7.15.0: deleted
    */
  def widget: Widget | Null = js.native
  def widget_=(newValue: Widget | Null): Unit = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets: IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TabPage")
@js.native
object TabPage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TabPage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TabPage = js.native
  /**
    * Creates and returns a new TabPage instance in the SDK and on the server.
    * The new TabPage will be automatically stored in the 'tabPages' property
    * of the parent TabContainer element passed as argument.
    */
  def createIn(container: TabContainer): TabPage = js.native
}

