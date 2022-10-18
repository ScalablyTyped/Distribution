package typings.mendixmodelsdk.srcGenAllModelClassesMod.domainmodels

import typings.mendixmodelsdk.srcGenDomainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IModule
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/domain-model relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.DomainModel")
@js.native
open class DomainModel protected ()
  extends typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DomainModel {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
}
object DomainModel {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.DomainModel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DomainModel unit in the SDK and on the server.
    * Expects one argument, the projects.IModule in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IModule): typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DomainModel = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.DomainModel]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.DomainModel.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "domainmodels.DomainModel.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
