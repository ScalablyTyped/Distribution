package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo")
@js.native
class ConfirmationInfo protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def cancelButtonCaption: Text = js.native
  def cancelButtonCaption_=(newValue: Text): Unit = js.native
  
  def containerAsCallNanoflowClientAction: CallNanoflowClientAction = js.native
  
  def containerAsMicroflowSettings: MicroflowSettings = js.native
  
  def proceedButtonCaption: Text = js.native
  def proceedButtonCaption_=(newValue: Text): Unit = js.native
  
  def question: Text = js.native
  def question_=(newValue: Text): Unit = js.native
}
object ConfirmationInfo {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.7.0
    */
  /* static member */
  @scala.inline
  def createIn(container: MicroflowSettings): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent CallNanoflowClientAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  /* static member */
  @scala.inline
  def createInCallNanoflowClientActionUnderConfirmationInfo(container: CallNanoflowClientAction): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInCallNanoflowClientActionUnderConfirmationInfo")(container.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /**
    * Creates and returns a new ConfirmationInfo instance in the SDK and on the server.
    * The new ConfirmationInfo will be automatically stored in the 'confirmationInfo' property
    * of the parent MicroflowSettings element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInMicroflowSettingsUnderConfirmationInfo(container: MicroflowSettings): ConfirmationInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMicroflowSettingsUnderConfirmationInfo")(container.asInstanceOf[js.Any]).asInstanceOf[ConfirmationInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ConfirmationInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
