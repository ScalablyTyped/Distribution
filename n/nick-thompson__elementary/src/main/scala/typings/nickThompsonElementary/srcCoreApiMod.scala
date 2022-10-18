package typings.nickThompsonElementary

import typings.nickThompsonElementary.nickThompsonElementaryStrings.load
import typings.nickThompsonElementary.nickThompsonElementaryStrings.midi
import typings.nickThompsonElementary.nickThompsonElementaryStrings.tick
import typings.nickThompsonElementary.srcCoreChildrenMod.Child
import typings.nickThompsonElementary.srcCoreMidiMod.MidiEvent
import typings.nickThompsonElementary.srcCoreNodeMod.NodeStatic
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreApiMod {
  
  @js.native
  trait Core extends EventEmitter {
    
    /**
      * Object containing methods for creating and
      * checking the type of {@link Node}s.
      *
      * @see Core
      * @see Node
      * @see NodeStatic
      */
    val Node: NodeStatic = js.native
    
    /**
      * Returns the audio device block size.
      *
      * Will throw an error if called before the load event has fired.
      *
      * @returns block size
      *
      * @see Core
      */
    def getBlockSize(): Double = js.native
    
    /**
      * Returns the number of input channels with which the audio device was opened.
      *
      * Will throw an error if called before the load event has fired.
      *
      * @returns input channel count
      *
      * @see Core
      */
    def getNumInputChannels(): Double = js.native
    
    /**
      * Returns the number of output channels with which the audio device was opened.
      *
      * Will throw an error if called before the load event has fired.
      *
      * @returns output channel count
      *
      * @see Core
      */
    def getNumOutputChannels(): Double = js.native
    
    /**
      * Returns the quantization interval with which the runtime was prepared,
      * or -1 if no quantization was enabled.
      *
      * Will throw an error if called before the load event has fired.
      *
      * @returns quantization interval
      *
      * @see Core
      */
    def getQuantizationInterval(): Double = js.native
    
    /**
      * Returns the audio device sample rate.
      *
      * Will throw an error if called before the load event has fired.
      *
      * @returns sample rate
      *
      * @see Core
      */
    def getSampleRate(): Double = js.native
    
    /**
      * The load event fires when the runtime has finished preparing the audio
      * rendering thread and is ready to handle render calls.
      *
      * The tick event fires only when the quantize option is enabled. See Command
      * Line Options for more details on the quantize option. Specifically, the
      * 'tick' event will fire just after the runtime has finished applying
      * any queued changes at the end of a given quantization interval.
      *
      * @param event
      * event name
      *
      * @param doThis
      * callback to call
      *
      * @see Core
      */
    def on(event: load | tick, doThis: js.Function0[Unit]): this.type = js.native
    /**
      * The midi event fires any time the runtime receives a MIDI event from
      * any connected and enabled device. By default, the runtime will be
      * listening to any such device, which may yield frequent MIDI events.
      *
      * @param event
      * event name
      *
      * @param doThis
      * callback to call with the MIDI Event
      *
      * @see Core
      * @see MidiEvent
      */
    @JSName("on")
    def on_midi(event: midi, doThis: js.Function1[/* event */ MidiEvent, Unit]): this.type = js.native
    
    /**
      * Accepts a variadic set of arguments, each one representing the audio
      * signal that is to be rendered into the given channel.
      *
      * Will throw an error if invoked before the load event has fired.
      *
      * In the example, given the signals first and second,
      * the core will render the first signal into the first output channel,
      * and the second signal into the second output channel.
      * @example
      *     core.render(first, second);
      *
      * @param children
      * {@link Child}ren to render in channels
      *
      * @see Core
      * @see Child
      * @see Node
      */
    def render(children: Child*): Unit = js.native
  }
}
