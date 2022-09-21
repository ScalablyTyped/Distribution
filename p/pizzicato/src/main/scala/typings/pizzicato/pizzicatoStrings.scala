package typings.pizzicato

import typings.pizzicato.mod.GroupEvent
import typings.pizzicato.mod.SoundEvent
import typings.pizzicato.mod.WaveType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pizzicatoStrings {
  
  @js.native
  sealed trait end
    extends StObject
       with SoundEvent
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait input extends StObject
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait pause
    extends StObject
       with GroupEvent
       with SoundEvent
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait play
    extends StObject
       with GroupEvent
       with SoundEvent
  inline def play: play = "play".asInstanceOf[play]
  
  @js.native
  sealed trait sawtooth
    extends StObject
       with WaveType
  inline def sawtooth: sawtooth = "sawtooth".asInstanceOf[sawtooth]
  
  @js.native
  sealed trait script extends StObject
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait sine
    extends StObject
       with WaveType
  inline def sine: sine = "sine".asInstanceOf[sine]
  
  @js.native
  sealed trait square
    extends StObject
       with WaveType
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait stop
    extends StObject
       with GroupEvent
       with SoundEvent
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait triangle
    extends StObject
       with WaveType
  inline def triangle: triangle = "triangle".asInstanceOf[triangle]
  
  @js.native
  sealed trait wave extends StObject
  inline def wave: wave = "wave".asInstanceOf[wave]
}
