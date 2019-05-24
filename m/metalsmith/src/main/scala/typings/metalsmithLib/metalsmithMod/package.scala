package typings
package metalsmithLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object metalsmithMod {
  type Callback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* files */ Files, 
    /* metalsmith */ Metalsmith, 
    scala.Unit
  ]
  type Files = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Ignore = js.Function2[/* path */ java.lang.String, /* stat */ nodeLib.fsMod.Stats, scala.Unit]
  type Plugin = js.Function3[/* files */ Files, /* metalsmith */ Metalsmith, /* callback */ Callback, scala.Unit]
}
