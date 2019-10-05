package typings.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Sound {
  import typings.phaser.Phaser.Sound.BaseSound
  import typings.phaser.Phaser.Sound.BaseSoundManager

  type EachActiveSoundCallback = js.Function4[
    /* manager */ BaseSoundManager, 
    /* sound */ BaseSound, 
    /* index */ Double, 
    /* sounds */ js.Array[BaseSound], 
    Unit
  ]
}
