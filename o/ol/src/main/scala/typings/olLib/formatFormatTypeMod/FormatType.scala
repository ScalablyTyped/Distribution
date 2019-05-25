package typings
package olLib.formatFormatTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatType extends js.Object

@JSImport("ol/format/FormatType", "FormatType")
@js.native
object FormatType extends js.Object {
  @js.native
  sealed trait ARRAY_BUFFER
    extends olLib.formatFormatTypeMod.FormatType
  
  @js.native
  sealed trait JSON
    extends olLib.formatFormatTypeMod.FormatType
  
  @js.native
  sealed trait TEXT
    extends olLib.formatFormatTypeMod.FormatType
  
  @js.native
  sealed trait XML
    extends olLib.formatFormatTypeMod.FormatType
  
}

