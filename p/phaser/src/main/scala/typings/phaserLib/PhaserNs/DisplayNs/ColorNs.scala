package typings
package phaserLib.PhaserNs.DisplayNs

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
    def ColorWithColor(color1: phaserLib.PhaserNs.DisplayNs.Color, color2: phaserLib.PhaserNs.DisplayNs.Color): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
    def ColorWithColor(
      color1: phaserLib.PhaserNs.DisplayNs.Color,
      color2: phaserLib.PhaserNs.DisplayNs.Color,
      length: scala.Double
    ): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
    def ColorWithColor(
      color1: phaserLib.PhaserNs.DisplayNs.Color,
      color2: phaserLib.PhaserNs.DisplayNs.Color,
      length: scala.Double,
      index: scala.Double
    ): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
    /**
      * Interpolates between the Color object and color values over the length supplied.
      * @param color1 The first Color object.
      * @param r Red value.
      * @param g Blue value.
      * @param b Green value.
      * @param length Distance to interpolate over. Default 100.
      * @param index Index to start from. Default 0.
      */
    def ColorWithRGB(color1: phaserLib.PhaserNs.DisplayNs.Color, r: scala.Double, g: scala.Double, b: scala.Double): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
    def ColorWithRGB(
      color1: phaserLib.PhaserNs.DisplayNs.Color,
      r: scala.Double,
      g: scala.Double,
      b: scala.Double,
      length: scala.Double
    ): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
    def ColorWithRGB(
      color1: phaserLib.PhaserNs.DisplayNs.Color,
      r: scala.Double,
      g: scala.Double,
      b: scala.Double,
      length: scala.Double,
      index: scala.Double
    ): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
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
    def RGBWithRGB(
      r1: scala.Double,
      g1: scala.Double,
      b1: scala.Double,
      r2: scala.Double,
      g2: scala.Double,
      b2: scala.Double
    ): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
    def RGBWithRGB(
      r1: scala.Double,
      g1: scala.Double,
      b1: scala.Double,
      r2: scala.Double,
      g2: scala.Double,
      b2: scala.Double,
      length: scala.Double
    ): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
    def RGBWithRGB(
      r1: scala.Double,
      g1: scala.Double,
      b1: scala.Double,
      r2: scala.Double,
      g2: scala.Double,
      b2: scala.Double,
      length: scala.Double,
      index: scala.Double
    ): phaserLib.PhaserNs.TypesNs.DisplayNs.ColorObject = js.native
  }
  
}

