package typings.mongodbQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type QueueCallback[T] = js.Function2[
    /* err */ typings.mongodb.mod.MongoError | typings.std.Error, 
    /* result */ T, 
    scala.Unit
  ]
}
