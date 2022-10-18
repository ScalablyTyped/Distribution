package typings.playcanvas.global.pc

import typings.playcanvas.anon.Color
import typings.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of a canvas font asset.
  *
  * @augments EventHandler
  * @ignore
  */
@JSGlobal("pc.CanvasFont")
@js.native
open class CanvasFont protected ()
  extends typings.playcanvas.mod.CanvasFont {
  /**
    * Create a new CanvasFont instance.
    *
    * @param {AppBase} app - The application.
    * @param {object} options - The font options.
    * @param {string} [options.fontName] - The name of the font. CSS font names are supported.
    * Defaults to 'Arial'.
    * @param {string} [options.fontWeight] - The weight of the font, e.g. 'normal', 'bold'.
    * Defaults to 'normal'.
    * @param {number} [options.fontSize] - The font size in pixels. Defaults to 32.
    * @param {Color} [options.color] - The font color.Defaults to white.
    * @param {number} [options.width] - The width of each texture atlas. Defaults to 512.
    * @param {number} [options.height] - The height of each texture atlas. Defaults to 512.
    * @param {number} [options.padding] - Amount of glyph padding in pixels that is added to each
    * glyph in the atlas. Defaults to 0.
    */
  def this(app: AppBase) = this()
  def this(app: AppBase, options: Color) = this()
}
