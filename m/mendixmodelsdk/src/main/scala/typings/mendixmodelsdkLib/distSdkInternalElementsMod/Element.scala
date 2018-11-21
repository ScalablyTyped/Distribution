package typings
package mendixmodelsdkLib.distSdkInternalElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distSdkInternalElementsMod.IElement because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
@JSImport("mendixmodelsdk/dist/sdk/internal/elements", "Element")
@js.native
abstract class Element protected () extends AbstractElement {
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalUnitsMod.ModelUnit, container: AbstractElement) = this()
  var _deepCopyElement: js.Any = js.native
  @JSName("container")
  val container_Element: AbstractElement = js.native
  @JSName("unit")
  val unit_Element: mendixmodelsdkLib.distSdkInternalUnitsMod.ModelUnit = js.native
  /**
       * Creates a deep copy of this element and its children.
       */
  def deepCopy(targetModel: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel): this.type = js.native
  /**
       * Detaches this element from the model, so that it can be attached in a different place.
       */
  def detach(): this.type = js.native
}

