package typings.midi

import org.scalablytyped.runtime.Instantiable0
import typings.midi.midiStrings.message
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("midi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("midi", "Input")
  @js.native
  open class Input_ ()
    extends typings.node.eventsMod.^ {
    def this(options: EventEmitterOptions) = this()
    
    /** Close the midi port */
    def closePort(): Unit = js.native
    
    /** Count the available input ports */
    def getPortCount(): Double = js.native
    
    /** Get the name of a specified input port */
    def getPortName(port: Double): String = js.native
    
    /**
      * Sysex, timing, and active sensing messages are ignored by default. To
      * enable these message types, pass false for the appropriate type in the
      * function below.  Order: (Sysex, Timing, Active Sensing) For example if
      * you want to receive only MIDI Clock beats you should use
      * input.ignoreTypes(true, false, true)
      */
    def ignoreTypes(sysex: Boolean, timing: Boolean, activeSensing: Boolean): Unit = js.native
    
    @JSName("on")
    def on_message(event: message, callback: MidiCallback): this.type = js.native
    
    /** Open the specified input port */
    def openPort(port: Double): Unit = js.native
    
    /**
      * Instead of opening a connection to an existing MIDI device, on Mac OS X
      * and Linux with ALSA you can create a virtual device that other software
      * may connect to. This can be done simply by calling
      * openVirtualPort(portName) instead of openPort(portNumber).
      */
    def openVirtualPort(port: String): Unit = js.native
  }
  
  @JSImport("midi", "Output")
  @js.native
  open class Output_ () extends StObject {
    
    /** Close the midi port */
    def closePort(): Unit = js.native
    
    /** Count the available output ports */
    def getPortCount(): Double = js.native
    
    /** Get the name of a specified output port */
    def getPortName(port: Double): String = js.native
    
    /** Open the specified output port */
    def openPort(port: Double): Unit = js.native
    
    /**
      * Instead of opening a connection to an existing MIDI device, on Mac OS X
      * and Linux with ALSA you can create a virtual device that other software
      * may connect to. This can be done simply by calling
      * openVirtualPort(portName) instead of openPort(portNumber).
      */
    def openVirtualPort(port: String): Unit = js.native
    
    /** Send a MIDI message */
    def send(message: MidiMessage): Unit = js.native
    
    /** Send a MIDI message */
    def sendMessage(message: MidiMessage): Unit = js.native
  }
  
  inline def createReadStream(): typings.node.streamMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")().asInstanceOf[typings.node.streamMod.^]
  inline def createReadStream(input: Input_): typings.node.streamMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(input.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamMod.^]
  
  inline def createWriteStream(): typings.node.streamMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")().asInstanceOf[typings.node.streamMod.^]
  inline def createWriteStream(output: Output_): typings.node.streamMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(output.asInstanceOf[js.Any]).asInstanceOf[typings.node.streamMod.^]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("midi", "input")
  @js.native
  open class input () extends Input_
  @JSImport("midi", "input")
  @js.native
  val input: Instantiable0[Input_] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("midi", "output")
  @js.native
  open class output () extends Output_
  @JSImport("midi", "output")
  @js.native
  val output: Instantiable0[Output_] = js.native
  
  type MidiCallback = js.Function2[/* deltaTime */ Double, /* message */ MidiMessage, Unit]
  
  type MidiMessage = js.Tuple3[Double, Double, Double]
}
