package typings.normalizr.normalizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemaNs {
  type MergeFunction = js.Function2[/* entityA */ js.Any, /* entityB */ js.Any, js.Any]
  type SchemaFunction = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ String, String]
  type StrategyFunction = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ String, js.Any]
}
