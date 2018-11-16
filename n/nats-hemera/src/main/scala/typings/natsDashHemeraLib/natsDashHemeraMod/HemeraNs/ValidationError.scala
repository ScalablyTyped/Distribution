package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ValidationError
  extends stdLib.Error
     with JoiObject {
  var _object: js.Any
  var details: js.Array[ValidationErrorItem]
  def annotate(): java.lang.String
}

