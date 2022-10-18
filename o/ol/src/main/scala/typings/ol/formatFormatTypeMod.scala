package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFormatTypeMod {
  
  @JSImport("ol/format/FormatType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FormatType & String] = js.native
    
    /* "arraybuffer" */ val ARRAY_BUFFER: typings.ol.formatFormatTypeMod.FormatType.ARRAY_BUFFER & String = js.native
    
    /* "json" */ val JSON: typings.ol.formatFormatTypeMod.FormatType.JSON & String = js.native
    
    /* "text" */ val TEXT: typings.ol.formatFormatTypeMod.FormatType.TEXT & String = js.native
    
    /* "xml" */ val XML: typings.ol.formatFormatTypeMod.FormatType.XML & String = js.native
  }
  
  @js.native
  sealed trait FormatType extends StObject
  @JSImport("ol/format/FormatType", "FormatType")
  @js.native
  object FormatType extends StObject {
    
    @js.native
    sealed trait ARRAY_BUFFER
      extends StObject
         with FormatType
    
    @js.native
    sealed trait JSON
      extends StObject
         with FormatType
    
    @js.native
    sealed trait TEXT
      extends StObject
         with FormatType
    
    @js.native
    sealed trait XML
      extends StObject
         with FormatType
  }
}
