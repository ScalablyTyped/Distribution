package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.instancesMod.IList
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
  * In version 8.9.0: added public
  * In version 7.18.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.restMod.rest.IODataEntity because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsConsumedODataService, name, key */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataEntity")
@js.native
class ODataEntity protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsConsumedODataService")
  val containerAsConsumedODataService_FODataEntity: IConsumedODataService = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.9.0: introduced
    */
  @JSName("key")
  val key_FODataEntity: IODataKey | Null = js.native
  @JSName("model")
  var model_FODataEntity: IModel = js.native
  /**
    * In version 8.10.0: added public
    */
  @JSName("name")
  val name_FODataEntity: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.0.0: introduced
    */
  def attributes: IList[ODataAttribute] = js.native
  def containerAsConsumedODataService: ConsumedODataService = js.native
  /**
    * In version 8.10.0: deleted
    */
  def entity: IEntity = js.native
  def entity(newValue: IEntity): js.Any = js.native
  def entityQualifiedName: String = js.native
  /**
    * In version 7.19.0: introduced
    */
  def entitySet: String = js.native
  def entitySet(newValue: String): js.Any = js.native
  def key(): js.Any = js.native
  def key(newValue: ODataKey): js.Any = js.native
  /**
    * In version 8.9.0: deleted
    * In version 7.22.0: introduced
    */
  def keyNames: IList[String] = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.9.0: introduced
    */
  @JSName("key")
  def key_Union: ODataKey | Null = js.native
  /**
    * In version 8.10.0: added public
    */
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  def navigationProperties: IList[ODataNavigationProperty] = js.native
  @JSName("qualifiedName")
  def qualifiedName_MODataEntity: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataEntity")
@js.native
object ODataEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ODataEntity = js.native
  /**
    * Creates and returns a new ODataEntity instance in the SDK and on the server.
    * The new ODataEntity will be automatically stored in the 'entities' property
    * of the parent ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createIn(container: ConsumedODataService): ODataEntity = js.native
}

