package typings.photoshop

import typings.photoshop.anon.Get
import typings.photoshop.domObjectsTextFontMod.TextFont
import typings.photoshop.domPhotoshopMod.Photoshop
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domCollectionsTextFontsMod {
  
  @JSImport("photoshop/dom/collections/TextFonts", "TextFonts")
  @js.native
  /** @ignore */
  open class TextFonts ()
    extends StObject
       with Array[TextFont] {
    
    /**
      * Find the first font with the given PostScript name
      */
    def getByName(name: String): TextFont = js.native
    
    /** @ignore */
    def handler(): Get = js.native
    
    /**
      * Number of [[TextFont]] elements in this collection
      */
    @JSName("length")
    def length_MTextFonts: Double = js.native
    
    /**
      * The owner application of this TextFonts collection
      */
    def parent: Photoshop = js.native
    
    /** @ignore */
    /* private */ var proxy: Any = js.native
    
    /**
      * The name for this object collection: TextFonts
      */
    def typename: String = js.native
  }
}
