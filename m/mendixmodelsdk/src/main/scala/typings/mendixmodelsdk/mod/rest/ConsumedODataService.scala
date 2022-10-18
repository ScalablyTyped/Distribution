package typings.mendixmodelsdk.mod.rest

import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/consumed-odata-service-properties relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.18.0: introduced
  */
@JSImport("mendixmodelsdk", "rest.ConsumedODataService")
@js.native
open class ConsumedODataService protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.rest.ConsumedODataService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object ConsumedODataService {
  
  @JSImport("mendixmodelsdk", "rest.ConsumedODataService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsumedODataService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenRestMod.rest.ConsumedODataService]
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.ConsumedODataService.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "rest.ConsumedODataService.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
