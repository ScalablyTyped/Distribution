package typings
package atNodelibFsDotWalkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outProvidersAsyncMod {
  type AsyncCallback = js.Function2[
    /* err */ atNodelibFsDotWalkLib.outTypesMod.Errno, 
    /* entries */ js.Array[atNodelibFsDotWalkLib.outTypesMod.Entry], 
    scala.Unit
  ]
}
