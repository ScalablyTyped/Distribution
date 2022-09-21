package typings.pizzicato.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SoundDescription extends StObject
object _SoundDescription {
  
  inline def Options(options: FileSoundOptions): typings.pizzicato.anon.Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = "file")
    __obj.asInstanceOf[typings.pizzicato.anon.Options]
  }
  
  inline def OptionsScriptSoundOptions(options: ScriptSoundOptions): typings.pizzicato.anon.OptionsScriptSoundOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = "script")
    __obj.asInstanceOf[typings.pizzicato.anon.OptionsScriptSoundOptions]
  }
  
  inline def OptionsSource(): typings.pizzicato.anon.OptionsSource = {
    val __obj = js.Dynamic.literal(source = "input")
    __obj.asInstanceOf[typings.pizzicato.anon.OptionsSource]
  }
  
  inline def Source(): typings.pizzicato.anon.Source = {
    val __obj = js.Dynamic.literal(source = "wave")
    __obj.asInstanceOf[typings.pizzicato.anon.Source]
  }
}
