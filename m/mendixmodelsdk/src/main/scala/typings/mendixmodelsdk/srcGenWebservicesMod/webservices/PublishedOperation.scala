package typings.mendixmodelsdk.srcGenWebservicesMod.webservices

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/webservices", "webservices.PublishedOperation")
@js.native
open class PublishedOperation protected () extends PublishedResource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  
  def entityExposedName: String = js.native
  
  /**
    * In version 9.0.2: deleted
    */
  def entityExposedNameByContract: String = js.native
  def entityExposedNameByContract_=(newValue: String): Unit = js.native
  
  def entityExposedName_=(newValue: String): Unit = js.native
  
  def image: IImage | Null = js.native
  
  def imageQualifiedName: String | Null = js.native
  
  def image_=(newValue: IImage | Null): Unit = js.native
  
  /**
    * In version 9.0.2: deleted
    */
  def isLockedByContract: Boolean = js.native
  def isLockedByContract_=(newValue: Boolean): Unit = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def operationReturnType: DataType = js.native
  def operationReturnType_=(newValue: DataType): Unit = js.native
  
  def parameters: IList[PublishedParameter] = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def returnType: String = js.native
  
  def returnTypeIsNillable: Boolean = js.native
  def returnTypeIsNillable_=(newValue: Boolean): Unit = js.native
  
  def returnTypeIsOptional: Boolean = js.native
  def returnTypeIsOptional_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.0.2: deleted
    */
  def returnTypeNameByContract: String = js.native
  def returnTypeNameByContract_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.0.2: deleted
    */
  def returnTypeSpecificationByContract: String = js.native
  def returnTypeSpecificationByContract_=(newValue: String): Unit = js.native
  
  def returnType_=(newValue: String): Unit = js.native
}
object PublishedOperation {
  
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.PublishedOperation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PublishedOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedOperation]
  
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * The new PublishedOperation will be automatically stored in the 'operations' property
    * of the parent VersionedService element passed as argument.
    */
  /* static member */
  inline def createIn(container: VersionedService): PublishedOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedOperation]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.PublishedOperation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/webservices", "webservices.PublishedOperation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
