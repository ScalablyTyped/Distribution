package typings
package mendixmodelsdkLib.distSdkInternalElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distSdkInternalElementsMod.IAbstractElement because Would inherit conflicting mutable fields List(model, structureTypeName, id, unit, isLoaded))*/
@JSImport("mendixmodelsdk/dist/sdk/internal/elements", "AbstractElement")
@js.native
abstract class AbstractElement protected ()
  extends mendixmodelsdkLib.distSdkInternalStructuresMod.Structure {
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean) = this()
  def this(model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.IContainer) = this()
  @JSName("container")
  val container_AbstractElement: mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.Container = js.native
  /**
       * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
       * (Those are technically already the same, but this function makes sure its properties are available.)
       *
       * - If invoked without callback, it checks whether the properties are available or it will throw;
       * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
       */
  def asLoaded(): this.type = js.native
  /**
       * Given an element id, returns the element in this abstract element with that id, otherwise null.
       */
  def findElementById(id: java.lang.String): AbstractElement | scala.Null = js.native
  def load(): js.Promise[this.type] = js.native
  /**
       * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
       * (Those are technically already the same, but this function makes sure its properties are available.)
       *
       * - If invoked without callback, it checks whether the properties are available or it will throw;
       * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
       */
  def load(callback: js.Function1[/* elem */ this.type, scala.Unit]): scala.Unit = js.native
  /**
       * Transforms a IElement interface into a Element class, loading the containing unit if necessary.
       * (Those are technically already the same, but this function makes sure its properties are available.)
       *
       * - If invoked without callback, it checks whether the properties are available or it will throw;
       * - If invoked with callback, it will load the data from the server if needed, and then invoke the callback.
       */
  def load(callback: js.Function1[/* elem */ this.type, scala.Unit], forceRefresh: scala.Boolean): scala.Unit = js.native
  def load(forceRefresh: scala.Boolean): js.Promise[this.type] = js.native
}

