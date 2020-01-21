package typings.oja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddableFunction = js.Function1[/* runtime */ typings.oja.mod.Flow, scala.Unit]
  type AddableToAction = typings.oja.mod.Action | typings.oja.mod.AddableFunction
  type ConsumerCallback = js.Function2[/* payload */ js.Any, /* runtime */ typings.oja.mod.Flow, scala.Unit]
  type DefinitionFunction = js.Function2[
    /* publisher */ typings.oja.mod.StageContext, 
    /* runtime */ typings.oja.mod.Flow, 
    js.Any
  ]
  type Primitive = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | js.Symbol | scala.Null]
}
