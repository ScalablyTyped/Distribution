package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcCommonMod.common.IPoint
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/associations relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAssociationBase because Already inherited
- typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAssociation because var conflicts: capabilities, containerAsDomainModel, documentation, id, isLoaded, model, name, owner, parent, qualifiedName, remoteSourceDocument, remoteSourceDocumentQualifiedName, source, structureTypeName, `type`, unit. Inlined child */ @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Association")
@js.native
open class Association protected () extends AssociationBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def child: Entity = js.native
  
  def childConnection: IPoint = js.native
  def childConnection_=(newValue: IPoint): Unit = js.native
  
  def child_=(newValue: Entity): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("child")
  val child_FAssociation: IEntity = js.native
  
  @JSName("containerAsDomainModel")
  def containerAsDomainModel_MAssociation: DomainModel = js.native
  
  def parentConnection: IPoint = js.native
  def parentConnection_=(newValue: IPoint): Unit = js.native
}
object Association {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Association")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Association instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): Association = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Association]
  
  /**
    * Creates and returns a new Association instance in the SDK and on the server.
    * The new Association will be automatically stored in the 'associations' property
    * of the parent DomainModel element passed as argument.
    */
  /* static member */
  inline def createIn(container: DomainModel): Association = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Association]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Association.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.Association.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
