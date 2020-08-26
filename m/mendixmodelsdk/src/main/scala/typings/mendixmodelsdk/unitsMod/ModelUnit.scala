package typings.mendixmodelsdk.unitsMod

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.elementsMod.AbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly
- typings.mendixmodelsdk.unitsMod.IModelUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "ModelUnit")
@js.native
abstract class ModelUnit protected () extends AbstractElement {
  def this(model: AbstractModel, structureTypeName: String, id: String, isPartial: Boolean) = this()
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  @JSName("container")
  val container_FModelUnit: StructuralUnit = js.native
  /**
    * Whether this unit and all of its children (recursively) can be loaded.
    */
  @JSName("isLoadable")
  val isLoadable_FModelUnit: Boolean = js.native
  /**
    * Whether this unit and all of its children (recursively) are editable.
    */
  @JSName("isReadOnly")
  val isReadOnly_FModelUnit: Boolean = js.native
  def isLoadable: Boolean = js.native
  @JSName("isLoaded")
  def isLoaded_MModelUnit: Boolean = js.native
  def isReadOnly: Boolean = js.native
  @JSName("unit")
  def unit_MModelUnit: this.type = js.native
}

