package typings.mendixmodelsdk.srcGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.srcGenPagesMod.pages.ClientAction
import typings.mendixmodelsdk.srcGenPagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.srcGenPagesMod.pages.DataSource
import typings.mendixmodelsdk.srcGenPagesMod.pages.IPage
import typings.mendixmodelsdk.srcGenPagesMod.pages.Icon
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageVariable
import typings.mendixmodelsdk.srcGenPagesMod.pages.Widget
import typings.mendixmodelsdk.srcGenTextsMod.texts.Text
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValue")
@js.native
open class WidgetValue protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 7.19.0: introduced
    */
  def action: ClientAction = js.native
  def action_=(newValue: ClientAction): Unit = js.native
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath: String = js.native
  def attributePath_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef: AttributeRef | Null = js.native
  def attributeRef_=(newValue: AttributeRef | Null): Unit = js.native
  
  def containerAsWidgetProperty: WidgetProperty = js.native
  
  /**
    * In version 8.3.0: introduced
    */
  def dataSource: DataSource | Null = js.native
  def dataSource_=(newValue: DataSource | Null): Unit = js.native
  
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  def entityPath: String = js.native
  def entityPath_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def entityRef: EntityRef | Null = js.native
  def entityRef_=(newValue: EntityRef | Null): Unit = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.0.0: introduced
    */
  def expression: String = js.native
  def expression_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: introduced
    */
  def icon: Icon | Null = js.native
  def icon_=(newValue: Icon | Null): Unit = js.native
  
  def image: IImage | Null = js.native
  
  def imageQualifiedName: String | Null = js.native
  
  def image_=(newValue: IImage | Null): Unit = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 7.13.0: introduced
    */
  def nanoflow: INanoflow | Null = js.native
  
  def nanoflowQualifiedName: String | Null = js.native
  
  def nanoflow_=(newValue: INanoflow | Null): Unit = js.native
  
  def objects: IList[WidgetObject] = js.native
  
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
  
  def primitiveValue: String = js.native
  def primitiveValue_=(newValue: String): Unit = js.native
  
  /**
    * In version 9.23.0: introduced
    */
  def selection: CustomWidgetSelectionType = js.native
  def selection_=(newValue: CustomWidgetSelectionType): Unit = js.native
  
  /**
    * In version 8.8.0: introduced
    */
  def sourceVariable: PageVariable | Null = js.native
  def sourceVariable_=(newValue: PageVariable | Null): Unit = js.native
  
  /**
    * In version 7.23.0: introduced
    */
  def textTemplate: ClientTemplate | Null = js.native
  def textTemplate_=(newValue: ClientTemplate | Null): Unit = js.native
  
  def translatableValue: Text | Null = js.native
  def translatableValue_=(newValue: Text | Null): Unit = js.native
  
  def `type`: WidgetValueType = js.native
  def type_=(newValue: WidgetValueType): Unit = js.native
  
  /**
    * In version 8.2.0: introduced
    */
  def widgets: IList[Widget] = js.native
  
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  def xPathConstraint: String = js.native
  def xPathConstraint_=(newValue: String): Unit = js.native
}
object WidgetValue {
  
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WidgetValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): WidgetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WidgetValue]
  
  /**
    * Creates and returns a new WidgetValue instance in the SDK and on the server.
    * The new WidgetValue will be automatically stored in the 'value' property
    * of the parent WidgetProperty element passed as argument.
    */
  /* static member */
  inline def createIn(container: WidgetProperty): WidgetValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WidgetValue]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/customwidgets", "customwidgets.WidgetValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
