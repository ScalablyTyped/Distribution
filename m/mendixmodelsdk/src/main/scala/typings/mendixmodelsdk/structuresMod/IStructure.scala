package typings.mendixmodelsdk.structuresMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStructure extends js.Object {
  val container: IContainer | Null = js.native
  var id: String = js.native
  var isLoaded: Boolean = js.native
  var model: IAbstractModel = js.native
  var structureTypeName: String = js.native
  /**
    * Unit that owns/contains this thing.
    */
  var unit: IAbstractUnit = js.native
  def allProperties(): js.Array[AbstractProperty[_, _]] = js.native
  /**
    * Returns all properties when this structure is loaded, otherwise just the public properties.
    */
  def loadedProperties(): js.Array[AbstractProperty[_, _]] = js.native
  def publicProperties(): js.Array[AbstractProperty[_, _]] = js.native
  /**
    * Renders the structure as plain JSON (without observables magic).
    * This is intended for debugging and development convenience.
    * Note that the resulting object is not of the interface type corresponding to this structure.
    */
  def toJSON(): js.Object = js.native
  /**
    * Traverses this structure by calling the provided visitor function
    * on itself and all the structures contained (as part) by it,
    * in depth-first order, and it returns synchronously after that.
    */
  def traverse(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
  /**
    * Traverses this structure, returning immediately when `visit` returns something other than `null`.
    */
  def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | Null = js.native
  /**
    * Traverses this structure, only visiting children contained in public properties.
    */
  def traversePublicParts(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
}

object IStructure {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    id: String,
    isLoaded: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IAbstractModel,
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IStructure, Unit] => Unit,
    traverseFind: js.Function1[IStructure, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IStructure, Unit] => Unit,
    unit: IAbstractUnit
  ): IStructure = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), id = id.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructure]
  }
  @scala.inline
  implicit class IStructureOps[Self <: IStructure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = this.set("allProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("isLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadedProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = this.set("loadedProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setModel(value: IAbstractModel): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicProperties(value: () => js.Array[AbstractProperty[_, _]]): Self = this.set("publicProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setStructureTypeName(value: String): Self = this.set("structureTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Object): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setTraverse(value: js.Function1[IStructure, Unit] => Unit): Self = this.set("traverse", js.Any.fromFunction1(value))
    @scala.inline
    def setTraverseFind(value: js.Function1[IStructure, js.Any] => js.Any | Null): Self = this.set("traverseFind", js.Any.fromFunction1(value))
    @scala.inline
    def setTraversePublicParts(value: js.Function1[IStructure, Unit] => Unit): Self = this.set("traversePublicParts", js.Any.fromFunction1(value))
    @scala.inline
    def setUnit(value: IAbstractUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: IContainer): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerNull: Self = this.set("container", null)
  }
  
}

