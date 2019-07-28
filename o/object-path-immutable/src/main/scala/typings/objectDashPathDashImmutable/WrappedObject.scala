package typings.objectDashPathDashImmutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedObject[T] extends js.Object {
  def assign(): WrappedObject[T] = js.native
  def assign(path: Path): WrappedObject[T] = js.native
  def assign(path: Path, source: js.Any): WrappedObject[T] = js.native
  def del(): WrappedObject[T] = js.native
  def del(path: Path): WrappedObject[T] = js.native
  def insert(): WrappedObject[T] = js.native
  def insert(path: Path): WrappedObject[T] = js.native
  def insert(path: Path, value: js.Any): WrappedObject[T] = js.native
  def insert(path: Path, value: js.Any, index: Double): WrappedObject[T] = js.native
  def merge(): WrappedObject[T] = js.native
  def merge(path: Path): WrappedObject[T] = js.native
  def merge(path: Path, source: js.Any): WrappedObject[T] = js.native
  def push(): WrappedObject[T] = js.native
  def push(path: Path): WrappedObject[T] = js.native
  def push(path: Path, value: js.Any): WrappedObject[T] = js.native
  def set(): WrappedObject[T] = js.native
  def set(path: Path): WrappedObject[T] = js.native
  def set(path: Path, value: js.Any): WrappedObject[T] = js.native
  def update(): WrappedObject[T] = js.native
  def update(path: Path): WrappedObject[T] = js.native
  def update(path: Path, updater: js.Function1[/* formerValue */ js.Any, _]): WrappedObject[T] = js.native
  def value(): T = js.native
}

