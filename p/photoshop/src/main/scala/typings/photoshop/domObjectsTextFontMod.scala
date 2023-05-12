package typings.photoshop

import typings.photoshop.domPhotoshopMod.Photoshop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsTextFontMod {
  
  @JSImport("photoshop/dom/objects/TextFont", "TextFont")
  @js.native
  open class TextFont () extends StObject {
    
    /* private */ var _family: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _postScriptName: Any = js.native
    
    /* private */ var _style: Any = js.native
    
    /**
      * The font family.
      * @minVersion 23.0
      */
    def family: String = js.native
    
    /**
      * The name of the font.
      * @minVersion 23.0
      */
    def name: String = js.native
    
    /**
      * The containing application.
      * @minVersion 23.0
      */
    def parent: Photoshop = js.native
    
    /**
      * The PostScript name of the font.
      * @minVersion 23.0
      */
    def postScriptName: String = js.native
    
    /**
      * The font style.
      * @minVersion 23.0
      */
    def style: String = js.native
    
    /**
      * The class name of the referenced object: *"TextFont"*.
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.TextFont = js.native
  }
}
