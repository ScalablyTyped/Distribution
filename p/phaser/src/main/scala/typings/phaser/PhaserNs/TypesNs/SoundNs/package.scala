package typings.phaser.PhaserNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SoundNs {
  import typings.phaser.PhaserNs.SoundNs.BaseSound
  import typings.phaser.PhaserNs.SoundNs.BaseSoundManager

  type EachActiveSoundCallback = js.Function4[
    /* manager */ BaseSoundManager, 
    /* sound */ BaseSound, 
    /* index */ Double, 
    /* sounds */ js.Array[BaseSound], 
    Unit
  ]
}
