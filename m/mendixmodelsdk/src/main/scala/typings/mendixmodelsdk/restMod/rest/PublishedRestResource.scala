package typings.mendixmodelsdk.restMod.rest

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.restMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.webservices.PublishedResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/published-odata-resource relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestResource")
@js.native
class PublishedRestResource protected () extends PublishedResource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
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
  
  def pageSize: Double = js.native
  def pageSize_=(newValue: Double): Unit = js.native
  
  def path: String = js.native
  def path_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
  
  def usePaging: Boolean = js.native
  def usePaging_=(newValue: Boolean): Unit = js.native
}
object PublishedRestResource {
  
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestResource.create")
  @js.native
  def create(model: IModel): PublishedRestResource = js.native
  
  /**
    * Creates and returns a new PublishedRestResource instance in the SDK and on the server.
    * The new PublishedRestResource will be automatically stored in the 'resources' property
    * of the parent PublishedODataService element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestResource.createIn")
  @js.native
  def createIn(container: PublishedODataService): PublishedRestResource = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestResource.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/rest", "rest.PublishedRestResource.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
