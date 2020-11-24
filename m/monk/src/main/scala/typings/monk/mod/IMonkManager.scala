package typings.monk.mod

import typings.mongodb.mod.CollectionCreateOptions
import typings.monk.monkStrings.closed
import typings.monk.monkStrings.open
import typings.monk.monkStrings.opening
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("monk", "IMonkManager")
@js.native
class IMonkManager () extends js.Object {
  
  val _state: closed | opening | open = js.native
  
  def addListener(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
  
  def addMiddleware(middleware: TMiddleware): Unit = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def create[T](name: String): ICollection[T] = js.native
  def create[T](name: String, creationOption: js.UndefOr[scala.Nothing], options: CollectionOptions): ICollection[T] = js.native
  def create[T](name: String, creationOption: CollectionCreateOptions): ICollection[T] = js.native
  def create[T](name: String, creationOption: CollectionCreateOptions, options: CollectionOptions): ICollection[T] = js.native
  
  def get[T](name: String): ICollection[T] = js.native
  def get[T](name: String, options: CollectionOptions): ICollection[T] = js.native
  
  def listCollections(): js.Array[ICollection[_]] = js.native
  def listCollections(query: js.Object): js.Array[ICollection[_]] = js.native
  
  def on(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
  
  def once(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
  
  def removeListener(event: String, handler: js.Function1[/* event */ js.Any, _]): Unit = js.native
  
  def setDefaultCollectionOptions(): Unit = js.native
  def setDefaultCollectionOptions(collectionOptions: CollectionOptions): Unit = js.native
}
