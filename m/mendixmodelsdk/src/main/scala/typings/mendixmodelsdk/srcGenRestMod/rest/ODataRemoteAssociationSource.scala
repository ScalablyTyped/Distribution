package typings.mendixmodelsdk.srcGenRestMod.rest

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AssociationBase
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Navigability
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.RemoteAssociationSource
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAssociationSource because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IRemoteAssociationSource because Already inherited
- typings.mendixmodelsdk.srcGenRestMod.rest.IODataRemoteAssociationSource because var conflicts: containerAsAssociationBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataRemoteAssociationSource")
@js.native
open class ODataRemoteAssociationSource protected () extends RemoteAssociationSource {
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
  
  /**
    * In version 9.11.0: introduced
    */
  def creatableFromChild: Boolean = js.native
  def creatableFromChild_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def creatableFromParent: Boolean = js.native
  def creatableFromParent_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.14.0: deleted
    * In version 8.16.0: introduced
    */
  def navigability: AssociationNavigability = js.native
  
  /**
    * In version 9.14.0: introduced
    */
  def navigability2: Navigability = js.native
  def navigability2_=(newValue: Navigability): Unit = js.native
  
  def navigability_=(newValue: AssociationNavigability): Unit = js.native
  
  def remoteChildNavigationProperty: String = js.native
  def remoteChildNavigationProperty_=(newValue: String): Unit = js.native
  
  def remoteParentNavigationProperty: String = js.native
  def remoteParentNavigationProperty_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def updatableFromChild: Boolean = js.native
  def updatableFromChild_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.6.0: introduced
    */
  def updatableFromParent: Boolean = js.native
  def updatableFromParent_=(newValue: Boolean): Unit = js.native
}
object ODataRemoteAssociationSource {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataRemoteAssociationSource")
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
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataRemoteAssociationSource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.ODataRemoteAssociationSource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
