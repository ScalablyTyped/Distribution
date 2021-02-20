package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The PathItem class is the base for any items that describe paths and
  *     offer standardised methods for drawing and path manipulation, such as
  *     {@link Path} and {@link CompoundPath}.
  */
@JSGlobal("paper.PathItem")
@js.native
class PathItem ()
  extends typings.paper.paper.PathItem
object PathItem {
  
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
  /* static member */
  @JSGlobal("paper.PathItem.create")
  @js.native
  def create(`object`: js.Object): typings.paper.paper.Path | typings.paper.paper.CompoundPath = js.native
  /** 
    * Creates a path item from the given SVG path-data, determining if the
    * data describes a plain path or a compound-path with multiple
    * sub-paths.
    * 
    * @param pathData - the SVG path-data to parse
    * 
    * @return the newly created path item
    */
  /* static member */
  @JSGlobal("paper.PathItem.create")
  @js.native
  def create(pathData: String): typings.paper.paper.Path | typings.paper.paper.CompoundPath = js.native
  /** 
    * Creates a path item from the given segments array, determining if the
    * array describes a plain path or a compound-path with multiple
    * sub-paths.
    * 
    * @param segments - the segments array to parse
    * 
    * @return the newly created path item
    */
  /* static member */
  @JSGlobal("paper.PathItem.create")
  @js.native
  def create(segments: js.Array[js.Array[Double]]): typings.paper.paper.Path | typings.paper.paper.CompoundPath = js.native
}
