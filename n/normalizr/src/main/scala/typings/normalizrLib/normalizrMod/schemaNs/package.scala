package typings
package normalizrLib.normalizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemaNs {
  type MergeFunction = js.Function2[/* entityA */ js.Any, /* entityB */ js.Any, js.Any]
  type SchemaFunction = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ java.lang.String, java.lang.String]
  type StrategyFunction = js.Function3[/* value */ js.Any, /* parent */ js.Any, /* key */ java.lang.String, js.Any]
}
