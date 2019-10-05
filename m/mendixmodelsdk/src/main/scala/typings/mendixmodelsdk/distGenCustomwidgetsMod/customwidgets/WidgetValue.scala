package typings.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCustomwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.EntityRef
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientAction
import typings.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate
import typings.mendixmodelsdk.distGenPagesMod.pages.IPage
import typings.mendixmodelsdk.distGenPagesMod.pages.Icon
import typings.mendixmodelsdk.distGenPagesMod.pages.Widget
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetValue")
@js.native
class WidgetValue protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 7.19.0: introduced
    */
  var action: ClientAction = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  var attributePath: String = js.native
  /**
    * In version 7.11.0: introduced
    */
  var attributeRef: AttributeRef | Null = js.native
  val containerAsWidgetProperty: WidgetProperty = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyEntityPath.
    *
    * In version 7.11.0: deleted
    */
  var entityPath: String = js.native
  /**
    * In version 7.11.0: introduced
    */
  var entityRef: EntityRef | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.0.0: introduced
    */
  var expression: String = js.native
  /**
    * In version 8.0.0: introduced
    */
  var icon: Icon | Null = js.native
  var image: IImage | Null = js.native
  val imageQualifiedName: String | Null = js.native
  var microflow: IMicroflow | Null = js.native
  val microflowQualifiedName: String | Null = js.native
  @JSName("model")
  var model_WidgetValue: IModel = js.native
  /**
    * In version 7.13.0: introduced
    */
  var nanoflow: INanoflow | Null = js.native
  val nanoflowQualifiedName: String | Null = js.native
  val objects: IList[WidgetObject] = js.native
  var page: IPage | Null = js.native
  val pageQualifiedName: String | Null = js.native
  var primitiveValue: String = js.native
  /**
    * In version 7.23.0: introduced
    */
  var textTemplate: ClientTemplate | Null = js.native
  var translatableValue: Text | Null = js.native
  var `type`: WidgetValueType = js.native
  /**
    * In version 8.2.0: introduced
    */
  val widgets: IList[Widget] = js.native
  /**
    * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
    */
  var xPathConstraint: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/customwidgets", "customwidgets.WidgetValue")
@js.native
object WidgetValue extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
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
}

