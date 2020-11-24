package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.ImageViewerSource")
@js.native
class ImageViewerSource protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.ImageViewerSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "pages.ImageViewerSource")
@js.native
object ImageViewerSource extends js.Object {
  
  /**
    * Creates and returns a new ImageViewerSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.ImageViewerSource = js.native
  
  /**
    * Creates and returns a new ImageViewerSource instance in the SDK and on the server.
    * The new ImageViewerSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.EntityWidget): typings.mendixmodelsdk.pagesMod.pages.ImageViewerSource = js.native
  
  /**
    * Creates and returns a new ImageViewerSource instance in the SDK and on the server.
    * The new ImageViewerSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  def createInEntityWidgetUnderDataSource(container: typings.mendixmodelsdk.pagesMod.pages.EntityWidget): typings.mendixmodelsdk.pagesMod.pages.ImageViewerSource = js.native
  
  /**
    * Creates and returns a new ImageViewerSource instance in the SDK and on the server.
    * The new ImageViewerSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): typings.mendixmodelsdk.pagesMod.pages.ImageViewerSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
