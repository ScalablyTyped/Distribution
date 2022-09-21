package typings.pizzicato.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("pizzicato", "Util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDryLevel(mix: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDryLevel")(mix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getWetLevel(mix: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWetLevel")(mix.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isArray(arg: Any): /* is std.Array<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<unknown> */ Boolean]
  
  inline def isAudioBufferSourceNode(arg: Any): /* is std.AudioBufferSourceNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAudioBufferSourceNode")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.AudioBufferSourceNode */ Boolean]
  
  inline def isBool(arg: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBool")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isEffect(effect: Any): /* is pizzicato.pizzicato.Effect */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[/* is pizzicato.pizzicato.Effect */ Boolean]
  
  inline def isFunction(arg: Any): /* is pizzicato.pizzicato.UnknownFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is pizzicato.pizzicato.UnknownFunction */ Boolean]
  
  inline def isInRange(arg: Double, min: Double, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInRange")(arg.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumber(arg: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(arg: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isOscillator(arg: Any): /* is std.OscillatorNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOscillator")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.OscillatorNode */ Boolean]
  
  inline def isSound(sound: Any): /* is pizzicato.pizzicato.Sound<pizzicato.pizzicato.SoundDescription> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSound")(sound.asInstanceOf[js.Any]).asInstanceOf[/* is pizzicato.pizzicato.Sound<pizzicato.pizzicato.SoundDescription> */ Boolean]
  
  inline def isString(arg: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  /**
    * Takes a number from 0 to 1 and normalizes it to fit within range
    * floor to ceiling.
    */
  inline def normalize(num: Double, floor: Double, ceil: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(num.asInstanceOf[js.Any], floor.asInstanceOf[js.Any], ceil.asInstanceOf[js.Any])).asInstanceOf[Double]
}
