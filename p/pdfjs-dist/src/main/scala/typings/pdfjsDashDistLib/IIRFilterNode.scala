package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIRFilterNode extends AudioNode {
  def getFrequencyResponse(
    frequencyHz: stdLib.Float32Array,
    magResponse: stdLib.Float32Array,
    phaseResponse: stdLib.Float32Array
  ): scala.Unit = js.native
}

@JSGlobal("IIRFilterNode")
@js.native
object IIRFilterNode
  extends org.scalablytyped.runtime.Instantiable2[/* context */ BaseAudioContext, /* options */ IIRFilterOptions, IIRFilterNode]

