package typings.paper.paperMod

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
  extends typings.paper.paperNs.Path {
  def this(`object`: js.Any) = this()
  def this(pathData: String) = this()
  def this(segments: js.Array[js.Array[Double] | typings.paper.paperNs.Point | typings.paper.paperNs.Segment]) = this()
}

