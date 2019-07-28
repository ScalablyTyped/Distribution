package typings.mobservable.libDnodeMod

import typings.mobservable.libInterfacesMod.IContextInfoStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/dnode", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkIfStateIsBeingModifiedDuringView(context: IContextInfoStruct): Unit = js.native
  def isComputingView(): Boolean = js.native
  def isInTransaction(): Boolean = js.native
  def runAfterTransaction(action: js.Function0[Unit]): Unit = js.native
  def stackDepth(): js.Any = js.native
  def transaction[T](action: js.Function0[T]): T = js.native
  def transaction[T](action: js.Function0[T], thisArg: js.Any): T = js.native
  def untracked[T](action: js.Function0[T]): T = js.native
}

