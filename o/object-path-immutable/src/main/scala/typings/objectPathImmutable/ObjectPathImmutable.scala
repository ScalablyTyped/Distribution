package typings.objectPathImmutable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPathImmutable extends StObject {
  
  def apply[T](obj: T): WrappedObject[T] = js.native
  
  def assign[T](src: T): T = js.native
  def assign[T](src: T, path: Unit, source: T): T = js.native
  def assign[T](src: T, path: Path): T = js.native
  def assign[T](src: T, path: Path, source: T): T = js.native
  
  def del[T](src: T): T = js.native
  def del[T](src: T, path: Path): T = js.native
  
  def insert[T](src: T): T = js.native
  def insert[T](src: T, path: Unit, value: js.Any): T = js.native
  def insert[T](src: T, path: Unit, value: js.Any, index: Double): T = js.native
  def insert[T](src: T, path: Unit, value: Unit, index: Double): T = js.native
  def insert[T](src: T, path: Path): T = js.native
  def insert[T](src: T, path: Path, value: js.Any): T = js.native
  def insert[T](src: T, path: Path, value: js.Any, index: Double): T = js.native
  def insert[T](src: T, path: Path, value: Unit, index: Double): T = js.native
  
  def merge[T](src: T): T = js.native
  def merge[T](src: T, path: Unit, source: js.Any): T = js.native
  def merge[T](src: T, path: Path): T = js.native
  def merge[T](src: T, path: Path, source: js.Any): T = js.native
  
  def push[T](src: T): T = js.native
  def push[T](src: T, path: Unit, value: js.Any): T = js.native
  def push[T](src: T, path: Path): T = js.native
  def push[T](src: T, path: Path, value: js.Any): T = js.native
  
  def set[T](src: T): T = js.native
  def set[T](src: T, path: Unit, value: js.Any): T = js.native
  def set[T](src: T, path: Path): T = js.native
  def set[T](src: T, path: Path, value: js.Any): T = js.native
  
  def update[T](src: T): WrappedObject[T] = js.native
  def update[T](src: T, path: Unit, updater: js.Function1[/* formerValue */ js.Any, js.Any]): WrappedObject[T] = js.native
  def update[T](src: T, path: Path): WrappedObject[T] = js.native
  def update[T](src: T, path: Path, updater: js.Function1[/* formerValue */ js.Any, js.Any]): WrappedObject[T] = js.native
}
