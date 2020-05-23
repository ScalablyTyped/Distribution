package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeType
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeType
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.9.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.restMod.rest.IODataKeyPart because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsODataKey, `type` */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataKeyPart")
@js.native
class ODataKeyPart protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsODataKey")
  val containerAsODataKey_FODataKeyPart: IODataKey = js.native
  @JSName("model")
  var model_FODataKeyPart: IModel = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("type")
  val type_FODataKeyPart: IAttributeType = js.native
  def containerAsODataKey: ODataKey = js.native
  def entityKeyPartName: String = js.native
  def entityKeyPartName(newValue: String): js.Any = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  def `type`: AttributeType = js.native
  def `type`(newValue: AttributeType): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataKeyPart")
@js.native
object ODataKeyPart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataKeyPart instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ODataKeyPart = js.native
  /**
    * Creates and returns a new ODataKeyPart instance in the SDK and on the server.
    * The new ODataKeyPart will be automatically stored in the 'parts' property
    * of the parent ODataKey element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createIn(container: ODataKey): ODataKeyPart = js.native
}

