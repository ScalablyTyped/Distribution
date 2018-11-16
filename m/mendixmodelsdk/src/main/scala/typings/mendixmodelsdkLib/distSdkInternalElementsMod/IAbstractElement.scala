package typings
package mendixmodelsdkLib.distSdkInternalElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstractElement
  extends mendixmodelsdkLib.distSdkInternalStructuresMod.IStructure {
  def asLoaded(): IAbstractElement = js.native
  def load(callback: js.Function1[/* element */ this.type, scala.Unit]): scala.Unit = js.native
  def load(callback: js.Function1[/* element */ this.type, scala.Unit], forceRefresh: scala.Boolean): scala.Unit = js.native
}

