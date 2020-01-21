package typings.mendixmodelsdk.allModelClassesMod.customwidgets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.pages.EntityWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.5.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource")
@js.native
class CustomWidgetXPathSource protected ()
  extends typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.CustomWidgetXPathSource")
@js.native
object CustomWidgetXPathSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent pages.EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInEntityWidgetUnderDataSource(container: EntityWidget): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
  /**
    * Creates and returns a new CustomWidgetXPathSource instance in the SDK and on the server.
    * The new CustomWidgetXPathSource will be automatically stored in the 'dataSource' property
    * of the parent WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue): typings.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidgetXPathSource = js.native
}

