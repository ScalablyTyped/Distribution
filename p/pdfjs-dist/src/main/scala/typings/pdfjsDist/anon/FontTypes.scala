package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontTypes extends StObject {
  
  /**
    * - Used font types in the
    * document (an item is set to true if specific font ID was used in the
    * document).
    */
  var fontTypes: StringDictionary[Boolean]
  
  /**
    * - Used stream types in the
    * document (an item is set to true if specific stream ID was used in the
    * document).
    */
  var streamTypes: StringDictionary[Boolean]
}
object FontTypes {
  
  inline def apply(fontTypes: StringDictionary[Boolean], streamTypes: StringDictionary[Boolean]): FontTypes = {
    val __obj = js.Dynamic.literal(fontTypes = fontTypes.asInstanceOf[js.Any], streamTypes = streamTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontTypes]
  }
  
  extension [Self <: FontTypes](x: Self) {
    
    inline def setFontTypes(value: StringDictionary[Boolean]): Self = StObject.set(x, "fontTypes", value.asInstanceOf[js.Any])
    
    inline def setStreamTypes(value: StringDictionary[Boolean]): Self = StObject.set(x, "streamTypes", value.asInstanceOf[js.Any])
  }
}
