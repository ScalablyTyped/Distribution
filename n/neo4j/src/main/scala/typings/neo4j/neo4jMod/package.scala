package typings.neo4j

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neo4jMod {
  type DoneCallback = js.Function1[/* error */ js.Any, Unit]
  type ResultCallback = js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]
}
