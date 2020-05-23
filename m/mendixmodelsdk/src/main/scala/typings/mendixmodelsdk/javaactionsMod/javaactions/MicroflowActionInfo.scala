package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.10.0: removed experimental
  * In version 6.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IMicroflowActionInfo because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsJavaAction, caption, category, icon, iconQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.MicroflowActionInfo")
@js.native
class MicroflowActionInfo protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("caption")
  val caption_FMicroflowActionInfo: String = js.native
  @JSName("category")
  val category_FMicroflowActionInfo: String = js.native
  @JSName("containerAsJavaAction")
  val containerAsJavaAction_FMicroflowActionInfo: IJavaAction = js.native
  @JSName("iconQualifiedName")
  val iconQualifiedName_FMicroflowActionInfo: String | Null = js.native
  @JSName("icon")
  val icon_FMicroflowActionInfo: IImage | Null = js.native
  @JSName("model")
  var model_FMicroflowActionInfo: IModel = js.native
  def caption: String = js.native
  def caption(newValue: String): js.Any = js.native
  def category: String = js.native
  def category(newValue: String): js.Any = js.native
  def containerAsJavaAction: JavaAction = js.native
  def icon(): js.Any = js.native
  def icon(newValue: IImage): js.Any = js.native
  def iconQualifiedName: String | Null = js.native
  @JSName("icon")
  def icon_Union: IImage | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.MicroflowActionInfo")
@js.native
object MicroflowActionInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MicroflowActionInfo = js.native
  /**
    * Creates and returns a new MicroflowActionInfo instance in the SDK and on the server.
    * The new MicroflowActionInfo will be automatically stored in the 'microflowActionInfo' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createIn(container: JavaAction): MicroflowActionInfo = js.native
}

