package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandling")
@js.native
open class ResultHandling protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsImportXmlAction: ImportXmlAction = js.native
  
  def containerAsRestCallAction: RestCallAction = js.native
  
  def containerAsWebServiceCallAction: WebServiceCallAction = js.native
  
  def importMappingCall: ImportMappingCall | Null = js.native
  def importMappingCall_=(newValue: ImportMappingCall | Null): Unit = js.native
  
  def outputVariableName: String = js.native
  def outputVariableName_=(newValue: String): Unit = js.native
  
  def storeInVariable: Boolean = js.native
  def storeInVariable_=(newValue: Boolean): Unit = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    * In version 6.10.0: introduced
    */
  def variableDataType: String = js.native
  def variableDataType_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.9.0: introduced
    */
  def variableType: DataType = js.native
  def variableType_=(newValue: DataType): Unit = js.native
}
object ResultHandling {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandling")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ResultHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ResultHandling]
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent ImportXmlAction element passed as argument.
    */
  /* static member */
  inline def createInImportXmlActionUnderResultHandling(container: ImportXmlAction): ResultHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImportXmlActionUnderResultHandling")(container.asInstanceOf[js.Any]).asInstanceOf[ResultHandling]
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  /* static member */
  inline def createInRestCallActionUnderResultHandling(container: RestCallAction): ResultHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInRestCallActionUnderResultHandling")(container.asInstanceOf[js.Any]).asInstanceOf[ResultHandling]
  
  /**
    * Creates and returns a new ResultHandling instance in the SDK and on the server.
    * The new ResultHandling will be automatically stored in the 'resultHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  /* static member */
  inline def createInWebServiceCallActionUnderResultHandling(container: WebServiceCallAction): ResultHandling = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWebServiceCallActionUnderResultHandling")(container.asInstanceOf[js.Any]).asInstanceOf[ResultHandling]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandling.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ResultHandling.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
