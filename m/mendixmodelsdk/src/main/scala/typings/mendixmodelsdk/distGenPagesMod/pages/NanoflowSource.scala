package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.12.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NanoflowSource")
@js.native
class NanoflowSource protected () extends DataSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var nanoflow: INanoflow | Null = js.native
  val nanoflowQualifiedName: String | Null = js.native
  /**
    * In version 7.19.0: introduced
    */
  val parameterMappings: IList[NanoflowParameterMapping] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.NanoflowSource")
@js.native
object NanoflowSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NanoflowSource = js.native
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.12.0 to 8.2.0
    */
  def createIn(container: EntityWidget): NanoflowSource = js.native
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.12.0 and higher
    */
  def createInEntityWidgetUnderDataSource(container: EntityWidget): NanoflowSource = js.native
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): NanoflowSource = js.native
}

