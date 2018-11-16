package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
	 * Any Javascript object that has a view method can be used as a Mithril component.
	 * Components can be consumed via the m() utility.
	 */

trait Component[Attrs, State /* <: Lifecycle[Attrs, State] */] extends Lifecycle[Attrs, State] {
  /** Creates a view out of virtual elements. */
  def view(`this`: State, vnode: Vnode[Attrs, State]): Children | scala.Null | scala.Unit
}

