package typings
package ojaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojaMod {
  type AddableFunction = js.Function1[/* runtime */ Flow, scala.Unit]
  type AddableToAction = Action | AddableFunction
  type ConsumerCallback = js.Function2[/* payload */ js.Any, /* runtime */ Flow, scala.Unit]
  type DefinitionFunction = js.Function2[/* publisher */ StageContext, /* runtime */ Flow, js.Any]
  type Primitive = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | js.Symbol | scala.Null]
}
