package typings.objectPathImmutable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPathImmutable extends StObject {
  
  def apply[T](obj: T): WrappedObject[T] = js.native
  
  def assign[T](src: T): T = js.native
  def assign[T](src: T, path: js.UndefOr[Path], source: T): T = js.native
  def assign[T](src: T, path: Path): T = js.native
  
  def del[T](src: T): T = js.native
  def del[T](src: T, path: Path): T = js.native
  
  def insert[T](src: T): T = js.native
  def insert[T](src: T, path: js.UndefOr[Path], value: js.UndefOr[scala.Nothing], index: Double): T = js.native
  def insert[T](src: T, path: js.UndefOr[Path], value: js.Any): T = js.native
  def insert[T](src: T, path: js.UndefOr[Path], value: js.Any, index: Double): T = js.native
  def insert[T](src: T, path: Path): T = js.native
  
  def merge[T](src: T): T = js.native
  def merge[T](src: T, path: js.UndefOr[Path], source: js.Any): T = js.native
  def merge[T](src: T, path: Path): T = js.native
  
  def push[T](src: T): T = js.native
  def push[T](src: T, path: js.UndefOr[Path], value: js.Any): T = js.native
  def push[T](src: T, path: Path): T = js.native
  
  def set[T](src: T): T = js.native
  def set[T](src: T, path: js.UndefOr[Path], value: js.Any): T = js.native
  def set[T](src: T, path: Path): T = js.native
  
  def update[T](src: T): WrappedObject[T] = js.native
  def update[T](src: T, path: js.UndefOr[Path], updater: js.Function1[/* formerValue */ js.Any, _]): WrappedObject[T] = js.native
  def update[T](src: T, path: Path): WrappedObject[T] = js.native
}
