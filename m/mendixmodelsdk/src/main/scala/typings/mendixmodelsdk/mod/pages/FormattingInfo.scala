package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.FormattingInfo")
@js.native
class FormattingInfo protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.FormattingInfo {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object FormattingInfo {
  
  @JSImport("mendixmodelsdk", "pages.FormattingInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @scala.inline
  def createInClientTemplateParameterUnderFormattingInfo(container: typings.mendixmodelsdk.pagesMod.pages.ClientTemplateParameter): typings.mendixmodelsdk.pagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInClientTemplateParameterUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): typings.mendixmodelsdk.pagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInDatePickerUnderFormattingInfo(container: typings.mendixmodelsdk.pagesMod.pages.DatePicker): typings.mendixmodelsdk.pagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatePickerUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): typings.mendixmodelsdk.pagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicLabelUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInGridColumnUnderFormattingInfo(container: typings.mendixmodelsdk.pagesMod.pages.GridColumn): typings.mendixmodelsdk.pagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridColumnUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInReferenceSelectorUnderFormattingInfo(container: typings.mendixmodelsdk.pagesMod.pages.ReferenceSelector): typings.mendixmodelsdk.pagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInReferenceSelectorUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.FormattingInfo]
  
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInTextBoxUnderFormattingInfo(container: typings.mendixmodelsdk.pagesMod.pages.TextBox): typings.mendixmodelsdk.pagesMod.pages.FormattingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTextBoxUnderFormattingInfo")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.FormattingInfo]
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.FormattingInfo.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
