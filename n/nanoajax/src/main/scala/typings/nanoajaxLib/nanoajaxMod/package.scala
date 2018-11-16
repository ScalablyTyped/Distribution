package typings
package nanoajaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nanoajaxMod {
  type Callback = js.Function3[
    /* statusCode */ scala.Double, 
    /* response */ java.lang.String, 
    /* request */ stdLib.XMLHttpRequest, 
    js.Any
  ]
}
