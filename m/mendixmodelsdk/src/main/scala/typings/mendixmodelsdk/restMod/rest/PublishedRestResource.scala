package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-odata-resource relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedRestResource")
@js.native
open class PublishedRestResource protected () extends PublishedResource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 9.14.0: deleted
    * In version 9.9.0: introduced
    */
  def countMicroflow: IMicroflow | Null = js.native
  
  def countMicroflowQualifiedName: String | Null = js.native
  
  def countMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 9.11.0: deleted
    * In version 9.10.0: introduced
    */
  def deletable: Boolean = js.native
  def deletable_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def deleteMode: ChangeMode = js.native
  def deleteMode_=(newValue: ChangeMode): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.19.0: introduced
    */
  def exposedName: String = js.native
  def exposedName_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def insertMode: ChangeMode = js.native
  def insertMode_=(newValue: ChangeMode): Unit = js.native
  
  /**
    * In version 9.11.0: deleted
    * In version 9.10.0: introduced
    */
  def insertable: Boolean = js.native
  def insertable_=(newValue: Boolean): Unit = js.native
  
  def pageSize: Double = js.native
  def pageSize_=(newValue: Double): Unit = js.native
  
  def path: String = js.native
  def path_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.14.0: deleted
    * In version 9.9.0: introduced
    */
  def queryMicroflow: IMicroflow | Null = js.native
  
  def queryMicroflowQualifiedName: String | Null = js.native
  
  def queryMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 9.17.0: introduced
    */
  def queryOptions: QueryOptions = js.native
  def queryOptions_=(newValue: QueryOptions): Unit = js.native
  
  /**
    * In version 9.14.0: introduced
    */
  def readMode: ReadMode = js.native
  def readMode_=(newValue: ReadMode): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.11.0: deleted
    * In version 9.4.0: introduced
    */
  def updatable: Boolean = js.native
  def updatable_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 9.11.0: deleted
    * In version 9.9.0: introduced
    */
  def updateMicroflow: IMicroflow | Null = js.native
  
  def updateMicroflowQualifiedName: String | Null = js.native
  
  def updateMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 9.11.0: introduced
    */
  def updateMode: ChangeMode = js.native
  def updateMode_=(newValue: ChangeMode): Unit = js.native
  
  def usePaging: Boolean = js.native
  def usePaging_=(newValue: Boolean): Unit = js.native
}
object PublishedRestResource {
  
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedRestResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): PublishedRestResource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[PublishedRestResource]
  
  /**
    * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
    * The new PublishedRestResource will be automatically stored in the 'resources' property
    * of the parent PublishedODataService element passed as argument.
    */
  /* static member */
  inline def createIn(container: PublishedODataService): PublishedRestResource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[PublishedRestResource]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedRestResource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/rest", "rest.PublishedRestResource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
