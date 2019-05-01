package typings
package openerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openerMod {
  type Callback = js.Function3[
    /* error */ stdLib.Error, 
    /* stdout */ java.lang.String, 
    /* stderr */ java.lang.String, 
    scala.Unit
  ]
}
