package typings.meyda.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meyda", "extract")
@js.native
object extract extends js.Object {
  def apply(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal): Partial[MeydaFeaturesObject] | Null = js.native
  def apply(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal, previousSignal: MeydaSignal): Partial[MeydaFeaturesObject] | Null = js.native
  def apply(feature: MeydaAudioFeature, signal: MeydaSignal): Partial[MeydaFeaturesObject] | Null = js.native
  def apply(feature: MeydaAudioFeature, signal: MeydaSignal, previousSignal: MeydaSignal): Partial[MeydaFeaturesObject] | Null = js.native
}

