package typings.nickThompsonElementary

import typings.nickThompsonElementary.nickThompsonElementaryStrings.controller
import typings.nickThompsonElementary.nickThompsonElementaryStrings.noteOff
import typings.nickThompsonElementary.nickThompsonElementaryStrings.noteOn
import typings.nickThompsonElementary.nickThompsonElementaryStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreMidiMod {
  
  trait MidiControllerEvent
    extends StObject
       with MidiEventBase
       with MidiEvent {
    
    /**
      * One of the 16 available MIDI channels where each one represents a
      * separate 'instrument'.
      */
    var channel: Double
    
    /**
      * The property of the channel to target; volume, pan and such.
      */
    var target: Double
    
    /**
      * Since this is a 'controller' event the only possible value of this field
      * is 'controller'.
      */
    @JSName("type")
    var type_MidiControllerEvent: controller
    
    /**
      * The value of the target property.
      */
    var value: Double
  }
  object MidiControllerEvent {
    
    inline def apply(bytes: String, channel: Double, source: String, target: Double, value: Double): MidiControllerEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("controller")
      __obj.asInstanceOf[MidiControllerEvent]
    }
    
    extension [Self <: MidiControllerEvent](x: Self) {
      
      inline def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: controller): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOnEvent
    - typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOffEvent
    - typings.nickThompsonElementary.srcCoreMidiMod.MidiControllerEvent
    - // MidiProgramChangeEvent |
  // MidiPitchWheelEvent |
  // MidiAftertouchEvent |
  // MidiChannelPressureEvent |
  // MidiAllNotesOffEvent |
  // MidiAllSoundOffEvent |
  // MidiMetaEventEvent |
  typings.nickThompsonElementary.srcCoreMidiMod.MidiRawEvent
  */
  trait MidiEvent extends StObject
  object MidiEvent {
    
    inline def MidiControllerEvent(bytes: String, channel: Double, source: String, target: Double, value: Double): typings.nickThompsonElementary.srcCoreMidiMod.MidiControllerEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("controller")
      __obj.asInstanceOf[typings.nickThompsonElementary.srcCoreMidiMod.MidiControllerEvent]
    }
    
    inline def MidiNoteOffEvent(bytes: String, noteFrequency: Double, noteName: String, noteNumber: Double, source: String): typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOffEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], noteFrequency = noteFrequency.asInstanceOf[js.Any], noteName = noteName.asInstanceOf[js.Any], noteNumber = noteNumber.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("noteOff")
      __obj.asInstanceOf[typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOffEvent]
    }
    
    inline def MidiNoteOnEvent(bytes: String, noteFrequency: Double, noteName: String, noteNumber: Double, source: String): typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOnEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], noteFrequency = noteFrequency.asInstanceOf[js.Any], noteName = noteName.asInstanceOf[js.Any], noteNumber = noteNumber.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("noteOn")
      __obj.asInstanceOf[typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOnEvent]
    }
    
    inline def MidiRawEvent(bytes: String, source: String): typings.nickThompsonElementary.srcCoreMidiMod.MidiRawEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("raw")
      __obj.asInstanceOf[typings.nickThompsonElementary.srcCoreMidiMod.MidiRawEvent]
    }
  }
  
  trait MidiEventBase extends StObject {
    
    /**
      * The raw MIDI payload used for further deserialization.
      */
    var bytes: String
    
    /**
      * Source of the MIDI event like a keyboard, control surface or even a
      * virtual MIDI device.
      */
    var source: String
    
    /**
      * Type of MIDI Event.
      */
    var `type`: String
  }
  object MidiEventBase {
    
    inline def apply(bytes: String, source: String, `type`: String): MidiEventBase = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MidiEventBase]
    }
    
    extension [Self <: MidiEventBase](x: Self) {
      
      inline def setBytes(value: String): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOnEvent
    - typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOffEvent
  */
  trait MidiNoteEvent extends StObject
  object MidiNoteEvent {
    
    inline def MidiNoteOffEvent(bytes: String, noteFrequency: Double, noteName: String, noteNumber: Double, source: String): typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOffEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], noteFrequency = noteFrequency.asInstanceOf[js.Any], noteName = noteName.asInstanceOf[js.Any], noteNumber = noteNumber.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("noteOff")
      __obj.asInstanceOf[typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOffEvent]
    }
    
    inline def MidiNoteOnEvent(bytes: String, noteFrequency: Double, noteName: String, noteNumber: Double, source: String): typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOnEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], noteFrequency = noteFrequency.asInstanceOf[js.Any], noteName = noteName.asInstanceOf[js.Any], noteNumber = noteNumber.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("noteOn")
      __obj.asInstanceOf[typings.nickThompsonElementary.srcCoreMidiMod.MidiNoteOnEvent]
    }
  }
  
  trait MidiNoteEventBase
    extends StObject
       with MidiEventBase {
    
    /**
      * Frequency of the note being played which doesn't have to match the
      * 'noteName' and 'noteNumber' properties to express motions like
      * portamento and vibrato.
      * - please refer to http://midi.teragonaudio.com/tutr/notenum.htm
      */
    var noteFrequency: Double
    
    /**
      * Name of the note being played.
      * - please refer to http://midi.teragonaudio.com/tutr/notenum.htm
      */
    var noteName: String
    
    /**
      * Number of the note being played.
      * - please refer to http://midi.teragonaudio.com/tutr/notenum.htm
      */
    var noteNumber: Double
  }
  object MidiNoteEventBase {
    
    inline def apply(
      bytes: String,
      noteFrequency: Double,
      noteName: String,
      noteNumber: Double,
      source: String,
      `type`: String
    ): MidiNoteEventBase = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], noteFrequency = noteFrequency.asInstanceOf[js.Any], noteName = noteName.asInstanceOf[js.Any], noteNumber = noteNumber.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MidiNoteEventBase]
    }
    
    extension [Self <: MidiNoteEventBase](x: Self) {
      
      inline def setNoteFrequency(value: Double): Self = StObject.set(x, "noteFrequency", value.asInstanceOf[js.Any])
      
      inline def setNoteName(value: String): Self = StObject.set(x, "noteName", value.asInstanceOf[js.Any])
      
      inline def setNoteNumber(value: Double): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait MidiNoteOffEvent
    extends StObject
       with MidiNoteEventBase
       with MidiEvent
       with MidiNoteEvent {
    
    /**
      * Since this is a 'noteOff' event it can only be a 'noteOff' value.
      */
    @JSName("type")
    var type_MidiNoteOffEvent: noteOff
  }
  object MidiNoteOffEvent {
    
    inline def apply(bytes: String, noteFrequency: Double, noteName: String, noteNumber: Double, source: String): MidiNoteOffEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], noteFrequency = noteFrequency.asInstanceOf[js.Any], noteName = noteName.asInstanceOf[js.Any], noteNumber = noteNumber.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("noteOff")
      __obj.asInstanceOf[MidiNoteOffEvent]
    }
    
    extension [Self <: MidiNoteOffEvent](x: Self) {
      
      inline def setType(value: noteOff): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MidiNoteOnEvent
    extends StObject
       with MidiNoteEventBase
       with MidiEvent
       with MidiNoteEvent {
    
    /**
      * Since this is a 'noteOn' event it can only be a 'noteOn' value.
      */
    @JSName("type")
    var type_MidiNoteOnEvent: noteOn
  }
  object MidiNoteOnEvent {
    
    inline def apply(bytes: String, noteFrequency: Double, noteName: String, noteNumber: Double, source: String): MidiNoteOnEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], noteFrequency = noteFrequency.asInstanceOf[js.Any], noteName = noteName.asInstanceOf[js.Any], noteNumber = noteNumber.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("noteOn")
      __obj.asInstanceOf[MidiNoteOnEvent]
    }
    
    extension [Self <: MidiNoteOnEvent](x: Self) {
      
      inline def setType(value: noteOn): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MidiRawEvent
    extends StObject
       with MidiEventBase
       with MidiEvent {
    
    /**
      * The type can only be 'raw' for this type of event.
      */
    @JSName("type")
    var type_MidiRawEvent: raw
  }
  object MidiRawEvent {
    
    inline def apply(bytes: String, source: String): MidiRawEvent = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("raw")
      __obj.asInstanceOf[MidiRawEvent]
    }
    
    extension [Self <: MidiRawEvent](x: Self) {
      
      inline def setType(value: raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
