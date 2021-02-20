package typings.mendixmodelsdk.allModelClassesMod.webservices

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity")
@js.native
class DataEntity protected ()
  extends typings.mendixmodelsdk.webservicesMod.webservices.DataEntity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DataEntity {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity.createInDataEntityBaseUnderChildMembers")
  @js.native
  def createInDataEntityBaseUnderChildMembers(container: typings.mendixmodelsdk.webservicesMod.webservices.DataEntityBase): typings.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedParameter element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity.createInPublishedParameterUnderDataEntity")
  @js.native
  def createInPublishedParameterUnderDataEntity(container: typings.mendixmodelsdk.webservicesMod.webservices.PublishedParameter): typings.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedResource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity.createInPublishedResourceUnderDataEntity")
  @js.native
  def createInPublishedResourceUnderDataEntity(container: typings.mendixmodelsdk.webservicesMod.webservices.PublishedResource): typings.mendixmodelsdk.webservicesMod.webservices.DataEntity = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.DataEntity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
