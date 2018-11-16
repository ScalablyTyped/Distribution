package typings
package objectDashPathLib.ObjectPathGlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectPathStatic extends js.Object {
  /**
           * Binds an object
           */
  def apply[T /* <: js.Object */](`object`: T): IObjectPathBound[T] = js.native
  /*======== Coalesce =========*/
  /**
           * Get the first non undefined property
           * @param {object} object
           * @param {string[]|string[][]|number[]|number[][]} paths
           * @param {*} defaultValue
           * @return {*}
           */
  def coalesce[T /* <: js.Object */, TResult](`object`: T, paths: IMultiArray): TResult = js.native
  /*======== Coalesce =========*/
  /**
           * Get the first non undefined property
           * @param {object} object
           * @param {string[]|string[][]|number[]|number[][]} paths
           * @param {*} defaultValue
           * @return {*}
           */
  def coalesce[T /* <: js.Object */, TResult](`object`: T, paths: IMultiArray, defaultValue: TResult): TResult = js.native
  /**
           * @see objectPath.del
           */
  def del(): scala.Unit = js.native
  /**
           * @see objectPath.del
           */
  def del[T /* <: js.Object */](`object`: T): T = js.native
  /*======== Del =========*/
  
  /**
           * Deletes a member from object or array
           * @param {object} object
           * @param {string[]|string} path
           * @return object
           */
  def del[T /* <: js.Object */](`object`: T, path: IPath): T = js.native
  /**
           * @see objectPath.empty
           */
  def empty(): scala.Unit = js.native
  /**
           * @see objectPath.empty
           */
  def empty[T /* <: js.Object */](`object`: T): T = js.native
  /*======== Empty =========*/
  /**
           * Empty a path. Arrays are set to length 0, objects have all elements deleted, strings
           * are set to empty, numbers to 0, everything else is set to null
           * @param {object} object
           * @param {string|string[]|number[]} path
           */
  def empty[T /* <: js.Object */, TResult](`object`: T, path: IPath): TResult = js.native
  /**
           * @see objectPath.ensureExists
           */
  def ensureExists(): scala.Unit = js.native
  /**
           * @see objectPath.ensureExists
           */
  def ensureExists[T /* <: js.Object */](`object`: T): T = js.native
  /*======== EnsureExists =========*/
  /**
           * Set a value if it doesn't exist, do nothing if it does
           * @param {object} object
           * @param {string|string[]|number|number[]} path
           */
  def ensureExists[T /* <: js.Object */, TExisting](`object`: T, path: IPath, value: js.Any): TExisting = js.native
  /**
           * @see objectPath.get
           */
  def get(): scala.Unit = js.native
  /**
           * @see objectPath.get
           */
  def get[T /* <: js.Object */](`object`: T): T = js.native
  /*======== Get =========*/
  /**
           * Get a path from an object
           * @param {object} object
           * @param {string|string[]|number|number[]} path
           * @param {*} [defaultValue=undefined]
           */
  def get[T /* <: js.Object */, TResult](`object`: T, path: IPath): TResult = js.native
  /*======== Get =========*/
  /**
           * Get a path from an object
           * @param {object} object
           * @param {string|string[]|number|number[]} path
           * @param {*} [defaultValue=undefined]
           */
  def get[T /* <: js.Object */, TResult](`object`: T, path: IPath, defaultValue: TResult): TResult = js.native
  /**
           * @see objectPath.has
           */
  def has(): scala.Boolean = js.native
  /**
           * @see objectPath.has
           */
  def has[T /* <: js.Object */](`object`: T): scala.Boolean = js.native
  /*======== Has =========*/
  /**
           * Tests path existence
           * @param {object} object
           * @param {string[]|string} path
           * @return object
           */
  def has[T /* <: js.Object */](`object`: T, path: IPath): scala.Boolean = js.native
  /*======== Insert =========*/
  /**
           * Insert an item in an array path
           * @param {object} object
           * @param {string|string[]|number|number[]} path
           * @param {*} value
           * @param {number} [at=0]
           */
  def insert[T /* <: js.Object */](`object`: T, path: IPath, value: js.Any): scala.Unit = js.native
  /*======== Insert =========*/
  /**
           * Insert an item in an array path
           * @param {object} object
           * @param {string|string[]|number|number[]} path
           * @param {*} value
           * @param {number} [at=0]
           */
  def insert[T /* <: js.Object */](`object`: T, path: IPath, value: js.Any, at: scala.Double): scala.Unit = js.native
  /**
           * @see objectPath.push
           */
  def push(): scala.Unit = js.native
  /*======== Push =========*/
  /**
           * Create (if path isn't an array) and push the value to it. Can push unlimited number of values
           * @param {object} object
           */
  def push[T /* <: js.Object */](`object`: T, path: IPath, args: js.Any*): scala.Unit = js.native
  /**
           * @see objectPath.set
           */
  def set(): scala.Unit = js.native
  /**
           * @see objectPath.set
           */
  def set[T /* <: js.Object */](`object`: T): T = js.native
  /*======== Set =========*/
  /**
           * Set a path to a value
           * @param {object} object
           * @param {string|string[]|number|number[]} path
           * @param {*} value
           * @param {boolean} [doNotReplace=false]
           * @return Any existing value on the path if any
           */
  def set[T /* <: js.Object */, TExisting](`object`: T, path: IPath, value: js.Any): TExisting = js.native
  /*======== Set =========*/
  /**
           * Set a path to a value
           * @param {object} object
           * @param {string|string[]|number|number[]} path
           * @param {*} value
           * @param {boolean} [doNotReplace=false]
           * @return Any existing value on the path if any
           */
  def set[T /* <: js.Object */, TExisting](`object`: T, path: IPath, value: js.Any, doNotReplace: scala.Boolean): TExisting = js.native
}

