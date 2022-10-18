package typings.mendixmodelsdk.srcGenSettingsMod.settings

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.ActionActivityColor
import typings.mendixmodelsdk.srcGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Settings`.
  */
/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/src/gen/settings", "settings.ActionActivityDefaultColor")
@js.native
open class ActionActivityDefaultColor protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def actionActivityType: String = js.native
  def actionActivityType_=(newValue: String): Unit = js.native
  
  def backgroundColor: ActionActivityColor = js.native
  def backgroundColor_=(newValue: ActionActivityColor): Unit = js.native
  
  def containerAsModelerSettings: ModelerSettings = js.native
}
object ActionActivityDefaultColor {
  
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ActionActivityDefaultColor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ActionActivityDefaultColor instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ActionActivityDefaultColor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ActionActivityDefaultColor]
  
  /**
    * Creates and returns a new ActionActivityDefaultColor instance in the SDK and on the server.
    * The new ActionActivityDefaultColor will be automatically stored in the 'actionActivityDefaultColors' property
    * of the parent ModelerSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  inline def createIn(container: ModelerSettings): ActionActivityDefaultColor = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ActionActivityDefaultColor]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ActionActivityDefaultColor.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/settings", "settings.ActionActivityDefaultColor.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
