package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteEntitySource
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntitySource because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySource because Already inherited
- typings.mendixmodelsdk.restMod.rest.IODataRemoteEntitySource because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteEntitySource")
@js.native
class ODataRemoteEntitySource protected () extends RemoteEntitySource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FODataRemoteEntitySource: IModel = js.native
  @JSName("containerAsEntity")
  def containerAsEntity_MODataRemoteEntitySource: Entity = js.native
  def remoteName: String = js.native
  def remoteName(newValue: String): js.Any = js.native
  def sourceDocument(): js.Any = js.native
  def sourceDocument(newValue: IConsumedODataService): js.Any = js.native
  def sourceDocumentQualifiedName: String | Null = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("sourceDocument")
  def sourceDocument_Union: IConsumedODataService | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteEntitySource")
@js.native
object ODataRemoteEntitySource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ODataRemoteEntitySource = js.native
  /**
    * Creates and returns a new ODataRemoteEntitySource instance in the SDK and on the server.
    * The new ODataRemoteEntitySource will be automatically stored in the 'source' property
    * of the parent domainmodels.Entity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: Entity): ODataRemoteEntitySource = js.native
}

