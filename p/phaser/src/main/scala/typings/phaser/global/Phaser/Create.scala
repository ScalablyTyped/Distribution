package typings.phaser.global.Phaser

import typings.phaser.Phaser.Types.Create.GenerateTextureConfig
import typings.phaser.Phaser.Types.Create.Palette
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Create")
@js.native
object Create extends js.Object {
  
  /**
    * Generates a texture based on the given Create configuration object.
    * 
    * The texture is drawn using a fixed-size indexed palette of 16 colors, where the hex value in the
    * data cells map to a single color. For example, if the texture config looked like this:
    * 
    * ```javascript
    * var star = [
    *   '.....828.....',
    *   '....72227....',
    *   '....82228....',
    *   '...7222227...',
    *   '2222222222222',
    *   '8222222222228',
    *   '.72222222227.',
    *   '..787777787..',
    *   '..877777778..',
    *   '.78778887787.',
    *   '.27887.78872.',
    *   '.787.....787.'
    * ];
    * 
    * this.textures.generate('star', { data: star, pixelWidth: 4 });
    * ```
    * 
    * Then it would generate a texture that is 52 x 48 pixels in size, because each cell of the data array
    * represents 1 pixel multiplied by the `pixelWidth` value. The cell values, such as `8`, maps to color
    * number 8 in the palette. If a cell contains a period character `.` then it is transparent.
    * 
    * The default palette is Arne16, but you can specify your own using the `palette` property.
    * @param config The Generate Texture Configuration object.
    */
  def GenerateTexture(config: GenerateTextureConfig): HTMLCanvasElement = js.native
  
  @js.native
  object Palettes extends js.Object {
    
    /**
      * A 16 color palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    var ARNE16: Palette = js.native
    
    /**
      * A 16 color palette inspired by the Commodore 64.
      */
    var C64: Palette = js.native
    
    /**
      * A 16 color CGA inspired palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    var CGA: Palette = js.native
    
    /**
      * A 16 color JMP palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    var JMP: Palette = js.native
    
    /**
      * A 16 color palette inspired by Japanese computers like the MSX.
      */
    var MSX: Palette = js.native
  }
}
