package typings.paper.paperNs.PathNs

import typings.paper.paperNs.Path
import typings.paper.paperNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.Path.Line")
@js.native
class Line protected () extends Path {
  /**
    * Creates a linear path item from the properties described by an object literal.
    * @param object - an object literal containing properties describing the path's attributes
    */
  def this(`object`: js.Any) = this()
  /**
    * Creates a linear path item from two points describing a line.
    * @param from - the line's starting point
    * @param to - the line's ending point
    */
  def this(from: Point, to: Point) = this()
}

