package typings
package atNodelibFsDotStatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  type AsyncCallback = js.Function2[
    /* err */ atNodelibFsDotStatLib.outTypesMod.ErrnoException, 
    /* stats */ atNodelibFsDotStatLib.outTypesMod.Stats, 
    scala.Unit
  ]
}
