package typings.mendixmodelsdk.distSdkInternalElementsMod

import typings.mendixmodelsdk.Anon_Copy
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import typings.mendixmodelsdk.distSdkInternalUnitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/elements", "Element")
@js.native
abstract class Element protected () extends AbstractElement {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var _deepCopyElement: js.Any = js.native
  @JSName("container")
  val container_Element: AbstractElement = js.native
  @JSName("unit")
  val unit_Element: ModelUnit = js.native
  /**
    * Creates a deep copy of this element and its children.
    */
  def deepCopy(targetModel: IAbstractModel): this.type = js.native
  /**
    * Creates a deep copy of this element and its children. Also returns a map from original to new IDs.
    */
  def deepCopyWithIdMap(targetModel: IAbstractModel): Anon_Copy = js.native
  /**
    * Detaches this element from the model, so that it can be attached in a different place.
    */
  def detach(): this.type = js.native
}

