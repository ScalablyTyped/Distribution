package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Path")
@js.native
class Path ()
  extends paperLib.paperNs.Path {
  /**
           * Creates a new path item from an object description and places it at the top of the active layer.
           * @param object - an object literal containing properties describing the path's attributes
           */
  def this(`object`: js.Any) = this()
  /**
           * Creates a new path item from SVG path-data and places it at the top of the active layer.
           * @param pathData - the SVG path-data that describes the geometry of this path.
           */
  def this(pathData: java.lang.String) = this()
  /**
           * Creates a new path item and places it at the top of the active layer.
           * @param segments [optional] - An array of segments (or points to be converted to segments) that will be added to the path
           */
  def this(segments: js.Array[paperLib.paperNs.Point | paperLib.paperNs.Segment | js.Array[scala.Double]]) = this()
}

