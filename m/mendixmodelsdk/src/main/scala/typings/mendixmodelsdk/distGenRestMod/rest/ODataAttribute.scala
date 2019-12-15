package typings.mendixmodelsdk.distGenRestMod.rest

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataAttribute")
@js.native
class ODataAttribute protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FODataAttribute: IModel = js.native
  def attribute(): IAttribute = js.native
  def attribute(newValue: IAttribute): js.Any = js.native
  def attributeQualifiedName(): String = js.native
  def containerAsODataEntity(): ODataEntity = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataAttribute")
@js.native
object ODataAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ODataAttribute = js.native
  /**
    * Creates and returns a new ODataAttribute instance in the SDK and on the server.
    * The new ODataAttribute will be automatically stored in the 'attributes' property
    * of the parent ODataEntity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: ODataEntity): ODataAttribute = js.native
}

