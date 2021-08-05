package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings")
@js.native
class ConditionalEditabilitySettings protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.ConditionalEditabilitySettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConditionalEditabilitySettings {
  
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings]
  
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent ConditionallyEditableWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.0.0
    */
  /* static member */
  inline def createIn(container: typings.mendixmodelsdk.pagesMod.pages.ConditionallyEditableWidget): typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings]
  
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent ConditionallyEditableWidget element passed as argument.
    */
  /* static member */
  inline def createInConditionallyEditableWidgetUnderConditionalEditabilitySettings(container: typings.mendixmodelsdk.pagesMod.pages.ConditionallyEditableWidget): typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInConditionallyEditableWidgetUnderConditionalEditabilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings]
  
  /**
    * Creates and returns a new ConditionalEditabilitySettings instance in the SDK and on the server.
    * The new ConditionalEditabilitySettings will be automatically stored in the 'conditionalEditabilitySettings' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  inline def createInCustomWidgetUnderConditionalEditabilitySettings(container: CustomWidget): typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCustomWidgetUnderConditionalEditabilitySettings")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ConditionalEditabilitySettings]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ConditionalEditabilitySettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
