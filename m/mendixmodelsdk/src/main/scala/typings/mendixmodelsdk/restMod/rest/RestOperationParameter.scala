package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.11.0: removed experimental
  * In version 7.8.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter")
@js.native
class RestOperationParameter protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsPublishedRestService: PublishedRestService = js.native
  
  def containerAsPublishedRestServiceOperation: PublishedRestServiceOperation = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def dataType: String = js.native
  def dataType_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def microflowParameter: IMicroflowParameter | Null = js.native
  
  def microflowParameterQualifiedName: String | Null = js.native
  
  def microflowParameter_=(newValue: IMicroflowParameter | Null): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def parameterType: RestOperationParameterType = js.native
  def parameterType_=(newValue: RestOperationParameterType): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def `type`: DataType = js.native
  def type_=(newValue: DataType): Unit = js.native
}
object RestOperationParameter {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter.create")
  @js.native
  def create(model: IModel): RestOperationParameter = js.native
  
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * The new RestOperationParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedRestServiceOperation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter.createInPublishedRestServiceOperationUnderParameters")
  @js.native
  def createInPublishedRestServiceOperationUnderParameters(container: PublishedRestServiceOperation): RestOperationParameter = js.native
  
  /**
    * Creates and returns a new RestOperationParameter instance in the SDK and on the server.
    * The new RestOperationParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedRestService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter.createInPublishedRestServiceUnderParameters")
  @js.native
  def createInPublishedRestServiceUnderParameters(container: PublishedRestService): RestOperationParameter = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.RestOperationParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
