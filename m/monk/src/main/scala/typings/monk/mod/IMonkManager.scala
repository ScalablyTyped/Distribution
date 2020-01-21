package typings.monk.mod

import typings.monk.monkStrings.closed
import typings.monk.monkStrings.open
import typings.monk.monkStrings.opening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monk", "IMonkManager")
@js.native
class IMonkManager () extends js.Object {
  val _state: closed | opening | open = js.native
  def addListener(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
  def addMiddleware(middleware: TMiddleware): Unit = js.native
  def close(): js.Promise[Unit] = js.native
  def create[T](name: String): ICollection[T] = js.native
  def create[T](name: String, creationOption: js.Object): ICollection[T] = js.native
  def create[T](name: String, creationOption: js.Object, options: js.Object): ICollection[T] = js.native
  def get[T](name: String): ICollection[T] = js.native
  def get[T](name: String, options: js.Object): ICollection[T] = js.native
  def listCollections(): js.Array[ICollection[_]] = js.native
  def listCollections(query: js.Object): js.Array[ICollection[_]] = js.native
  def on(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
  def once(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
  def removeListener(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
  def setDefaultCollectionOptions(): Unit = js.native
  def setDefaultCollectionOptions(collectionOptions: js.Object): Unit = js.native
}

