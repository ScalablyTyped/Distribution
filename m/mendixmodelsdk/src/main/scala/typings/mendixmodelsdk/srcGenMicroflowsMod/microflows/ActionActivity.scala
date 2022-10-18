package typings.mendixmodelsdk.srcGenMicroflowsMod.microflows

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ActionActivity")
@js.native
open class ActionActivity protected () extends Activity {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def action: MicroflowAction | Null = js.native
  def action_=(newValue: MicroflowAction | Null): Unit = js.native
  
  def autoGenerateCaption: Boolean = js.native
  def autoGenerateCaption_=(newValue: Boolean): Unit = js.native
  
  def backgroundColor: ActionActivityColor = js.native
  def backgroundColor_=(newValue: ActionActivityColor): Unit = js.native
  
  def caption: String = js.native
  def caption_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.12.0: introduced
    */
  def disabled: Boolean = js.native
  def disabled_=(newValue: Boolean): Unit = js.native
  
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
}
object ActionActivity {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ActionActivity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ActionActivity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): ActionActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ActionActivity]
  
  /**
    * Creates and returns a new ActionActivity instance in the SDK and on the server.
    * The new ActionActivity will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  /* static member */
  inline def createIn(container: MicroflowObjectCollection): ActionActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ActionActivity]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ActionActivity.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.ActionActivity.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
