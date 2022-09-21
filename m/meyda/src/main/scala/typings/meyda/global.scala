package typings.meyda

import typings.meyda.anon.PartialMeydaFeaturesObjec
import typings.meyda.mod.MeydaAnalyzerOptions
import typings.meyda.mod.MeydaAudioFeature
import typings.meyda.mod.MeydaSignal
import typings.meyda.mod.MeydaWindowingFunction
import typings.std.AudioContext
import typings.std.ScriptProcessorNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Meyda {
    
    @JSGlobal("Meyda")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Meyda.EXTRACTION_STARTED")
    @js.native
    val EXTRACTION_STARTED: Boolean = js.native
    
    @JSGlobal("Meyda.MeydaAnalyzer")
    @js.native
    open class MeydaAnalyzer ()
      extends typings.meyda.mod.MeydaAnalyzer
    
    @JSGlobal("Meyda.audioContext")
    @js.native
    val audioContext: AudioContext | Null = js.native
    
    @JSGlobal("Meyda.bufferSize")
    @js.native
    val bufferSize: Double = js.native
    
    inline def callback(features: PartialMeydaFeaturesObjec): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("callback")(features.asInstanceOf[js.Any]).asInstanceOf[Unit | Null]
    
    @JSGlobal("Meyda.chromaBands")
    @js.native
    val chromaBands: Double = js.native
    
    inline def createMeydaAnalyzer(options: MeydaAnalyzerOptions): typings.meyda.mod.MeydaAnalyzer = ^.asInstanceOf[js.Dynamic].applyDynamic("createMeydaAnalyzer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.meyda.mod.MeydaAnalyzer]
    
    inline def extract(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(feature.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[PartialMeydaFeaturesObjec | Null]
    inline def extract(feature: js.Array[MeydaAudioFeature], signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(feature.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], previousSignal.asInstanceOf[js.Any])).asInstanceOf[PartialMeydaFeaturesObjec | Null]
    inline def extract(feature: MeydaAudioFeature, signal: MeydaSignal): PartialMeydaFeaturesObjec | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(feature.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[PartialMeydaFeaturesObjec | Null]
    inline def extract(feature: MeydaAudioFeature, signal: MeydaSignal, previousSignal: MeydaSignal): PartialMeydaFeaturesObjec | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(feature.asInstanceOf[js.Any], signal.asInstanceOf[js.Any], previousSignal.asInstanceOf[js.Any])).asInstanceOf[PartialMeydaFeaturesObjec | Null]
    
    @JSGlobal("Meyda.featureExtractors")
    @js.native
    val featureExtractors: Any = js.native
    
    @JSGlobal("Meyda.melBands")
    @js.native
    val melBands: Double = js.native
    
    @JSGlobal("Meyda.numberOfMFCCCoefficients")
    @js.native
    val numberOfMFCCCoefficients: Double = js.native
    
    @JSGlobal("Meyda.sampleRate")
    @js.native
    val sampleRate: Double = js.native
    
    @JSGlobal("Meyda.spn")
    @js.native
    val spn: ScriptProcessorNode | Null = js.native
    
    inline def windowing(signal: MeydaSignal): MeydaSignal = ^.asInstanceOf[js.Dynamic].applyDynamic("windowing")(signal.asInstanceOf[js.Any]).asInstanceOf[MeydaSignal]
    inline def windowing(signal: MeydaSignal, windowname: MeydaWindowingFunction): MeydaSignal = (^.asInstanceOf[js.Dynamic].applyDynamic("windowing")(signal.asInstanceOf[js.Any], windowname.asInstanceOf[js.Any])).asInstanceOf[MeydaSignal]
    
    @JSGlobal("Meyda.windowingFunction")
    @js.native
    val windowingFunction: MeydaWindowingFunction = js.native
  }
}
