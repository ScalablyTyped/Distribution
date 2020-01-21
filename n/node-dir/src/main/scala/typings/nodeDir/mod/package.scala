package typings.nodeDir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FileCallback = js.Function3[
    /* error */ js.Any, 
    /* content */ java.lang.String | typings.node.Buffer, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type FileNamedCallback = js.Function4[
    /* error */ js.Any, 
    /* content */ java.lang.String | typings.node.Buffer, 
    /* filename */ java.lang.String, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type FinishedCallback = js.Function2[/* error */ js.Any, /* files */ js.Array[java.lang.String], scala.Unit]
  type StreamCallback = js.Function3[
    /* error */ js.Any, 
    /* stream */ typings.node.fsMod.ReadStream, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
}
