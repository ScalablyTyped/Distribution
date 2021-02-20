package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationDeleteBehavior")
@js.native
class AssociationDeleteBehavior protected () extends Element[IModel] {
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
  
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationDeleteBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationDeleteBehavior.create")
  @js.native
  def create(model: IModel): AssociationDeleteBehavior = js.native
  
  /**
    * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
    * The new AssociationDeleteBehavior will be automatically stored in the 'deleteBehavior' property
    * of the parent AssociationBase element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationDeleteBehavior.createIn")
  @js.native
  def createIn(container: AssociationBase): AssociationDeleteBehavior = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationDeleteBehavior.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationDeleteBehavior.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
