package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ListIndexesCursor")
@js.native
open class ListIndexesCursor protected () extends AbstractCursor[Any, AbstractCursorEvents] {
  def this(collection: Collection[Document]) = this()
  def this(collection: Collection[Document], options: ListIndexesOptions) = this()
  
  var options: js.UndefOr[ListIndexesOptions] = js.native
  
  var parent: Collection[Document] = js.native
}
