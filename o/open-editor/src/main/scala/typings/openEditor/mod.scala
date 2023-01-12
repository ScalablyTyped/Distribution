package typings.openEditor

import typings.lineColumnPath.mod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("open-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(files: js.Array[PathLike]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(files: js.Array[PathLike], options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getEditorInfo(files: js.Array[PathLike]): EditorInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditorInfo")(files.asInstanceOf[js.Any]).asInstanceOf[EditorInfo]
  inline def getEditorInfo(files: js.Array[PathLike], options: Options): EditorInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getEditorInfo")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorInfo]
  
  trait EditorInfo extends StObject {
    
    /**
    	The arguments provided to the editor binary.
    	*/
    val arguments: js.Array[String]
    
    /**
    	THe editor binary name.
    	*/
    val binary: String
    
    /**
    	A flag indicating whether the editor runs in the terminal.
    	*/
    val isTerminalEditor: Boolean
  }
  object EditorInfo {
    
    inline def apply(arguments: js.Array[String], binary: String, isTerminalEditor: Boolean): EditorInfo = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], isTerminalEditor = isTerminalEditor.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorInfo] (val x: Self) extends AnyVal {
      
      inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setIsTerminalEditor(value: Boolean): Self = StObject.set(x, "isTerminalEditor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
    	The name, command, or binary path of the editor.
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEditor(value: String): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setEditorUndefined: Self = StObject.set(x, "editor", js.undefined)
    }
  }
}
