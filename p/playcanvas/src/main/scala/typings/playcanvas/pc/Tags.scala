package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create an instance of a Tags.
  * @param [parent] - Parent object who tags belong to.
  * Note: Tags are used as addition of `pc.Entity` and `pc.Asset` as `tags` field.
  */
@js.native
trait Tags extends EventHandler {
  
  /**
    * Add a tag, duplicates are ignored. Can be array or comma separated arguments for multiple tags.
    * @example
    * tags.add('level-1');
    * @example
    * tags.add('ui', 'settings');
    * @example
    * tags.add(['level-2', 'mob']);
    * @param name - Name of a tag, or array of tags.
    * @returns True if any tag were added.
    */
  def add(name: js.Any*): Boolean = js.native
  
  /**
    * Remove all tags.
    * @example
    * tags.clear();
    */
  def clear(): Unit = js.native
  
  /**
    * Check if tags satisfy filters.
    * Filters can be provided by simple name of tag, as well as by array of tags.
    * When an array is provided it will check if tags contain each tag within the array.
    * If any of comma separated argument is satisfied, then it will return true.
    * Any number of combinations are valid, and order is irrelevant.
    * @example
    * tags.has('player'); // player
    * @example
    * tags.has('mob', 'player'); // player OR mob
    * @example
    * tags.has(['level-1', 'mob']); // monster AND level-1
    * @example
    * tags.has(['ui', 'settings'], ['ui', 'levels']); // (ui AND settings) OR (ui AND levels)
    * @param query - Name of a tag or array of tags.
    * @returns True if filters are satisfied.
    */
  def has(query: js.Any*): Boolean = js.native
  
  /**
    * Returns immutable array of tags.
    * @returns Copy of tags array.
    */
  def list(): js.Array[String] = js.native
  
  /**
    * Remove tag.
    * @example
    * tags.remove('level-1');
    * @example
    * tags.remove('ui', 'settings');
    * @example
    * tags.remove(['level-2', 'mob']);
    * @param name - Name of a tag or array of tags.
    * @returns True if any tag were removed.
    */
  def remove(name: js.Any*): Boolean = js.native
  
  /**
    * Number of tags in set.
    */
  val size: Double = js.native
}
