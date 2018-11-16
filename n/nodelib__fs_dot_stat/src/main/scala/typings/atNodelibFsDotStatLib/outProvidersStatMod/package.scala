package typings
package atNodelibFsDotStatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersStatMod {
  type AsyncCallback = js.Function2[
    /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
    /* stats */ js.UndefOr[nodeLib.fsMod.Stats], 
    scala.Unit
  ]
}
