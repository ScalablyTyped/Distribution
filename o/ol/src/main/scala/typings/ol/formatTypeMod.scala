package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/format/FormatType", JSImport.Namespace)
@js.native
object formatTypeMod extends js.Object {
  
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FormatType with String] = js.native
    
    /* "arraybuffer" */ val ARRAY_BUFFER: typings.ol.formatTypeMod.FormatType.ARRAY_BUFFER with String = js.native
    
    /* "json" */ val JSON: typings.ol.formatTypeMod.FormatType.JSON with String = js.native
    
    /* "text" */ val TEXT: typings.ol.formatTypeMod.FormatType.TEXT with String = js.native
    
    /* "xml" */ val XML: typings.ol.formatTypeMod.FormatType.XML with String = js.native
  }
}
