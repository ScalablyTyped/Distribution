package typings.paper

import org.scalablytyped.runtime.Instantiable0
import typings.paper.paper.CompoundPath
import typings.paper.paper.Path
import typings.paper.paper.PathItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassPathItem extends Instantiable0[PathItem] {
  /** 
    * Creates a path item from the given object, determining if the
    * contained information describes a plain path or a compound-path with
    * multiple sub-paths.
    * 
    * @param object - an object containing the properties describing
    *     the item to be created
    * 
    * @return the newly created path item
    */
  def create(`object`: js.Object): Path | CompoundPath = js.native
  /** 
    * Creates a path item from the given SVG path-data, determining if the
    * data describes a plain path or a compound-path with multiple
    * sub-paths.
    * 
    * @param pathData - the SVG path-data to parse
    * 
    * @return the newly created path item
    */
  def create(pathData: String): Path | CompoundPath = js.native
  /** 
    * Creates a path item from the given segments array, determining if the
    * array describes a plain path or a compound-path with multiple
    * sub-paths.
    * 
    * @param segments - the segments array to parse
    * 
    * @return the newly created path item
    */
  def create(segments: js.Array[js.Array[Double]]): Path | CompoundPath = js.native
}

