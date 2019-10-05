package typings.mendixmodelsdk.distSdkInternalElementsMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined load, load, load, load, asLoaded */ @JSImport("mendixmodelsdk/dist/sdk/internal/elements", "AbstractElement")
@js.native
abstract class AbstractElement protected ()
  extends Structure
     with Container {
  def this(model: AbstractModel, structureTypeName: String, id: String, isPartial: Boolean) = this()
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IContainer
  ) = this()
  @JSName("container")
  val container_AbstractElement: Container = js.native
  /**
    * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
    * (Those are technically already the same, but this function makes sure its properties are available.)
    *
    * - If invoked without callback, it checks whether the properties are available or it will throw;
    * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
    */
  def asLoaded(): this.type = js.native
  @JSName("asLoaded")
  def asLoaded_IAbstractElement(): IAbstractElement = js.native
  /**
    * Given an element id, returns the element in this abstract element with that id, otherwise null.
    */
  def findElementById(id: String): AbstractElement | Null = js.native
  def load(): js.Promise[this.type] = js.native
  /**
    * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
    * (Those are technically already the same, but this function makes sure its properties are available.)
    *
    * - If invoked without callback, it checks whether the properties are available or it will throw;
    * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
    */
  def load(callback: js.Function1[/* elem */ /* element */ this.type, Unit]): Unit = js.native
  def load(callback: js.Function1[/* elem */ /* element */ this.type, Unit], forceRefresh: Boolean): Unit = js.native
  def load(forceRefresh: Boolean): js.Promise[this.type] = js.native
}

