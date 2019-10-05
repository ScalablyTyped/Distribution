package typings.normalizr.normalizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schema {
  type MergeFunction = js.Function2[/* entityA */ js.Any, /* entityB */ js.Any, js.Any]
  type SchemaFunction = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ String, String]
  type StrategyFunction[T] = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ String, T]
}
