package typings.mendixmodelsdk.srcGenWebservicesMod.webservices

import typings.mendixmodelsdk.srcGenAppservicesMod.appservices.MsdMicroflowParameter
import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.PublishedParameter")
@js.native
open class PublishedParameter protected () extends Element[IModel] {
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
  
  /**
    * In version 9.0.2: deleted
    */
  def entityExposedItemNameByContract: String = js.native
  def entityExposedItemNameByContract_=(newValue: String): Unit = js.native
  
  def entityExposedItemName_=(newValue: String): Unit = js.native
  
  def entityExposedName: String = js.native
  def entityExposedName_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.0.2: deleted
    */
  def isLockedByContract: Boolean = js.native
  def isLockedByContract_=(newValue: Boolean): Unit = js.native
  
  def isNillable: Boolean = js.native
  def isNillable_=(newValue: Boolean): Unit = js.native
  
  def isOptional: Boolean = js.native
  
  /**
    * In version 9.0.2: deleted
    */
  def isOptionalByContract: Boolean = js.native
  def isOptionalByContract_=(newValue: Boolean): Unit = js.native
  
  def isOptional_=(newValue: Boolean): Unit = js.native
  
  def parameter: IMicroflowParameter | Null = js.native
  
  /**
    * In version 9.0.2: deleted
    */
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
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.PublishedParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PublishedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedParameter]
  
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * The new PublishedParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedOperation element passed as argument.
    */
  /* static member */
  inline def createIn(container: PublishedOperation): PublishedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedParameter]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.PublishedParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.PublishedParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
