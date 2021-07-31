package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.pagesMod.pages.ILayoutContent because Already inherited
- typings.mendixmodelsdk.pagesMod.pages.IWebLayoutContent because var conflicts: containerAsLayout, id, isLoaded, model, structureTypeName, unit. Inlined layoutType, layoutCall */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WebLayoutContent")
@js.native
class WebLayoutContent protected () extends LayoutContent {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsLayout")
  def containerAsLayout_MWebLayoutContent: Layout = js.native
  
  def layoutCall: LayoutCall | Null = js.native
  def layoutCall_=(newValue: LayoutCall | Null): Unit = js.native
  @JSName("layoutCall")
  val layoutCall_FWebLayoutContent: ILayoutCall | Null = js.native
  
  def layoutType: LayoutType = js.native
  def layoutType_=(newValue: LayoutType): Unit = js.native
  @JSName("layoutType")
  val layoutType_FWebLayoutContent: LayoutType = js.native
  
  def widgets: IList[Widget] = js.native
}
object WebLayoutContent {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WebLayoutContent")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new WebLayoutContent instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): WebLayoutContent = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[WebLayoutContent]
  
  /**
    * Creates and returns a new WebLayoutContent instance in the SDK and on the server.
    * The new WebLayoutContent will be automatically stored in the 'content' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @scala.inline
  def createIn(container: Layout): WebLayoutContent = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[WebLayoutContent]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WebLayoutContent.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.WebLayoutContent.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
