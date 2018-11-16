package typings
package ngtoasterLib.ngtoasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ngtoasterNs {
  type IToastCallback = js.Function1[/* toast */ IToast, scala.Unit]
  type IToastEventListener = js.Function3[
    /* event */ stdLib.Event, 
    /* toasterId */ scala.Double, 
    /* toastId */ java.lang.String | scala.Double, 
    scala.Unit
  ]
}
