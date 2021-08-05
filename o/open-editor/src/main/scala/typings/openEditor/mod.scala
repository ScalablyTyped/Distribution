package typings.openEditor

import typings.lineColumnPath.mod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Open the given files in the user's editor at specific line and column if supported by the editor. It does not wait for the editor to start or quit.
  	@param files - Items should be in the format `foo.js:1:5` or `{file: 'foo.js', line: 1: column: 5}`.
  	@example
  	```
  	import openEditor = require('open-editor');
  	openEditor([
  		'unicorn.js:5:3',
  		{
  			file: 'readme.md',
  			line: 10,
  			column: 2
  		}
  	]);
  	```
  	*/
  inline def apply(files: js.Array[PathLike]): Unit = ^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(files: js.Array[PathLike], options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("open-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Same as `openEditor()`, but returns an object with the binary name, arguments, and a flag indicating whether the editor runs in the terminal.
  	Can be useful if you want to handle opening the files yourself.
  	@example
  	```
  	{binary: 'subl', arguments: ['foo.js:1:5'], isTerminalEditor: false}
  	```
  	*/
  inline def make(files: js.Array[PathLike]): EditorRunConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(files.asInstanceOf[js.Any]).asInstanceOf[EditorRunConfig]
  inline def make(files: js.Array[PathLike], options: Options): EditorRunConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorRunConfig]
  
  trait EditorRunConfig extends StObject {
    
    /**
    		Arguments provided to the editor binary.
    		*/
    var arguments: js.Array[String]
    
    /**
    		Editor binary name.
    		*/
    var binary: String
    
    /**
    		A flag indicating whether the editor runs in the terminal.
    		*/
    var isTerminalEditor: Boolean
  }
  object EditorRunConfig {
    
    inline def apply(arguments: js.Array[String], binary: String, isTerminalEditor: Boolean): EditorRunConfig = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], isTerminalEditor = isTerminalEditor.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorRunConfig]
    }
    
    extension [Self <: EditorRunConfig](x: Self) {
      
      inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setIsTerminalEditor(value: Boolean): Self = StObject.set(x, "isTerminalEditor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
    		Name, command, or binary path of the editor.
    		Default: [Auto-detected](https://github.com/sindresorhus/env-editor).
    		__Only use this option if you really have to.__ Can be useful if you want to force a specific editor or implement your own auto-detection.
    		*/
    val editor: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    }
  }
}
