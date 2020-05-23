package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteAssociationSource
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
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationSource because Already inherited
- typings.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteAssociationSource because Already inherited
- typings.mendixmodelsdk.restMod.rest.IODataRemoteAssociationSource because var conflicts: containerAsAssociationBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource")
@js.native
class ODataRemoteAssociationSource protected () extends RemoteAssociationSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FODataRemoteAssociationSource: IModel = js.native
  @JSName("containerAsAssociationBase")
  def containerAsAssociationBase_MODataRemoteAssociationSource: AssociationBase = js.native
  def remoteChildNavigationProperty: String = js.native
  def remoteChildNavigationProperty(newValue: String): js.Any = js.native
  def remoteParentNavigationProperty: String = js.native
  def remoteParentNavigationProperty(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource")
@js.native
object ODataRemoteAssociationSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ODataRemoteAssociationSource = js.native
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * The new ODataRemoteAssociationSource will be automatically stored in the 'source' property
    * of the parent domainmodels.AssociationBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  def createIn(container: AssociationBase): ODataRemoteAssociationSource = js.native
}

