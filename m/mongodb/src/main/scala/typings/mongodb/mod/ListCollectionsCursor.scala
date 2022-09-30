package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.anon.PickCollectionInfonametyp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ListCollectionsCursor")
@js.native
open class ListCollectionsCursor[T /* <: PickCollectionInfonametyp | CollectionInfo */] protected () extends AbstractCursor[T, AbstractCursorEvents] {
  def this(db: Db, filter: Document) = this()
  def this(db: Db, filter: Document, options: ListCollectionsOptions) = this()
  
  var filter: Document = js.native
  
  var options: js.UndefOr[ListCollectionsOptions] = js.native
  
  var parent: Db = js.native
}
