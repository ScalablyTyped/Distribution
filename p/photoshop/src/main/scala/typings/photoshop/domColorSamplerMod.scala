package typings.photoshop

import typings.photoshop.anon.X
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domObjectsColorsMod.NoColor
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domColorSamplerMod {
  
  @JSImport("photoshop/dom/ColorSampler", "ColorSampler")
  @js.native
  open class ColorSampler protected () extends StObject {
    def this(docId: Double, index: Double, position: X, color: NoColor) = this()
    /**
      * @ignore
      */
    def this(docId: Double, index: Double, position: X, color: SolidColor) = this()
    
    /**
      * The color reading of this ColorSampler in its current position.
      * @minVersion 24.0
      * @returns a [[SolidColor]] instance.
      */
    def color: SolidColor | NoColor = js.native
    
    /**
      * The ID of the Document of this ColorSampler.
      * @minVersion 24.0
      */
    def docId: Double = js.native
    
    /**
      * Moves the ColorSampler object to the given position
      * @param position Object literal with target coordinates in pixels `{x: number, y: number}`.
      * @minVersion 24.0
      */
    def move(position: X): Unit = js.native
    
    /**
      * Owner document of this ColorSampler.
      * @minVersion 24.0
      */
    def parent: Document = js.native
    
    /**
      * The position of this ColorSampler.
      * @minVersion 24.0
      */
    def position: X = js.native
    
    /**
      * Deletes the given ColorSampler object.
      * @minVersion 24.0
      */
    def remove(): Unit = js.native
    
    /**
      * The class name of the referenced object: *"ColorSampler"*.
      * @minVersion 24.0
      */
    def typename: typings.photoshop.photoshopStrings.ColorSampler = js.native
  }
}
