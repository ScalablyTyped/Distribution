package typings.pinoStdSerializers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomErrorSerializer = js.Function1[
    /* err */ typings.pinoStdSerializers.mod.SerializedError, 
    typings.std.Record[java.lang.String, js.Any]
  ]
  type CustomRequestSerializer = js.Function1[
    /* req */ typings.pinoStdSerializers.mod.SerializedRequest, 
    typings.std.Record[java.lang.String, js.Any]
  ]
  type CustomResponseSerializer = js.Function1[
    /* res */ typings.pinoStdSerializers.mod.SerializedResponse, 
    typings.std.Record[java.lang.String, js.Any]
  ]
}
