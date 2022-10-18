package typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/entities relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.Entity")
@js.native
open class Entity protected ()
  extends typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Entity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Entity {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.Entity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Entity]
  
  /**
    * Creates and returns a new Entity instance in the SDK and on the server.
    * The new Entity will be automatically stored in the 'entities' property
    * of the parent DomainModel element passed as argument.
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DomainModel): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Entity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.Entity]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.Entity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.Entity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
