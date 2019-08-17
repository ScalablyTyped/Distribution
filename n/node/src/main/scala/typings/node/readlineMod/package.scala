package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object readlineMod {
  import typings.node.Error

  type AsyncCompleter = js.Function2[
    /* line */ java.lang.String, 
    /* callback */ js.Function2[/* err */ js.UndefOr[Null | Error], /* result */ js.UndefOr[CompleterResult], Unit], 
    js.Any
  ]
  type Completer = js.Function1[/* line */ java.lang.String, CompleterResult]
  type CompleterResult = js.Tuple2[js.Array[java.lang.String], java.lang.String]
  type ReadLine = Interface
}
