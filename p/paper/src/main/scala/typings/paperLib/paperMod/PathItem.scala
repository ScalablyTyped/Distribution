package typings
package paperLib.paperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper", "PathItem")
@js.native
class PathItem ()
  extends paperLib.paperNs.PathItem

@JSImport("paper", "PathItem")
@js.native
object PathItem extends js.Object {
  /**
           * Creates a path item from the given object, determining if the contained information describes a plain path or a compound-path with multiple sub-paths.
           * @param object - an object containing the properties describing the item to be created
           */
  def create(`object`: js.Any): paperLib.paperNs.Path | paperLib.paperNs.CompoundPath = js.native
  /**
           * Creates a path item from the given SVG path-data, determining if the data describes a plain path or a compound-path with multiple sub-paths.
           * @param pathData - the SVG path-data to parse
           */
  def create(pathData: java.lang.String): paperLib.paperNs.Path | paperLib.paperNs.CompoundPath = js.native
  /**
           * Creates a path item from the given segments array, determining if the array describes a plain path or a compound-path with multiple sub-paths.
           * @param segments - the segments array to parse
           */
  def create(segments: js.Array[_ | scala.Double]): paperLib.paperNs.Path | paperLib.paperNs.CompoundPath = js.native
}

