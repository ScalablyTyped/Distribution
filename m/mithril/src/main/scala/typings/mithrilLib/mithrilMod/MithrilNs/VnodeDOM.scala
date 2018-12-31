package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In some lifecycle methods, Vnode will have a dom property
// and possibly a domSize property.
trait VnodeDOM[Attrs, State /* <: Lifecycle[Attrs, State] */] extends Vnode[Attrs, State] {
  /** Points to the element that corresponds to the vnode. */
  var dom: stdLib.Element
  /** This defines the number of DOM elements that the vnode represents (starting from the element referenced by the dom property). */
  var domSize: js.UndefOr[scala.Double] = js.undefined
}

