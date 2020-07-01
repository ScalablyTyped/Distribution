package typings.meyda.mod

import typings.meyda.anon.PartialMeydaFeaturesObjec
import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meyda", "MeydaAnalyzer")
@js.native
class MeydaAnalyzer () extends js.Object {
  def get(): PartialMeydaFeaturesObjec | Null = js.native
  def get(features: js.Array[MeydaAudioFeature]): PartialMeydaFeaturesObjec | Null = js.native
  def get(features: MeydaAudioFeature): PartialMeydaFeaturesObjec | Null = js.native
  def setSource(source: AudioNode): Unit = js.native
  def start(): Unit = js.native
  def start(features: js.Array[MeydaAudioFeature]): Unit = js.native
  def start(features: MeydaAudioFeature): Unit = js.native
  def stop(): Unit = js.native
}

