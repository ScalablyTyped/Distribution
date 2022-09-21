package typings.photoshop

import typings.photoshop.photoshopMod.Photoshop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFontMod {
  
  @JSImport("photoshop/dom/objects/TextFont", "TextFont")
  @js.native
  open class TextFont () extends StObject {
    
    /**
      * The font family.
      */
    val family: String = js.native
    
    /**
      * The name of the font.
      */
    val name: String = js.native
    
    /**
      * The containing application.
      */
    val parent: Photoshop = js.native
    
    /**
      * The PostScript name of the font.
      */
    val postScriptName: String = js.native
    
    /**
      * The font style.
      */
    val style: String = js.native
    
    /**
      * The class name of the referenced object
      * @default "TextFont"
      */
    val typename: String = js.native
  }
}
