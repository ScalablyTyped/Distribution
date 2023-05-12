package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of tag names. Tags are automatically available on {@link Entity} and {@link Asset} as `tags`
  * field.
  *
  * @augments EventHandler
  */
@JSImport("playcanvas", "Tags")
@js.native
/**
  * Create an instance of a Tags.
  *
  * @param {object} [parent] - Parent object who tags belong to.
  */
open class Tags () extends EventHandler {
  def this(parent: js.Object) = this()
  
  /**
    * @param {string[]|string[][]} tags - Array of tags.
    * @returns {boolean} True if the supplied tags are present.
    * @private
    */
  /* private */ var _has: Any = js.native
  
  /** @private */
  /* private */ var _index: Any = js.native
  
  /** @private */
  /* private */ var _list: Any = js.native
  
  var _parent: Any = js.native
  
  /**
    * @param {IArguments} args - Arguments to process.
    * @param {boolean} [flat] - If true, will flatten array of tags. Defaults to false.
    * @returns {string[]|string[][]} Array of tags.
    * @private
    */
  /* private */ var _processArguments: Any = js.native
  
  /**
    * @event Tags#add
    * @param {string} tag - Name of a tag added to a set.
    * @param {object} parent - Parent object who tags belong to.
    */
  /**
    * @event Tags#remove
    * @param {string} tag - Name of a tag removed from a set.
    * @param {object} parent - Parent object who tags belong to.
    */
  /**
    * Fires when tags have been added or removed. It will fire once on bulk changes, while
    * `add`/`remove` will fire on each tag operation.
    *
    * @event Tags#change
    * @param {object} [parent] - Parent object who tags belong to.
    */
  /**
    * Add a tag, duplicates are ignored. Can be array or comma separated arguments for multiple tags.
    *
    * @param {...*} name - Name of a tag, or array of tags.
    * @returns {boolean} True if any tag were added.
    * @example
    * tags.add('level-1');
    * @example
    * tags.add('ui', 'settings');
    * @example
    * tags.add(['level-2', 'mob']);
    */
  def add(args: Any*): Boolean = js.native
  
  /**
    * Remove all tags.
    *
    * @example
    * tags.clear();
    */
  def clear(): Unit = js.native
  
  /**
    * Check if tags satisfy filters. Filters can be provided by simple name of tag, as well as by
    * array of tags. When an array is provided it will check if tags contain each tag within the
    * array. If any of comma separated argument is satisfied, then it will return true. Any number
    * of combinations are valid, and order is irrelevant.
    *
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
  def has(args: Any*): Boolean = js.native
  
  /**
    * Returns immutable array of tags.
    *
    * @returns {string[]} Copy of tags array.
    */
  def list(): js.Array[String] = js.native
  
  /**
    * Remove tag.
    *
    * @param {...*} name - Name of a tag or array of tags.
    * @returns {boolean} True if any tag were removed.
    * @example
    * tags.remove('level-1');
    * @example
    * tags.remove('ui', 'settings');
    * @example
    * tags.remove(['level-2', 'mob']);
    */
  def remove(args: Any*): Boolean = js.native
  
  /**
    * Number of tags in set.
    *
    * @type {number}
    */
  def size: Double = js.native
}
