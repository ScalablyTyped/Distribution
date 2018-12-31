package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "Path")
@js.native
/**
  * Creates a new path item and places it at the top of the active layer.
  * @param segments [optional] - An array of segments (or points to be converted to segments) that will be added to the path
  */
class Path ()
  extends paperLib.paperNs.Path {
  def this(`object`: js.Any) = this()
  def this(pathData: java.lang.String) = this()
  def this(segments: js.Array[js.Array[scala.Double] | paperLib.paperNs.Point | paperLib.paperNs.Segment]) = this()
}

