package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readlineMod {
  import typings.std.Error

  type AsyncCompleter = js.Function2[
    /* line */ String, 
    /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit], 
    js.Any
  ]
  type Completer = js.Function1[/* line */ String, CompleterResult]
  type CompleterResult = js.Tuple2[js.Array[String], String]
  type ReadLine = Interface
}
