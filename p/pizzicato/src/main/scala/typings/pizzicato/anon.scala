package typings.pizzicato

import typings.pizzicato.mod.FileSoundOptions
import typings.pizzicato.mod.ScriptSoundOptions
import typings.pizzicato.mod.SoundOptions
import typings.pizzicato.mod.WaveSoundOptions
import typings.pizzicato.mod._SoundDescription
import typings.pizzicato.pizzicatoStrings.file
import typings.pizzicato.pizzicatoStrings.input
import typings.pizzicato.pizzicatoStrings.script
import typings.pizzicato.pizzicatoStrings.wave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var source: wave
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(source = "wave")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setSource(value: wave): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with _SoundDescription {
    
    var options: FileSoundOptions
    
    var source: file
  }
  object Options {
    
    inline def apply(options: FileSoundOptions): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = "file")
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: FileSoundOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSource(value: file): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsScriptSoundOptions
    extends StObject
       with _SoundDescription {
    
    var options: ScriptSoundOptions
    
    var source: script
  }
  object OptionsScriptSoundOptions {
    
    inline def apply(options: ScriptSoundOptions): OptionsScriptSoundOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = "script")
      __obj.asInstanceOf[OptionsScriptSoundOptions]
    }
    
    extension [Self <: OptionsScriptSoundOptions](x: Self) {
      
      inline def setOptions(value: ScriptSoundOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSource(value: script): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsSource
    extends StObject
       with _SoundDescription {
    
    var options: js.UndefOr[SoundOptions] = js.undefined
    
    var source: input
  }
  object OptionsSource {
    
    inline def apply(): OptionsSource = {
      val __obj = js.Dynamic.literal(source = "input")
      __obj.asInstanceOf[OptionsSource]
    }
    
    extension [Self <: OptionsSource](x: Self) {
      
      inline def setOptions(value: SoundOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSource(value: input): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Source
    extends StObject
       with _SoundDescription {
    
    var options: js.UndefOr[WaveSoundOptions] = js.undefined
    
    var source: wave
  }
  object Source {
    
    inline def apply(): Source = {
      val __obj = js.Dynamic.literal(source = "wave")
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setOptions(value: WaveSoundOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSource(value: wave): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
