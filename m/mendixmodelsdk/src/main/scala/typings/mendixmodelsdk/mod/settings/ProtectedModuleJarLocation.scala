package typings.mendixmodelsdk.mod.settings

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 9.10.0: introduced
  */
@JSImport("mendixmodelsdk", "settings.ProtectedModuleJarLocation")
@js.native
open class ProtectedModuleJarLocation protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.settings.ProtectedModuleJarLocation {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ProtectedModuleJarLocation {
  
  @JSImport("mendixmodelsdk", "settings.ProtectedModuleJarLocation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ProtectedModuleJarLocation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenSettingsMod.settings.ProtectedModuleJarLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenSettingsMod.settings.ProtectedModuleJarLocation]
  
  /**
    * Creates and returns a new ProtectedModuleJarLocation instance in the SDK and on the server.
    * The new ProtectedModuleJarLocation will be automatically stored in the 'exclusions' property
    * of the parent JarDeploymentSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  9.10.0 and higher
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.srcGenSettingsMod.settings.JarDeploymentSettings): typings.mendixmodelsdk.srcGenSettingsMod.settings.ProtectedModuleJarLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenSettingsMod.settings.ProtectedModuleJarLocation]
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.ProtectedModuleJarLocation.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.ProtectedModuleJarLocation.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
