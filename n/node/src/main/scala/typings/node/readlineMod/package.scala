package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readlineMod {
  type AsyncCompleter = js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ js.UndefOr[scala.Null | typings.std.Error], 
      /* result */ js.UndefOr[typings.node.readlineMod.CompleterResult], 
      scala.Unit
    ], 
    js.Any
  ]
  type Completer = js.Function1[/* line */ java.lang.String, typings.node.readlineMod.CompleterResult]
  type CompleterResult = js.Tuple2[js.Array[java.lang.String], java.lang.String]
  type ReadLine = typings.node.readlineMod.Interface
}
