package typings.parseJson

import typings.std.Error
import typings.typeFest.sourceBasicMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String): JsonObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[JsonObject]
  inline def default(string: String, filename: String): JsonObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[JsonObject]
  inline def default(string: String, reviver: Unit, filename: String): JsonObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[JsonObject]
  inline def default(string: String, reviver: ReviverFn): JsonObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[JsonObject]
  inline def default(string: String, reviver: ReviverFn, filename: String): JsonObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[JsonObject]
  
  trait JSONError
    extends StObject
       with Error {
    
    /**
    	The printable section of the JSON which produces the error.
    	*/
    val codeFrame: String
    
    // eslint-disable-line @typescript-eslint/naming-convention
    /**
    	The filename displayed in the error message, if any.
    	*/
    var fileName: String
  }
  object JSONError {
    
    inline def apply(codeFrame: String, fileName: String, message: String, name: String): JSONError = {
      val __obj = js.Dynamic.literal(codeFrame = codeFrame.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONError] (val x: Self) extends AnyVal {
      
      inline def setCodeFrame(value: String): Self = StObject.set(x, "codeFrame", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
  
  // Get 'reviver' parameter from JSON.parse()
  type ReviverFn = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<parse-json.anon.FnCall>['1'] */ js.Any
}
