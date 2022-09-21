package typings.objectPathImmutable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedObject[T] extends StObject {
  
  def assign(): WrappedObject[T] = js.native
  def assign(path: Unit, source: Any): WrappedObject[T] = js.native
  def assign(path: Path): WrappedObject[T] = js.native
  def assign(path: Path, source: Any): WrappedObject[T] = js.native
  
  def del(): WrappedObject[T] = js.native
  def del(path: Path): WrappedObject[T] = js.native
  
  def insert(): WrappedObject[T] = js.native
  def insert(path: Unit, value: Any): WrappedObject[T] = js.native
  def insert(path: Unit, value: Any, index: Double): WrappedObject[T] = js.native
  def insert(path: Unit, value: Unit, index: Double): WrappedObject[T] = js.native
  def insert(path: Path): WrappedObject[T] = js.native
  def insert(path: Path, value: Any): WrappedObject[T] = js.native
  def insert(path: Path, value: Any, index: Double): WrappedObject[T] = js.native
  def insert(path: Path, value: Unit, index: Double): WrappedObject[T] = js.native
  
  def merge(): WrappedObject[T] = js.native
  def merge(path: Unit, source: Any): WrappedObject[T] = js.native
  def merge(path: Path): WrappedObject[T] = js.native
  def merge(path: Path, source: Any): WrappedObject[T] = js.native
  
  def push(): WrappedObject[T] = js.native
  def push(path: Unit, value: Any): WrappedObject[T] = js.native
  def push(path: Path): WrappedObject[T] = js.native
  def push(path: Path, value: Any): WrappedObject[T] = js.native
  
  def set(): WrappedObject[T] = js.native
  def set(path: Unit, value: Any): WrappedObject[T] = js.native
  def set(path: Path): WrappedObject[T] = js.native
  def set(path: Path, value: Any): WrappedObject[T] = js.native
  
  def update(): WrappedObject[T] = js.native
  def update(path: Unit, updater: js.Function1[/* formerValue */ Any, Any]): WrappedObject[T] = js.native
  def update(path: Path): WrappedObject[T] = js.native
  def update(path: Path, updater: js.Function1[/* formerValue */ Any, Any]): WrappedObject[T] = js.native
  
  def value(): T = js.native
}
