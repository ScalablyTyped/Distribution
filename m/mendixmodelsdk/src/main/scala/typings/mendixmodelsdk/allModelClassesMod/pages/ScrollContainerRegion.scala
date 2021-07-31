package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ScrollContainerRegion")
@js.native
class ScrollContainerRegion protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ScrollContainerRegion {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ScrollContainerRegion")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'bottom' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInScrollContainerUnderBottom(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderBottom")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'center' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInScrollContainerUnderCenter(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderCenter")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'left' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInScrollContainerUnderLeft(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderLeft")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'right' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInScrollContainerUnderRight(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderRight")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion]
  
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'top' property
    * of the parent ScrollContainer element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInScrollContainerUnderTop(container: typings.mendixmodelsdk.pagesMod.pages.ScrollContainer): typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion = ^.asInstanceOf[js.Dynamic].applyDynamic("createInScrollContainerUnderTop")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ScrollContainerRegion.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ScrollContainerRegion.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
