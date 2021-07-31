package typings.nano.mod

import typings.nano.anon.Fields
import typings.nano.nanoStrings.json
import typings.nano.nanoStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/find.html#db-index
trait CreateIndexRequest extends StObject {
  
  // Name of the design document in which the index will be created.
  var ddoc: js.UndefOr[String] = js.undefined
  
  // JSON object describing the index to create
  var index: Fields
  
  // Name of the index. If no name is provided, a name will be generated automatically.
  var name: js.UndefOr[String] = js.undefined
  
  // This field sets whether the created index will be a partitioned or global index.
  var partitioned: js.UndefOr[Boolean] = js.undefined
  
  // Can be "json" or "text". Defaults to json.
  var `type`: js.UndefOr[json | text] = js.undefined
}
object CreateIndexRequest {
  
  @scala.inline
  def apply(index: Fields): CreateIndexRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIndexRequest]
  }
  
  @scala.inline
  implicit class CreateIndexRequestMutableBuilder[Self <: CreateIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDdoc(value: String): Self = StObject.set(x, "ddoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdocUndefined: Self = StObject.set(x, "ddoc", js.undefined)
    
    @scala.inline
    def setIndex(value: Fields): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPartitioned(value: Boolean): Self = StObject.set(x, "partitioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionedUndefined: Self = StObject.set(x, "partitioned", js.undefined)
    
    @scala.inline
    def setType(value: json | text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
