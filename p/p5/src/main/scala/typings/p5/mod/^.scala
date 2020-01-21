package typings.p5.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:no-empty-interface
@JSImport("p5", JSImport.Namespace)
@js.native
class ^ protected () extends p5 {
  /**
    *   This is the p5 instance constructor. A p5 instance
    *   holds all the properties and methods related to a
    *   p5 sketch. It expects an incoming sketch closure
    *   and it can also take an optional node parameter
    *   for attaching the generated p5 canvas to a node.
    *   The sketch closure takes the newly created p5
    *   instance as its sole argument and may optionally
    *   set preload(), setup(), and/or draw() properties
    *   on it for running a sketch.
    *
    *   A p5 sketch can run in "global" or "instance"
    *   mode: "global" - all properties and methods are
    *   attached to the window "instance" - all properties
    *   and methods are bound to this p5 object
    *
    *   @param sketch a closure that can set optional
    *   preload(), setup(), and/or draw() properties on
    *   the given p5 instance
    *   @param [node] element to attach canvas to
    *   @return a p5 instance
    */
  def this(sketch: js.Function1[/* repeated */ js.Any, _]) = this()
  def this(sketch: js.Function1[/* repeated */ js.Any, _], node: HTMLElement) = this()
}

