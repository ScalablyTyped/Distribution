package typings
package phaserLib.PhaserNs.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SoundNs {
  type EachActiveSoundCallback = js.Function4[
    /* manager */ phaserLib.PhaserNs.SoundNs.BaseSoundManager, 
    /* sound */ phaserLib.PhaserNs.SoundNs.BaseSound, 
    /* index */ scala.Double, 
    /* sounds */ js.Array[phaserLib.PhaserNs.SoundNs.BaseSound], 
    scala.Unit
  ]
}
