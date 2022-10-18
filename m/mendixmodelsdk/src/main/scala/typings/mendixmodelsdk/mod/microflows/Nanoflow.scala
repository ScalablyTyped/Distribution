package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/nanoflows relevant section in reference guide}
  *
  * In version 7.12.0: removed experimental
  * In version 7.10.0: introduced
  */
@JSImport("mendixmodelsdk", "microflows.Nanoflow")
@js.native
open class Nanoflow protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.microflows.Nanoflow {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object Nanoflow {
  
  @JSImport("mendixmodelsdk", "microflows.Nanoflow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Nanoflow unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.Nanoflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.Nanoflow]
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.Nanoflow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.Nanoflow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
