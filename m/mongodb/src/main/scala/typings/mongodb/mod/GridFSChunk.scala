package typings.mongodb.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSChunk extends StObject {
  
  var _id: typings.bson.mod.ObjectId
  
  var data: Buffer | js.typedarray.Uint8Array
  
  var files_id: typings.bson.mod.ObjectId
  
  var n: scala.Double
}
object GridFSChunk {
  
  inline def apply(
    _id: typings.bson.mod.ObjectId,
    data: Buffer | js.typedarray.Uint8Array,
    files_id: typings.bson.mod.ObjectId,
    n: scala.Double
  ): GridFSChunk = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], files_id = files_id.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GridFSChunk] (val x: Self) extends AnyVal {
    
    inline def setData(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFiles_id(value: typings.bson.mod.ObjectId): Self = StObject.set(x, "files_id", value.asInstanceOf[js.Any])
    
    inline def setN(value: scala.Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def set_id(value: typings.bson.mod.ObjectId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
