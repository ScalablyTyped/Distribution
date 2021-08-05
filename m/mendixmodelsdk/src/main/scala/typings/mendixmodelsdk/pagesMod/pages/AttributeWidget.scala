package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget")
@js.native
abstract class AttributeWidget protected () extends MemberWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.13.0: introduced
    */
  def onChangeAction: ClientAction = js.native
  def onChangeAction_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def onChangeMicroflowSettings: MicroflowSettings = js.native
  def onChangeMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def onEnterAction: ClientAction = js.native
  def onEnterAction_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def onEnterMicroflowSettings: MicroflowSettings = js.native
  def onEnterMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def onLeaveAction: ClientAction = js.native
  def onLeaveAction_=(newValue: ClientAction): Unit = js.native
  
  /**
    * In version 7.13.0: deleted
    */
  def onLeaveMicroflowSettings: MicroflowSettings = js.native
  def onLeaveMicroflowSettings_=(newValue: MicroflowSettings): Unit = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def required: Boolean = js.native
  
  /**
    * In version 7.6.0: deleted
    */
  def requiredMessage: Text = js.native
  def requiredMessage_=(newValue: Text): Unit = js.native
  
  def required_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.8.0: introduced
    */
  def sourceVariable: PageVariable | Null = js.native
  def sourceVariable_=(newValue: PageVariable | Null): Unit = js.native
  
  /**
    * In version 7.6.0: introduced
    */
  def validation: WidgetValidation = js.native
  def validation_=(newValue: WidgetValidation): Unit = js.native
}
object AttributeWidget {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.AttributeWidget.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
