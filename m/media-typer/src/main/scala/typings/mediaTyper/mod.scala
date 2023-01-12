package typings.mediaTyper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("media-typer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(mediaTypeDescriptor: MediaType): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(mediaTypeDescriptor.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(mediaType: String): MediaType = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mediaType.asInstanceOf[js.Any]).asInstanceOf[MediaType]
  
  inline def test(mediaType: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(mediaType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait MediaType extends StObject {
    
    /**
      * The subtype of the media type (always lower case). Example: `svg`
      */
    var subtype: String
    
    /**
      * The suffix of the media type (always lower case). Example: `xml`
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the media type (always lower case). Example: `image`
      */
    var `type`: String
  }
  object MediaType {
    
    inline def apply(subtype: String, `type`: String): MediaType = {
      val __obj = js.Dynamic.literal(subtype = subtype.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
