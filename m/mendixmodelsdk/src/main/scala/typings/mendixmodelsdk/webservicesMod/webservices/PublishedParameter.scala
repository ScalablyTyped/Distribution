package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedParameter")
@js.native
class PublishedParameter protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsPublishedOperation: PublishedOperation = js.native
  
  def dataEntity: DataEntity = js.native
  def dataEntity_=(newValue: DataEntity): Unit = js.native
  
  def entityExposedItemName: String = js.native
  
  def entityExposedItemNameByContract: String = js.native
  def entityExposedItemNameByContract_=(newValue: String): Unit = js.native
  
  def entityExposedItemName_=(newValue: String): Unit = js.native
  
  def entityExposedName: String = js.native
  def entityExposedName_=(newValue: String): Unit = js.native
  
  def isLockedByContract: Boolean = js.native
  def isLockedByContract_=(newValue: Boolean): Unit = js.native
  
  def isNillable: Boolean = js.native
  def isNillable_=(newValue: Boolean): Unit = js.native
  
  def isOptional: Boolean = js.native
  
  def isOptionalByContract: Boolean = js.native
  def isOptionalByContract_=(newValue: Boolean): Unit = js.native
  
  def isOptional_=(newValue: Boolean): Unit = js.native
  
  def parameter: IMicroflowParameter | Null = js.native
  
  def parameterByContract: MsdMicroflowParameter = js.native
  def parameterByContract_=(newValue: MsdMicroflowParameter): Unit = js.native
  
  def parameterQualifiedName: String | Null = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def parameterType: DataType = js.native
  def parameterType_=(newValue: DataType): Unit = js.native
  
  def parameter_=(newValue: IMicroflowParameter | Null): Unit = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
}
object PublishedParameter {
  
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): PublishedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedParameter]
  
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * The new PublishedParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedOperation element passed as argument.
    */
  /* static member */
  @scala.inline
  def createIn(container: PublishedOperation): PublishedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
