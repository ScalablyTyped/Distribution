package typings.ol

import typings.ol.formatFormatTypeMod.FormatType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/FormatType", JSImport.Namespace)
@js.native
object formatFormatTypeMod extends js.Object {
  @js.native
  sealed trait FormatType extends js.Object
  
  @js.native
  object FormatType extends js.Object {
    @js.native
    sealed trait ARRAY_BUFFER extends FormatType
    
    @js.native
    sealed trait JSON extends FormatType
    
    @js.native
    sealed trait TEXT extends FormatType
    
    @js.native
    sealed trait XML extends FormatType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "arraybuffer" */ val ARRAY_BUFFER: typings.ol.formatFormatTypeMod.FormatType.ARRAY_BUFFER with String = js.native
    /* "json" */ val JSON: typings.ol.formatFormatTypeMod.FormatType.JSON with String = js.native
    /* "text" */ val TEXT: typings.ol.formatFormatTypeMod.FormatType.TEXT with String = js.native
    /* "xml" */ val XML: typings.ol.formatFormatTypeMod.FormatType.XML with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FormatType with String] = js.native
  }
  
}

