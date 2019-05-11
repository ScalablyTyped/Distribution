package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.GameObjects.RetroFont")
@js.native
object RetroFontNs extends js.Object {
  /**
    * Text Set 1 =  !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~
    */
  var TEXT_SET1: java.lang.String = js.native
  /**
    * Text Set 10 = ABCDEFGHIJKLMNOPQRSTUVWXYZ
    */
  var TEXT_SET10: java.lang.String = js.native
  /**
    * Text Set 11 = ABCDEFGHIJKLMNOPQRSTUVWXYZ.,"-+!?()':;0123456789
    */
  var TEXT_SET11: java.lang.String = js.native
  /**
    * Text Set 2 =  !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ
    */
  var TEXT_SET2: java.lang.String = js.native
  /**
    * Text Set 3 = ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
    */
  var TEXT_SET3: java.lang.String = js.native
  /**
    * Text Set 4 = ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789
    */
  var TEXT_SET4: java.lang.String = js.native
  /**
    * Text Set 5 = ABCDEFGHIJKLMNOPQRSTUVWXYZ.,/() '!?-*:0123456789
    */
  var TEXT_SET5: java.lang.String = js.native
  /**
    * Text Set 6 = ABCDEFGHIJKLMNOPQRSTUVWXYZ!?:;0123456789"(),-.'
    */
  var TEXT_SET6: java.lang.String = js.native
  /**
    * Text Set 7 = AGMSY+:4BHNTZ!;5CIOU.?06DJPV,(17EKQW")28FLRX-'39
    */
  var TEXT_SET7: java.lang.String = js.native
  /**
    * Text Set 8 = 0123456789 .ABCDEFGHIJKLMNOPQRSTUVWXYZ
    */
  var TEXT_SET8: java.lang.String = js.native
  /**
    * Text Set 9 = ABCDEFGHIJKLMNOPQRSTUVWXYZ()-0123456789.:,'"?!
    */
  var TEXT_SET9: java.lang.String = js.native
  /**
    * Parses a Retro Font configuration object so you can pass it to the BitmapText constructor
    * and create a BitmapText object using a fixed-width retro font.
    * @param scene A reference to the Phaser Scene.
    * @param config The font configuration object.
    */
  def Parse(
    scene: phaserLib.PhaserNs.Scene,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.BitmapTextNs.RetroFontConfig
  ): js.Object = js.native
}

