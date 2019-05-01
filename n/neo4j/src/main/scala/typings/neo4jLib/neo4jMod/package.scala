package typings
package neo4jLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neo4jMod {
  type DoneCallback = js.Function1[/* error */ js.Any, scala.Unit]
  type ResultCallback = js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit]
}
