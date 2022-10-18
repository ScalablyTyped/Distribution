package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.18.0: deleted
  */
@JSImport("mendixmodelsdk/src/gen/pages", "pages.OnClickMicroflow")
@js.native
open class OnClickMicroflow protected () extends OnClickBehavior {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def microflowSettings: MicroflowSettings = js.native
  def microflowSettings_=(newValue: MicroflowSettings): Unit = js.native
}
object OnClickMicroflow {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.OnClickMicroflow")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new OnClickMicroflow instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): OnClickMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[OnClickMicroflow]
  
  /**
    * Creates and returns a new OnClickMicroflow instance in the SDK and on the server.
    * The new OnClickMicroflow will be automatically stored in the 'onClickBehavior' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  /* static member */
  inline def createIn(container: DynamicImageViewer): OnClickMicroflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[OnClickMicroflow]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.OnClickMicroflow.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.OnClickMicroflow.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
