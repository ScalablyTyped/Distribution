package typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenTextsMod.texts.Text
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationDeleteBehavior")
@js.native
open class AssociationDeleteBehavior protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def childDeleteBehavior: DeletingBehavior = js.native
  def childDeleteBehavior_=(newValue: DeletingBehavior): Unit = js.native
  
  def childErrorMessage: Text | Null = js.native
  def childErrorMessage_=(newValue: Text | Null): Unit = js.native
  
  def containerAsAssociationBase: AssociationBase = js.native
  
  def parentDeleteBehavior: DeletingBehavior = js.native
  def parentDeleteBehavior_=(newValue: DeletingBehavior): Unit = js.native
  
  def parentErrorMessage: Text | Null = js.native
  def parentErrorMessage_=(newValue: Text | Null): Unit = js.native
}
object AssociationDeleteBehavior {
  
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationDeleteBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): AssociationDeleteBehavior = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[AssociationDeleteBehavior]
  
  /**
    * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
    * The new AssociationDeleteBehavior will be automatically stored in the 'deleteBehavior' property
    * of the parent AssociationBase element passed as argument.
    */
  /* static member */
  inline def createIn(container: AssociationBase): AssociationDeleteBehavior = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[AssociationDeleteBehavior]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationDeleteBehavior.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/domainmodels", "domainmodels.AssociationDeleteBehavior.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
