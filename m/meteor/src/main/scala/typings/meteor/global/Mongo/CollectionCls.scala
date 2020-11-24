package typings.meteor.global.Mongo

import typings.meteor.anon.IdGeneration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Mongo.Collection")
@js.native
class CollectionCls[T, U] ()
  extends typings.meteor.Mongo.Collection[T, U] {
  def this(name: String) = this()
  def this(name: String, options: IdGeneration[T, U]) = this()
  def this(name: Null, options: IdGeneration[T, U]) = this()
}
