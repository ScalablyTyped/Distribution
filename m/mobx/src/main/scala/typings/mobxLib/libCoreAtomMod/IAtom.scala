package typings
package mobxLib.libCoreAtomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAtom
  extends mobxLib.libCoreObservableMod.IObservable {
  def reportChanged(): js.Any
  def reportObserved(): js.Any
}

