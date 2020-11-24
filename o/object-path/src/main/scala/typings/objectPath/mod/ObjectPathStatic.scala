package typings.objectPath.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPathStatic extends js.Object {
  
  /**
    * Binds an object
    */
  def apply[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = js.native
  
  def coalesce[TResult](`object`: js.Object, paths: js.Array[Path]): js.UndefOr[TResult] = js.native
  def coalesce[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): js.UndefOr[TResult] = js.native
  def coalesce[TResult](`object`: js.Object, paths: Path): js.UndefOr[TResult] = js.native
  def coalesce[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
  @JSName("coalesce")
  def coalesce_TResult_TResult[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): TResult = js.native
  /**
    * Get the first non undefined property
    */
  @JSName("coalesce")
  def coalesce_TResult_TResult[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): TResult = js.native
  
  /**
    * Deletes a member from object or array
    */
  def del(`object`: js.Object, path: Path): StringDictionary[js.Any] = js.native
  
  /**
    * Empty a path. Arrays are set to length 0, objects have all elements deleted, strings
    * are set to empty, numbers to 0, everything else is set to null
    */
  def empty(`object`: js.Object, path: Path): js.Any = js.native
  
  def ensureExists[TResult](`object`: js.Object, path: Path): js.UndefOr[TResult] = js.native
  def ensureExists[TResult](`object`: js.Object, path: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
  /**
    * Set a value if it doesn't exist, do nothing if it does
    */
  @JSName("ensureExists")
  def ensureExists_TResult_TResult[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = js.native
  
  /**
    * Get a path from an object
    */
  def get(`object`: js.Object, path: Path): js.Any = js.native
  def get[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = js.native
  
  /**
    * Tests path existence
    */
  def has(`object`: js.Object, path: Path): Boolean = js.native
  
  /**
    * Insert an item in an array path
    */
  def insert(`object`: js.Object, path: Path, value: js.Any): Unit = js.native
  def insert(`object`: js.Object, path: Path, value: js.Any, at: Double): Unit = js.native
  
  /**
    * Create (if path isn't an array) and push the value to it. Can push unlimited number of values
    */
  def push(`object`: js.Object, path: Path, items: js.Any*): Unit = js.native
  
  /**
    * Set a path to a value
    * @return Any existing value on the path if any
    */
  def set[TResult](`object`: js.Object, path: Path, value: TResult): js.UndefOr[TResult] = js.native
  def set[TResult](`object`: js.Object, path: Path, value: TResult, doNotReplace: Boolean): js.UndefOr[TResult] = js.native
}
