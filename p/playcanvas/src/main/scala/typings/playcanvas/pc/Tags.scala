package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Tags
  * @augments pc.EventHandler
  * @classdesc Set of tag names.
  * @description Create an instance of a Tags.
  * @param {object} [parent] - Parent object who tags belong to.
  * Note: Tags are used as addition of `pc.Entity` and `pc.Asset` as `tags` field.
  */
@JSGlobal("pc.Tags")
@js.native
class Tags () extends EventHandler {
  def this(parent: js.Any) = this()
  /**
    * @field
    * @readonly
    * @name pc.Tags#size
    * @type {number}
    * @description Number of tags in set.
    */
  val size: Double = js.native
  /**
    * @function
    * @name pc.Tags#add
    * @description Add a tag, duplicates are ignored. Can be array or comma separated arguments for multiple tags.
    * @param {string} name - Name of a tag, or array of tags.
    * @returns {boolean} True if any tag were added.
    * @example
    * tags.add('level-1');
    * @example
    * tags.add('ui', 'settings');
    * @example
    * tags.add(['level-2', 'mob']);
    */
  def add(name: String): Boolean = js.native
  /**
    * @function
    * @name pc.Tags#clear
    * @description Remove all tags.
    * @example
    * tags.clear();
    */
  def clear(): Unit = js.native
  /**
    * @function
    * @name pc.Tags#has
    * @description Check if tags satisfy filters.
    * Filters can be provided by simple name of tag, as well as by array of tags.
    * When an array is provided it will check if tags contain each tag within the array.
    * If any of comma separated argument is satisfied, then it will return true.
    * Any number of combinations are valid, and order is irrelevant.
    * @param {...*} query - Name of a tag or array of tags.
    * @returns {boolean} True if filters are satisfied.
    * @example
    * tags.has('player'); // player
    * @example
    * tags.has('mob', 'player'); // player OR mob
    * @example
    * tags.has(['level-1', 'mob']); // monster AND level-1
    * @example
    * tags.has(['ui', 'settings'], ['ui', 'levels']); // (ui AND settings) OR (ui AND levels)
    */
  def has(query: js.Any*): Boolean = js.native
  /**
    * @function
    * @name pc.Tags#list
    * @description Returns immutable array of tags.
    * @returns {string[]} Copy of tags array.
    */
  def list(): js.Array[String] = js.native
  /**
    * @function
    * @name pc.Tags#remove
    * @description Remove tag.
    * @param {string} name - Name of a tag or array of tags.
    * @returns {boolean} True if any tag were removed.
    * @example
    * tags.remove('level-1');
    * @example
    * tags.remove('ui', 'settings');
    * @example
    * tags.remove(['level-2', 'mob']);
    */
  def remove(name: String): Boolean = js.native
}

