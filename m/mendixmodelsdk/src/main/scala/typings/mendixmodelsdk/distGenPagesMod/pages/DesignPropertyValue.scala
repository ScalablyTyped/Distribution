package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DesignPropertyValue")
@js.native
class DesignPropertyValue protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var booleanValue: Boolean = js.native
  val containerAsAppearance: Appearance = js.native
  var key: String = js.native
  @JSName("model")
  var model_DesignPropertyValue: IModel = js.native
  var stringValue: String = js.native
  var `type`: DesignPropertyValueType = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DesignPropertyValue")
@js.native
object DesignPropertyValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DesignPropertyValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DesignPropertyValue = js.native
  /**
    * Creates and returns a new DesignPropertyValue instance in the SDK and on the server.
    * The new DesignPropertyValue will be automatically stored in the 'designProperties' property
    * of the parent Appearance element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: Appearance): DesignPropertyValue = js.native
}

