package typings.pizzicato.mod

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pizzicato.mod.Effects.Compressor
  - typings.pizzicato.mod.Effects.Convolver
  - typings.pizzicato.mod.Effects.Delay
  - typings.pizzicato.mod.Effects.Distortion
  - typings.pizzicato.mod.Effects.DubDelay
  - typings.pizzicato.mod.Effects.Flanger
  - typings.pizzicato.mod.Effects.HighPassFilter
  - typings.pizzicato.mod.Effects.LowPassFilter
  - typings.pizzicato.mod.Effects.PingPongDelay
  - typings.pizzicato.mod.Effects.Quadrafuzz
  - typings.pizzicato.mod.Effects.Reverb
  - typings.pizzicato.mod.Effects.RingModulator
  - typings.pizzicato.mod.Effects.StereoPanner
  - typings.pizzicato.mod.Effects.Tremolo
*/
trait Effect extends StObject
object Effect {
  
  inline def Compressor(
    attack: Double,
    connect: AudioNode => typings.pizzicato.mod.Effects.Compressor,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.Compressor,
    knee: Double,
    mix: Double,
    ratio: Double,
    release: Double,
    threshold: Double
  ): typings.pizzicato.mod.Effects.Compressor = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), knee = knee.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.Compressor]
  }
  
  inline def Convolver(
    connect: AudioNode => typings.pizzicato.mod.Effects.Convolver,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.Convolver,
    impulse: String,
    mix: Double
  ): typings.pizzicato.mod.Effects.Convolver = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), impulse = impulse.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.Convolver]
  }
  
  inline def Delay(
    connect: AudioNode => typings.pizzicato.mod.Effects.Delay,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.Delay,
    feedback: Double,
    mix: Double,
    time: Double
  ): typings.pizzicato.mod.Effects.Delay = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), feedback = feedback.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.Delay]
  }
  
  inline def Distortion(
    connect: AudioNode => typings.pizzicato.mod.Effects.Distortion,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.Distortion,
    gain: Double
  ): typings.pizzicato.mod.Effects.Distortion = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.Distortion]
  }
  
  inline def DubDelay(
    connect: AudioNode => typings.pizzicato.mod.Effects.DubDelay,
    cutoff: Double,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.DubDelay,
    feedback: Double,
    mix: Double,
    time: Double
  ): typings.pizzicato.mod.Effects.DubDelay = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), cutoff = cutoff.asInstanceOf[js.Any], disconnect = js.Any.fromFunction1(disconnect), feedback = feedback.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.DubDelay]
  }
  
  inline def Flanger(
    connect: AudioNode => typings.pizzicato.mod.Effects.Flanger,
    depth: Double,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.Flanger,
    feedback: Double,
    mix: Double,
    speed: Double,
    time: Double
  ): typings.pizzicato.mod.Effects.Flanger = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), depth = depth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction1(disconnect), feedback = feedback.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.Flanger]
  }
  
  inline def HighPassFilter(
    connect: AudioNode => typings.pizzicato.mod.Effects.HighPassFilter,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.HighPassFilter,
    frequency: Double,
    peak: Double
  ): typings.pizzicato.mod.Effects.HighPassFilter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), frequency = frequency.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.HighPassFilter]
  }
  
  inline def LowPassFilter(
    connect: AudioNode => typings.pizzicato.mod.Effects.LowPassFilter,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.LowPassFilter,
    frequency: Double,
    peak: Double
  ): typings.pizzicato.mod.Effects.LowPassFilter = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), frequency = frequency.asInstanceOf[js.Any], peak = peak.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.LowPassFilter]
  }
  
  inline def PingPongDelay(
    connect: AudioNode => typings.pizzicato.mod.Effects.PingPongDelay,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.PingPongDelay,
    feedback: Double,
    mix: Double,
    time: Double
  ): typings.pizzicato.mod.Effects.PingPongDelay = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), feedback = feedback.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.PingPongDelay]
  }
  
  inline def Quadrafuzz(
    connect: AudioNode => typings.pizzicato.mod.Effects.Quadrafuzz,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.Quadrafuzz,
    highGain: Double,
    lowGain: Double,
    midHighGain: Double,
    midLowGain: Double
  ): typings.pizzicato.mod.Effects.Quadrafuzz = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), highGain = highGain.asInstanceOf[js.Any], lowGain = lowGain.asInstanceOf[js.Any], midHighGain = midHighGain.asInstanceOf[js.Any], midLowGain = midLowGain.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.Quadrafuzz]
  }
  
  inline def Reverb(
    connect: AudioNode => typings.pizzicato.mod.Effects.Reverb,
    decay: Double,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.Reverb,
    mix: Double,
    reverse: Boolean,
    time: Double
  ): typings.pizzicato.mod.Effects.Reverb = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), decay = decay.asInstanceOf[js.Any], disconnect = js.Any.fromFunction1(disconnect), mix = mix.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.Reverb]
  }
  
  inline def RingModulator(
    connect: AudioNode => typings.pizzicato.mod.Effects.RingModulator,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.RingModulator,
    distortion: Double,
    mix: Double,
    speed: Double
  ): typings.pizzicato.mod.Effects.RingModulator = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), distortion = distortion.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.RingModulator]
  }
  
  inline def StereoPanner(
    connect: AudioNode => typings.pizzicato.mod.Effects.StereoPanner,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.StereoPanner,
    pan: Double
  ): typings.pizzicato.mod.Effects.StereoPanner = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), disconnect = js.Any.fromFunction1(disconnect), pan = pan.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.StereoPanner]
  }
  
  inline def Tremolo(
    connect: AudioNode => typings.pizzicato.mod.Effects.Tremolo,
    depth: Double,
    disconnect: AudioNode => typings.pizzicato.mod.Effects.Tremolo,
    mix: Double,
    speed: Double
  ): typings.pizzicato.mod.Effects.Tremolo = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), depth = depth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction1(disconnect), mix = mix.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pizzicato.mod.Effects.Tremolo]
  }
}
