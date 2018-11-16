package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Effect")
@js.native
class Effect ()
  extends p5Lib.p5Mod.p5Ns.Effect {
  /**
       *   Effect is a base class for audio effects in p5.
       *   This module handles the nodes and methods that are
       *   common and useful for current and future effects.
       *
       *   This class is extended by p5.Distortion,
       *   p5.Compressor, p5.Delay, p5.Filter, p5.Reverb.
       *
       *   @param [ac] Reference to the audio context of the
       *   p5 object
       *   @param [input] Gain Node effect wrapper
       *   @param [output] Gain Node effect wrapper
       *   @param [_drywet] Tone.JS CrossFade node (defaults
       *   to value: 1)
       *   @param [wet] Effects that extend this class should
       *   connect to the wet signal to this gain node, so
       *   that dry and wet signals are mixed properly.
       */
  def this(ac: js.Object) = this()
  /**
       *   Effect is a base class for audio effects in p5.
       *   This module handles the nodes and methods that are
       *   common and useful for current and future effects.
       *
       *   This class is extended by p5.Distortion,
       *   p5.Compressor, p5.Delay, p5.Filter, p5.Reverb.
       *
       *   @param [ac] Reference to the audio context of the
       *   p5 object
       *   @param [input] Gain Node effect wrapper
       *   @param [output] Gain Node effect wrapper
       *   @param [_drywet] Tone.JS CrossFade node (defaults
       *   to value: 1)
       *   @param [wet] Effects that extend this class should
       *   connect to the wet signal to this gain node, so
       *   that dry and wet signals are mixed properly.
       */
  def this(ac: js.Object, input: stdLib.AudioNode) = this()
  /**
       *   Effect is a base class for audio effects in p5.
       *   This module handles the nodes and methods that are
       *   common and useful for current and future effects.
       *
       *   This class is extended by p5.Distortion,
       *   p5.Compressor, p5.Delay, p5.Filter, p5.Reverb.
       *
       *   @param [ac] Reference to the audio context of the
       *   p5 object
       *   @param [input] Gain Node effect wrapper
       *   @param [output] Gain Node effect wrapper
       *   @param [_drywet] Tone.JS CrossFade node (defaults
       *   to value: 1)
       *   @param [wet] Effects that extend this class should
       *   connect to the wet signal to this gain node, so
       *   that dry and wet signals are mixed properly.
       */
  def this(ac: js.Object, input: stdLib.AudioNode, output: stdLib.AudioNode) = this()
  /**
       *   Effect is a base class for audio effects in p5.
       *   This module handles the nodes and methods that are
       *   common and useful for current and future effects.
       *
       *   This class is extended by p5.Distortion,
       *   p5.Compressor, p5.Delay, p5.Filter, p5.Reverb.
       *
       *   @param [ac] Reference to the audio context of the
       *   p5 object
       *   @param [input] Gain Node effect wrapper
       *   @param [output] Gain Node effect wrapper
       *   @param [_drywet] Tone.JS CrossFade node (defaults
       *   to value: 1)
       *   @param [wet] Effects that extend this class should
       *   connect to the wet signal to this gain node, so
       *   that dry and wet signals are mixed properly.
       */
  def this(ac: js.Object, input: stdLib.AudioNode, output: stdLib.AudioNode, _drywet: js.Object) = this()
  /**
       *   Effect is a base class for audio effects in p5.
       *   This module handles the nodes and methods that are
       *   common and useful for current and future effects.
       *
       *   This class is extended by p5.Distortion,
       *   p5.Compressor, p5.Delay, p5.Filter, p5.Reverb.
       *
       *   @param [ac] Reference to the audio context of the
       *   p5 object
       *   @param [input] Gain Node effect wrapper
       *   @param [output] Gain Node effect wrapper
       *   @param [_drywet] Tone.JS CrossFade node (defaults
       *   to value: 1)
       *   @param [wet] Effects that extend this class should
       *   connect to the wet signal to this gain node, so
       *   that dry and wet signals are mixed properly.
       */
  def this(ac: js.Object, input: stdLib.AudioNode, output: stdLib.AudioNode, _drywet: js.Object, wet: stdLib.AudioNode) = this()
}

