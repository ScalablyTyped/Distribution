package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetEnumerationValue")
@js.native
class WidgetEnumerationValue protected ()
  extends typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetEnumerationValue")
@js.native
object WidgetEnumerationValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue = js.native
  /**
    * Creates and returns a new WidgetEnumerationValue instance in the SDK and on the server.
    * The new WidgetEnumerationValue will be automatically stored in the 'enumerationValues' property
    * of the parent WidgetValueType element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValueType): typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetEnumerationValue = js.native
}

