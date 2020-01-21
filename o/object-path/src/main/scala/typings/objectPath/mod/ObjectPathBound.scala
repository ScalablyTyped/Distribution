package typings.objectPath.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPathBound[T /* <: js.Object */] extends js.Object {
  def coalesce[TResult](paths: js.Array[Path]): js.UndefOr[TResult] = js.native
  def coalesce[TResult](paths: js.Array[Path], defaultValue: TResult): js.UndefOr[TResult] = js.native
  def coalesce[TResult](paths: Path): js.UndefOr[TResult] = js.native
  def coalesce[TResult](paths: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
  @JSName("coalesce")
  def coalesce_TResult_TResult[TResult](paths: js.Array[Path], defaultValue: TResult): TResult = js.native
  /**
    * @see objectPath.coalesce
    */
  @JSName("coalesce")
  def coalesce_TResult_TResult[TResult](paths: Path, defaultValue: TResult): TResult = js.native
  /**
    * @see objectPath.del
    */
  def del(path: Path): StringDictionary[js.Any] = js.native
  /**
    * @see objectPath.empty
    */
  def empty(path: Path): js.Any = js.native
  def ensureExists[TResult](path: Path): js.UndefOr[TResult] = js.native
  def ensureExists[TResult](path: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
  /**
    * @see objectPath.ensureExists
    */
  @JSName("ensureExists")
  def ensureExists_TResult_TResult[TResult](path: Path, defaultValue: TResult): TResult = js.native
  /**
    * @see objectPath.get
    */
  def get(path: Path): js.Any = js.native
  def get[TResult](path: Path, defaultValue: TResult): TResult = js.native
  /**
    * @see objectPath.has
    */
  def has(path: Path): Boolean = js.native
  /**
    * @see objectPath.insert
    */
  def insert(path: Path, value: js.Any): Unit = js.native
  def insert(path: Path, value: js.Any, at: Double): Unit = js.native
  /**
    * @see objectPath.push
    */
  def push(path: Path, items: js.Any*): Unit = js.native
  /**
    * @see objectPath.set
    */
  def set[TResult](path: Path, value: TResult): js.UndefOr[TResult] = js.native
  def set[TResult](path: Path, value: TResult, doNotReplace: Boolean): js.UndefOr[TResult] = js.native
}

