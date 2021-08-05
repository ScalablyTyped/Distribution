package typings.mendixmodelsdk.mod.javaactions

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/java-actions relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "javaactions.JavaAction")
@js.native
class JavaAction protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.javaactions.JavaAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}
object JavaAction {
  
  @JSImport("mendixmodelsdk", "javaactions.JavaAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new JavaAction unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IFolderBase): typings.mendixmodelsdk.javaactionsMod.javaactions.JavaAction = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.javaactionsMod.javaactions.JavaAction]
  
  /* static member */
  @JSImport("mendixmodelsdk", "javaactions.JavaAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "javaactions.JavaAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
