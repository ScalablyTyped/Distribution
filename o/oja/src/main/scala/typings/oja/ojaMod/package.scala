package typings.oja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojaMod {
  type AddableFunction = js.Function1[/* runtime */ Flow, Unit]
  type AddableToAction = Action | AddableFunction
  type ConsumerCallback = js.Function2[/* payload */ js.Any, /* runtime */ Flow, Unit]
  type DefinitionFunction = js.Function2[/* publisher */ StageContext, /* runtime */ Flow, js.Any]
  type Primitive = js.UndefOr[Boolean | Double | String | js.Symbol | Null]
}
