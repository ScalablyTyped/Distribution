package typings.mendixmodelsdk.mod.webservices

import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide8/published-app-services relevant section in reference guide}
  *
  * In version 9.0.2: deleted
  */
@JSImport("mendixmodelsdk", "webservices.PublishedAppService")
@js.native
open class PublishedAppService protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.webservices.PublishedAppService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object PublishedAppService {
  
  @JSImport("mendixmodelsdk", "webservices.PublishedAppService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PublishedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedAppService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenWebservicesMod.webservices.PublishedAppService]
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PublishedAppService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.PublishedAppService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
