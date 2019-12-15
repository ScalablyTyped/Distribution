package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.17.0: added public
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenPagesMod.pages.ILayoutCall because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsLayout, containerAsPage, containerAsPageTemplate, containerAsWebLayoutContent, layout, layoutQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall")
@js.native
class LayoutCall protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsLayout")
  val containerAsLayout_FLayoutCall: ILayout = js.native
  @JSName("containerAsPageTemplate")
  val containerAsPageTemplate_FLayoutCall: IPageTemplate = js.native
  @JSName("containerAsPage")
  val containerAsPage_FLayoutCall: IPage = js.native
  @JSName("containerAsWebLayoutContent")
  val containerAsWebLayoutContent_FLayoutCall: IWebLayoutContent = js.native
  @JSName("layoutQualifiedName")
  val layoutQualifiedName_FLayoutCall: String | Null = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 8.0.0: removed optional
    * In version 7.17.0: added public
    */
  @JSName("layout")
  val layout_FLayoutCall: ILayout | Null = js.native
  @JSName("model")
  var model_FLayoutCall: IModel = js.native
  def arguments(): IList[LayoutCallArgument] = js.native
  def containerAsLayout(): Layout = js.native
  def containerAsPage(): Page = js.native
  def containerAsPageTemplate(): PageTemplate = js.native
  def containerAsWebLayoutContent(): WebLayoutContent = js.native
  /**
    * In version 8.0.0: removed optional
    * In version 7.17.0: added public
    */
  def layout(): ILayout | Null = js.native
  def layout(newValue: ILayout): js.Any = js.native
  def layoutQualifiedName(): String | Null = js.native
  @JSName("layout")
  def layout_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutCall")
@js.native
object LayoutCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): LayoutCall = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.23.0
    */
  def createInLayoutUnderLayoutCall(container: Layout): LayoutCall = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.7.0 and higher
    */
  def createInPageTemplateUnderLayoutCall(container: PageTemplate): LayoutCall = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent Page element passed as argument.
    */
  def createInPageUnderLayoutCall(container: Page): LayoutCall = js.native
  /**
    * Creates and returns a new LayoutCall instance in the SDK and on the server.
    * The new LayoutCall will be automatically stored in the 'layoutCall' property
    * of the parent WebLayoutContent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWebLayoutContentUnderLayoutCall(container: WebLayoutContent): LayoutCall = js.native
}

