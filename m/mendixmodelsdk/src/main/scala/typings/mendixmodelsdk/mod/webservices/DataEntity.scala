package typings.mendixmodelsdk.mod.webservices

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "webservices.DataEntity")
@js.native
open class DataEntity protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.webservices.DataEntity {
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
  
  @JSImport("mendixmodelsdk", "webservices.DataEntity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntity]
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  /* static member */
  inline def createInDataEntityBaseUnderChildMembers(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntityBase): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataEntityBaseUnderChildMembers")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntity]
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedParameter element passed as argument.
    */
  /* static member */
  inline def createInPublishedParameterUnderDataEntity(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedParameter): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedParameterUnderDataEntity")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntity]
  
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedResource element passed as argument.
    */
  /* static member */
  inline def createInPublishedResourceUnderDataEntity(container: typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedResource): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntity = ^.asInstanceOf[js.Dynamic].applyDynamic("createInPublishedResourceUnderDataEntity")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.DataEntity]
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.DataEntity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.DataEntity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
