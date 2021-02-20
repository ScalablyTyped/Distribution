package typings.mendixmodelsdk.mod.webservices

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/consumed-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "webservices.ImportedWebService")
@js.native
class ImportedWebService protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.webservices.ImportedWebService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object ImportedWebService {
  
  @JSImport("mendixmodelsdk", "webservices.ImportedWebService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ImportedWebService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.ImportedWebService.createIn")
  @js.native
  def createIn(container: IFolderBase): typings.mendixmodelsdk.webservicesMod.webservices.ImportedWebService = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.ImportedWebService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.ImportedWebService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
