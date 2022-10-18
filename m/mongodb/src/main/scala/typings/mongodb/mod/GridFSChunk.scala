package typings.mongodb.mod

import typings.bson.mod.ObjectId
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSChunk extends StObject {
  
  var _id: ObjectId
  
  var data: Buffer | js.typedarray.Uint8Array
  
  var files_id: ObjectId
  
  var n: scala.Double
}
object GridFSChunk {
  
  inline def apply(_id: ObjectId, data: Buffer | js.typedarray.Uint8Array, files_id: ObjectId, n: scala.Double): GridFSChunk = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], files_id = files_id.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridFSChunk]
  }
  
  extension [Self <: GridFSChunk](x: Self) {
    
    inline def setData(value: Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFiles_id(value: ObjectId): Self = StObject.set(x, "files_id", value.asInstanceOf[js.Any])
    
    inline def setN(value: scala.Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def set_id(value: ObjectId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
