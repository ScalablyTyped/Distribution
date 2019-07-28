package typings.paper

import org.scalablytyped.runtime.Instantiable0
import typings.paper.paperNs.CompoundPath
import typings.paper.paperNs.Path
import typings.paper.paperNs.PathItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassPathItem extends Instantiable0[PathItem] {
  /**
    * Creates a path item from the given object, determining if the contained information describes a plain path or a compound-path with multiple sub-paths.
    * @param object - an object containing the properties describing the item to be created
    */
  def create(`object`: js.Any): Path | CompoundPath = js.native
  /**
    * Creates a path item from the given SVG path-data, determining if the data describes a plain path or a compound-path with multiple sub-paths.
    * @param pathData - the SVG path-data to parse
    */
  def create(pathData: String): Path | CompoundPath = js.native
  /**
    * Creates a path item from the given segments array, determining if the array describes a plain path or a compound-path with multiple sub-paths.
    * @param segments - the segments array to parse
    */
  def create(segments: js.Array[_ | Double]): Path | CompoundPath = js.native
}

