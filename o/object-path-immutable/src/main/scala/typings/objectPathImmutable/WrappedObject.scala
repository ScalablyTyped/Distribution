package typings.objectPathImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedObject[T] extends js.Object {
  
  def assign(): WrappedObject[T] = js.native
  def assign(path: js.UndefOr[Path], source: js.Any): WrappedObject[T] = js.native
  def assign(path: Path): WrappedObject[T] = js.native
  
  def del(): WrappedObject[T] = js.native
  def del(path: Path): WrappedObject[T] = js.native
  
  def insert(): WrappedObject[T] = js.native
  def insert(path: js.UndefOr[Path], value: js.UndefOr[scala.Nothing], index: Double): WrappedObject[T] = js.native
  def insert(path: js.UndefOr[Path], value: js.Any): WrappedObject[T] = js.native
  def insert(path: js.UndefOr[Path], value: js.Any, index: Double): WrappedObject[T] = js.native
  def insert(path: Path): WrappedObject[T] = js.native
  
  def merge(): WrappedObject[T] = js.native
  def merge(path: js.UndefOr[Path], source: js.Any): WrappedObject[T] = js.native
  def merge(path: Path): WrappedObject[T] = js.native
  
  def push(): WrappedObject[T] = js.native
  def push(path: js.UndefOr[Path], value: js.Any): WrappedObject[T] = js.native
  def push(path: Path): WrappedObject[T] = js.native
  
  def set(): WrappedObject[T] = js.native
  def set(path: js.UndefOr[Path], value: js.Any): WrappedObject[T] = js.native
  def set(path: Path): WrappedObject[T] = js.native
  
  def update(): WrappedObject[T] = js.native
  def update(path: js.UndefOr[Path], updater: js.Function1[/* formerValue */ js.Any, _]): WrappedObject[T] = js.native
  def update(path: Path): WrappedObject[T] = js.native
  
  def value(): T = js.native
}
