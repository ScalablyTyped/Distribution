package typings.metalsmith

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object metalsmithMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.fsMod.Stats
  import typings.std.Error

  type Callback = js.Function3[/* err */ Error | Null, /* files */ Files, /* metalsmith */ Metalsmith, Unit]
  type Files = StringDictionary[js.Any]
  type Ignore = js.Function2[/* path */ String, /* stat */ Stats, Unit]
  type Plugin = js.Function3[/* files */ Files, /* metalsmith */ Metalsmith, /* callback */ Callback, Unit]
}
