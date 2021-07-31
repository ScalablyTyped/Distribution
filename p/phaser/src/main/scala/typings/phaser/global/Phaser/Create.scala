package typings.phaser.global.Phaser

import typings.phaser.Phaser.Types.Create.GenerateTextureConfig
import typings.phaser.Phaser.Types.Create.Palette
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Create {
  
  @JSGlobal("Phaser.Create")
  @js.native
  val ^ : js.Any = js.native
  
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
  @scala.inline
  def GenerateTexture(config: GenerateTextureConfig): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].applyDynamic("GenerateTexture")(config.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  
  object Palettes {
    
    @JSGlobal("Phaser.Create.Palettes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A 16 color palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    @JSGlobal("Phaser.Create.Palettes.ARNE16")
    @js.native
    def ARNE16: Palette = js.native
    @scala.inline
    def ARNE16_=(x: Palette): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARNE16")(x.asInstanceOf[js.Any])
    
    /**
      * A 16 color palette inspired by the Commodore 64.
      */
    @JSGlobal("Phaser.Create.Palettes.C64")
    @js.native
    def C64: Palette = js.native
    @scala.inline
    def C64_=(x: Palette): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("C64")(x.asInstanceOf[js.Any])
    
    /**
      * A 16 color CGA inspired palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    @JSGlobal("Phaser.Create.Palettes.CGA")
    @js.native
    def CGA: Palette = js.native
    @scala.inline
    def CGA_=(x: Palette): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CGA")(x.asInstanceOf[js.Any])
    
    /**
      * A 16 color JMP palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    @JSGlobal("Phaser.Create.Palettes.JMP")
    @js.native
    def JMP: Palette = js.native
    @scala.inline
    def JMP_=(x: Palette): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JMP")(x.asInstanceOf[js.Any])
    
    /**
      * A 16 color palette inspired by Japanese computers like the MSX.
      */
    @JSGlobal("Phaser.Create.Palettes.MSX")
    @js.native
    def MSX: Palette = js.native
    @scala.inline
    def MSX_=(x: Palette): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSX")(x.asInstanceOf[js.Any])
  }
}
