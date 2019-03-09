package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OscillatorNode extends AudioScheduledSourceNode {
  val detune: AudioParam = js.native
  val frequency: AudioParam = js.native
  var `type`: OscillatorType = js.native
  def setPeriodicWave(periodicWave: PeriodicWave): scala.Unit = js.native
}

@JSGlobal("OscillatorNode")
@js.native
object OscillatorNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ BaseAudioContext, OscillatorNode]
     with org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ OscillatorOptions, OscillatorNode]

