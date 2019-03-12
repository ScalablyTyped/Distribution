package typings
package openDashGraphLib.openDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ogNs {
  type DataCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* data */ js.UndefOr[Data], scala.Unit]
  type RequestCallback = js.Function2[
    /* err */ stdLib.Error | scala.Null, 
    /* data */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
