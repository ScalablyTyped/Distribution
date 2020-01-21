package typings.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Sound {
  type EachActiveSoundCallback = js.Function4[
    /* manager */ typings.phaser.Phaser.Sound.BaseSoundManager, 
    /* sound */ typings.phaser.Phaser.Sound.BaseSound, 
    /* index */ scala.Double, 
    /* sounds */ js.Array[typings.phaser.Phaser.Sound.BaseSound], 
    scala.Unit
  ]
}
