package typings.meyda.mod

import typings.meyda.anon.PartialMeydaFeaturesObjec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meyda", "extract")
@js.native
object extract extends js.Object {
  def apply(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  def apply(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  def apply(feature: MeydaAudioFeature, signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
  def apply(feature: MeydaAudioFeature, signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = js.native
}

