package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openerLib {
  type Callback = js.Function3[
    /* error */ nodeLib.Error, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    scala.Unit
  ]
}
