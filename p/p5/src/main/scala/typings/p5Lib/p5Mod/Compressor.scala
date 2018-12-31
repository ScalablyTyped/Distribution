package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Compressor")
@js.native
/**
  *   Compressor is an audio effect class that performs
  *   dynamics compression on an audio input source.
  *   This is a very commonly used technique in music
  *   and sound production. Compression creates an
  *   overall louder, richer, and fuller sound by
  *   lowering the volume of louds and raising that of
  *   softs. Compression can be used to avoid clipping
  *   (sound distortion due to peaks in volume) and is
  *   especially useful when many sounds are played at
  *   once. Compression can be used on indivudal sound
  *   sources in addition to the master output.  This
  *   class extends p5.Effect.
  *   Methods amp(), chain(), drywet(), connect(), and
  *   disconnect() are available.
  *
  */
class Compressor ()
  extends p5Lib.p5Mod.p5Ns.Compressor

