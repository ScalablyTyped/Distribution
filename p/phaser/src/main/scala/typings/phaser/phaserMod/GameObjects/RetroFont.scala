package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.BitmapText.RetroFontConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RetroFont {
  
  @JSImport("phaser", "GameObjects.RetroFont")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a Retro Font configuration object so you can pass it to the BitmapText constructor
    * and create a BitmapText object using a fixed-width retro font.
    * @param scene A reference to the Phaser Scene.
    * @param config The font configuration object.
    */
  inline def Parse(scene: Scene, config: RetroFontConfig): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(scene.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  /**
    * Text Set 1 =  !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET1")
  @js.native
  def TEXT_SET1: String = js.native
  
  /**
    * Text Set 10 = ABCDEFGHIJKLMNOPQRSTUVWXYZ
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET10")
  @js.native
  def TEXT_SET10: String = js.native
  inline def TEXT_SET10_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET10")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 11 = ABCDEFGHIJKLMNOPQRSTUVWXYZ.,"-+!?()':;0123456789
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET11")
  @js.native
  def TEXT_SET11: String = js.native
  inline def TEXT_SET11_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET11")(x.asInstanceOf[js.Any])
  
  inline def TEXT_SET1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET1")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 2 =  !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET2")
  @js.native
  def TEXT_SET2: String = js.native
  inline def TEXT_SET2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET2")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 3 = ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET3")
  @js.native
  def TEXT_SET3: String = js.native
  inline def TEXT_SET3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET3")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 4 = ABCDEFGHIJKLMNOPQRSTUVWXYZ 0123456789
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET4")
  @js.native
  def TEXT_SET4: String = js.native
  inline def TEXT_SET4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET4")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 5 = ABCDEFGHIJKLMNOPQRSTUVWXYZ.,/() '!?-*:0123456789
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET5")
  @js.native
  def TEXT_SET5: String = js.native
  inline def TEXT_SET5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET5")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 6 = ABCDEFGHIJKLMNOPQRSTUVWXYZ!?:;0123456789"(),-.'
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET6")
  @js.native
  def TEXT_SET6: String = js.native
  inline def TEXT_SET6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET6")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 7 = AGMSY+:4BHNTZ!;5CIOU.?06DJPV,(17EKQW")28FLRX-'39
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET7")
  @js.native
  def TEXT_SET7: String = js.native
  inline def TEXT_SET7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET7")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 8 = 0123456789 .ABCDEFGHIJKLMNOPQRSTUVWXYZ
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET8")
  @js.native
  def TEXT_SET8: String = js.native
  inline def TEXT_SET8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET8")(x.asInstanceOf[js.Any])
  
  /**
    * Text Set 9 = ABCDEFGHIJKLMNOPQRSTUVWXYZ()-0123456789.:,'"?!
    */
  @JSImport("phaser", "GameObjects.RetroFont.TEXT_SET9")
  @js.native
  def TEXT_SET9: String = js.native
  inline def TEXT_SET9_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEXT_SET9")(x.asInstanceOf[js.Any])
}
