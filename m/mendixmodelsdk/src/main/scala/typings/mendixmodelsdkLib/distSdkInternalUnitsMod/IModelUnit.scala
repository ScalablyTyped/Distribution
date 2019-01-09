package typings
package mendixmodelsdkLib.distSdkInternalUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- mendixmodelsdkLib.distSdkInternalElementsMod.IAbstractElement because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined load, load, load, load, asLoaded */ @js.native
trait IModelUnit extends IAbstractUnit {
  def asLoaded(): mendixmodelsdkLib.distSdkInternalElementsMod.IAbstractElement = js.native
  def delete(): scala.Unit = js.native
  def load(): js.Promise[mendixmodelsdkLib.distSdkInternalElementsMod.IAbstractElement] = js.native
  def load(callback: js.Function1[/* element */ this.type, scala.Unit]): scala.Unit = js.native
  def load(callback: js.Function1[/* element */ this.type, scala.Unit], forceRefresh: scala.Boolean): scala.Unit = js.native
  def load(forceRefresh: scala.Boolean): js.Promise[mendixmodelsdkLib.distSdkInternalElementsMod.IAbstractElement] = js.native
}

