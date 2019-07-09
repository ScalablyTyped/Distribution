package typings
package atNodelibFsDotScandirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  type AsyncCallback = js.Function2[
    /* err */ nodeLib.NodeJSNs.ErrnoException, 
    /* entries */ js.Array[atNodelibFsDotScandirLib.outTypesMod.Entry], 
    scala.Unit
  ]
}
