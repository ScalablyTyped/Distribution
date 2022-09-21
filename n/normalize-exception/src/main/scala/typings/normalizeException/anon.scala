package typings.normalizeException

import typings.normalizeException.mod.DefinedString
import typings.normalizeException.normalizeExceptionStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Message[ErrorArg] extends StObject {
    
    var message: DefinedString[
        /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['message'] */ js.Any, 
        _empty
      ]
    
    var name: DefinedString[
        /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['name'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['name'] */ js.Any
      ]
    
    var stack: DefinedString[
        /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['stack'] */ js.Any, 
        String
      ]
  }
  object Message {
    
    inline def apply[ErrorArg](
      message: DefinedString[
          /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['message'] */ js.Any, 
          _empty
        ],
      name: DefinedString[
          /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['name'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['name'] */ js.Any
        ],
      stack: DefinedString[
          /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['stack'] */ js.Any, 
          String
        ]
    ): Message[ErrorArg] = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message[ErrorArg]]
    }
    
    extension [Self <: Message[?], ErrorArg](x: Self & Message[ErrorArg]) {
      
      inline def setMessage(
        value: DefinedString[
              /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['message'] */ js.Any, 
              _empty
            ]
      ): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(
        value: DefinedString[
              /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['name'] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: std.Error['constructor']['name'] */ js.Any
            ]
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(
        value: DefinedString[
              /* import warning: importer.ImportType#apply Failed type conversion: ErrorArg['stack'] */ js.Any, 
              String
            ]
      ): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
}
