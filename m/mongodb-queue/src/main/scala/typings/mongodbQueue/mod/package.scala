package typings.mongodbQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArrayPayload = js.Array[java.lang.String | (typings.std.Record[java.lang.String, js.Any])]
  
  type Payload = java.lang.String | (typings.std.Record[java.lang.String, js.Any])
  
  type QueueCallback[T] = js.Function2[
    /* err */ typings.mongodb.mod.MongoError | typings.std.Error, 
    /* result */ T, 
    scala.Unit
  ]
}
