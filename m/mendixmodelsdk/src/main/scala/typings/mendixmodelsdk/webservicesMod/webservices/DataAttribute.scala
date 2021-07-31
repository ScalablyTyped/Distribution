package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.appservices.MsdAttribute
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataAttribute")
@js.native
class DataAttribute protected () extends DataMember {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def attribute: IAttribute | Null = js.native
  
  def attributeByContract: MsdAttribute | Null = js.native
  def attributeByContract_=(newValue: MsdAttribute | Null): Unit = js.native
  
  def attributeQualifiedName: String | Null = js.native
  
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.5.0: introduced
    */
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
}
object DataAttribute {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): DataAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataAttribute]
  
  /**
    * Creates and returns a new DataAttribute instance in the SDK and on the server.
    * The new DataAttribute will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  /* static member */
  @scala.inline
  def createIn(container: DataEntityBase): DataAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataAttribute]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataAttribute.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataAttribute.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
