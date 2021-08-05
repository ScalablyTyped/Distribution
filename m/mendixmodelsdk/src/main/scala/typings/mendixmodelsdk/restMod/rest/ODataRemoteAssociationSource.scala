package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationBase
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.RemoteAssociationSource
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsAssociationBase")
  def containerAsAssociationBase_MODataRemoteAssociationSource: AssociationBase = js.native
  
  def remoteChildNavigationProperty: String = js.native
  def remoteChildNavigationProperty_=(newValue: String): Unit = js.native
  
  def remoteParentNavigationProperty: String = js.native
  def remoteParentNavigationProperty_=(newValue: String): Unit = js.native
}
object ODataRemoteAssociationSource {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ODataRemoteAssociationSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ODataRemoteAssociationSource]
  
  /**
    * Creates and returns a new ODataRemoteAssociationSource instance in the SDK and on the server.
    * The new ODataRemoteAssociationSource will be automatically stored in the 'source' property
    * of the parent domainmodels.AssociationBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.10.0 and higher
    */
  /* static member */
  inline def createIn(container: AssociationBase): ODataRemoteAssociationSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ODataRemoteAssociationSource]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.ODataRemoteAssociationSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
