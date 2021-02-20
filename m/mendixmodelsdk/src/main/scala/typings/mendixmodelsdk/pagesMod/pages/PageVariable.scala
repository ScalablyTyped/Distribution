package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.4.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable")
@js.native
class PageVariable protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsAttributeWidget: AttributeWidget = js.native
  
  def containerAsMicroflowParameterMapping: MicroflowParameterMapping = js.native
  
  def containerAsNanoflowParameterMapping: NanoflowParameterMapping = js.native
  
  def containerAsWidgetValue: WidgetValue = js.native
  
  def useAllPages: Boolean = js.native
  def useAllPages_=(newValue: Boolean): Unit = js.native
  
  def widget: Widget | Null = js.native
  
  def widgetLocalName: String | Null = js.native
  
  def widget_=(newValue: Widget | Null): Unit = js.native
}
object PageVariable {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable.create")
  @js.native
  def create(model: IModel): PageVariable = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable.createInAttributeWidgetUnderSourceVariable")
  @js.native
  def createInAttributeWidgetUnderSourceVariable(container: AttributeWidget): PageVariable = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent MicroflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable.createInMicroflowParameterMappingUnderVariable")
  @js.native
  def createInMicroflowParameterMappingUnderVariable(container: MicroflowParameterMapping): PageVariable = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'variable' property
    * of the parent NanoflowParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.4.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable.createInNanoflowParameterMappingUnderVariable")
  @js.native
  def createInNanoflowParameterMappingUnderVariable(container: NanoflowParameterMapping): PageVariable = js.native
  
  /**
    * Creates and returns a new PageVariable instance in the SDK and on the server.
    * The new PageVariable will be automatically stored in the 'sourceVariable' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.8.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable.createInWidgetValueUnderSourceVariable")
  @js.native
  def createInWidgetValueUnderSourceVariable(container: WidgetValue): PageVariable = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageVariable.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
