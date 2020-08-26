package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.pagesMod.pages.ILayoutParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsLayout, name */ @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutParameter")
@js.native
class LayoutParameter protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsLayout")
  val containerAsLayout_FLayoutParameter: ILayout = js.native
  @JSName("model")
  var model_FLayoutParameter: IModel = js.native
  @JSName("name")
  val name_FLayoutParameter: String = js.native
  def containerAsLayout: Layout = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("qualifiedName")
  def qualifiedName_MLayoutParameter: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutParameter")
@js.native
object LayoutParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

