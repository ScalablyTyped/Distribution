package typings.mendixmodelsdk.customwidgetsMod.customwidgets

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.pagesMod.pages.ClientAction
import typings.mendixmodelsdk.pagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.pagesMod.pages.DataSource
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.pagesMod.pages.Icon
import typings.mendixmodelsdk.pagesMod.pages.PageVariable
import typings.mendixmodelsdk.pagesMod.pages.Widget
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetValue")
@js.native
class WidgetValue protected () extends Element[IModel] {
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
/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetValue")
@js.native
object WidgetValue extends js.Object {
  
  /**
    * Creates and returns a new WidgetValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetValue = js.native
  
  /**
    * Creates and returns a new WidgetValue instance in the SDK and on the server.
    * The new WidgetValue will be automatically stored in the 'value' property
    * of the parent WidgetProperty element passed as argument.
    */
  def createIn(container: WidgetProperty): WidgetValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
