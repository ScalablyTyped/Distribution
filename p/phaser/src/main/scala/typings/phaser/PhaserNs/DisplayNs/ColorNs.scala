package typings.phaser.PhaserNs.DisplayNs

import typings.phaser.PhaserNs.TypesNs.DisplayNs.ColorObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Display.Color")
@js.native
object ColorNs extends js.Object {
  @JSName("Interpolate")
  @js.native
  object InterpolateNs extends js.Object {
    /**
      * Interpolates between the two given color objects over the length supplied.
      * @param color1 The first Color object.
      * @param color2 The second Color object.
      * @param length Distance to interpolate over. Default 100.
      * @param index Index to start from. Default 0.
      */
    def ColorWithColor(color1: Color, color2: Color): ColorObject = js.native
    def ColorWithColor(color1: Color, color2: Color, length: Double): ColorObject = js.native
    def ColorWithColor(color1: Color, color2: Color, length: Double, index: Double): ColorObject = js.native
    /**
      * Interpolates between the Color object and color values over the length supplied.
      * @param color1 The first Color object.
      * @param r Red value.
      * @param g Blue value.
      * @param b Green value.
      * @param length Distance to interpolate over. Default 100.
      * @param index Index to start from. Default 0.
      */
    def ColorWithRGB(color1: Color, r: Double, g: Double, b: Double): ColorObject = js.native
    def ColorWithRGB(color1: Color, r: Double, g: Double, b: Double, length: Double): ColorObject = js.native
    def ColorWithRGB(color1: Color, r: Double, g: Double, b: Double, length: Double, index: Double): ColorObject = js.native
    /**
      * Interpolates between the two given color ranges over the length supplied.
      * @param r1 Red value.
      * @param g1 Blue value.
      * @param b1 Green value.
      * @param r2 Red value.
      * @param g2 Blue value.
      * @param b2 Green value.
      * @param length Distance to interpolate over. Default 100.
      * @param index Index to start from. Default 0.
      */
    def RGBWithRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double): ColorObject = js.native
    def RGBWithRGB(r1: Double, g1: Double, b1: Double, r2: Double, g2: Double, b2: Double, length: Double): ColorObject = js.native
    def RGBWithRGB(
      r1: Double,
      g1: Double,
      b1: Double,
      r2: Double,
      g2: Double,
      b2: Double,
      length: Double,
      index: Double
    ): ColorObject = js.native
  }
  
}

