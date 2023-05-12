package typings.photoshop

import typings.photoshop.anon.X
import typings.photoshop.domConstantsMod.Orientation
import typings.photoshop.domLayerMod.Layer
import typings.photoshop.domTextCharacterStyleMod.CharacterStyle
import typings.photoshop.domTextParagraphStyleMod.ParagraphStyle
import typings.photoshop.domTextWarpStyleMod.WarpStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domTextItemMod {
  
  @JSImport("photoshop/dom/TextItem", "TextItem")
  @js.native
  open class TextItem () extends StObject {
    
    /**
      * The object that stores properties related to the Character panel in the Photoshop UI.
      * @minVersion 24.1
      */
    var characterStyle: CharacterStyle = js.native
    
    /**
      * The actual text of the Layer.
      * @minVersion 24.1
      */
    def contents: String = js.native
    def contents_=(text: String): Unit = js.native
    
    /**
      * Convert a Text Layer from Point Text to Paragraph Text
      * @minVersion 24.1
      */
    def convertToParagraphText(): js.Promise[TextItem] = js.native
    
    /**
      * Convert a Text Layer from Paragraph Text to Point Text
      * @minVersion 24.1
      */
    def convertToPointText(): js.Promise[TextItem] = js.native
    
    /**
      * Convert the Text Layer into a Shape Layer
      * @minVersion 24.1
      */
    def convertToShape(): js.Promise[Unit] = js.native
    
    /**
      * Create a Work Path from the Text Layer
      * @minVersion 24.1
      */
    def createWorkPath(): js.Promise[Unit] = js.native
    
    /**
      * True if the Text Layer is a "Paragraph Text": text that uses boundaries
      * to control the flow of characters, either horizontally or vertically.
      * @minVersion 24.1
      */
    def isParagraphText: Boolean = js.native
    
    /**
      * True if the Text Layer is a "Point Text": a horizontal or vertical line of text
      * that begins where the user clicks in the image.
      * @minVersion 24.1
      */
    def isPointText: Boolean = js.native
    
    /**
      * The text orientation.
      * @default HORIZONTAL
      * @minVersion 24.1
      */
    def orientation: Orientation = js.native
    def orientation_=(orientation: Orientation): Unit = js.native
    
    /**
      * The object that stores properties related to the Paragraph panel in the Photoshop UI.
      * @minVersion 24.1
      */
    var paragraphStyle: ParagraphStyle = js.native
    
    /**
      * The parent Layer
      * @minVersion 24.1
      */
    def parent: Layer = js.native
    
    /**
      * The text insertion point in the document, as an `{x, y}` object
      * where the coordinates are expressed in pixels.
      * @minVersion 24.1
      */
    def textClickPoint: X = js.native
    def textClickPoint_=(point: X): Unit = js.native
    
    /**
      * The typename
      * @minVersion 24.1
      */
    def typename: typings.photoshop.photoshopStrings.TextItem = js.native
    
    /**
      * The object that stores properties related to the Warp Text dialog.
      * @minVersion 24.1
      */
    var warpStyle: WarpStyle = js.native
  }
}
