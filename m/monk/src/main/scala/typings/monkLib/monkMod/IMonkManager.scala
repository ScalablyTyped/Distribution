package typings
package monkLib.monkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monk", "IMonkManager")
@js.native
class IMonkManager () extends js.Object {
  val _state: monkLib.monkLibStrings.closed | monkLib.monkLibStrings.opening | monkLib.monkLibStrings.open = js.native
  def addListener(event: java.lang.String, handler: js.Function1[/* event */ js.Any, _]): scala.Unit = js.native
  def addMiddleware(middleware: TMiddleware): scala.Unit = js.native
  def close(): stdLib.Promise[scala.Unit] = js.native
  def create[T](name: java.lang.String): ICollection[T] = js.native
  def create[T](name: java.lang.String, creationOption: js.Object): ICollection[T] = js.native
  def create[T](name: java.lang.String, creationOption: js.Object, options: js.Object): ICollection[T] = js.native
  def get[T](name: java.lang.String): ICollection[T] = js.native
  def get[T](name: java.lang.String, options: js.Object): ICollection[T] = js.native
  def listCollections(): js.Array[ICollection[_]] = js.native
  def listCollections(query: js.Object): js.Array[ICollection[_]] = js.native
  def on(event: java.lang.String, handler: js.Function1[/* event */ js.Any, _]): scala.Unit = js.native
  def once(event: java.lang.String, handler: js.Function1[/* event */ js.Any, _]): scala.Unit = js.native
  def removeListener(event: java.lang.String, handler: js.Function1[/* event */ js.Any, _]): scala.Unit = js.native
  def setDefaultCollectionOptions(): scala.Unit = js.native
  def setDefaultCollectionOptions(collectionOptions: js.Object): scala.Unit = js.native
}

