package typings.meow

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(helpMessage: String, options: Options): Result = (^.asInstanceOf[js.Dynamic].apply(helpMessage.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(helpMessage: js.Array[String], options: Options): Result = (^.asInstanceOf[js.Dynamic].apply(helpMessage.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  inline def apply(options: String): Result = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Result]
  inline def apply(options: js.Array[String]): Result = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Result]
  inline def apply(options: Options): Result = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  @JSImport("meow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var argv: js.UndefOr[js.Array[String]] = js.undefined
    
    var autoHelp: js.UndefOr[Boolean] = js.undefined
    
    var autoVersion: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Caution: Explicitly specifying undefined for booleanDefault
      * has different meaning from omitting key itself.
      */
    var booleanDefault: js.UndefOr[Boolean | Null] = js.undefined
    
    var description: js.UndefOr[String | Boolean] = js.undefined
    
    var flags: js.UndefOr[typings.minimistOptions.mod.Options] = js.undefined
    
    var help: js.UndefOr[String | Boolean] = js.undefined
    
    var inferType: js.UndefOr[Boolean] = js.undefined
    
    var pkg: js.UndefOr[js.Any] = js.undefined
    
    var version: js.UndefOr[String | Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      inline def setAutoHelp(value: Boolean): Self = StObject.set(x, "autoHelp", value.asInstanceOf[js.Any])
      
      inline def setAutoHelpUndefined: Self = StObject.set(x, "autoHelp", js.undefined)
      
      inline def setAutoVersion(value: Boolean): Self = StObject.set(x, "autoVersion", value.asInstanceOf[js.Any])
      
      inline def setAutoVersionUndefined: Self = StObject.set(x, "autoVersion", js.undefined)
      
      inline def setBooleanDefault(value: Boolean): Self = StObject.set(x, "booleanDefault", value.asInstanceOf[js.Any])
      
      inline def setBooleanDefaultNull: Self = StObject.set(x, "booleanDefault", null)
      
      inline def setBooleanDefaultUndefined: Self = StObject.set(x, "booleanDefault", js.undefined)
      
      inline def setDescription(value: String | Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFlags(value: typings.minimistOptions.mod.Options): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setHelp(value: String | Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setInferType(value: Boolean): Self = StObject.set(x, "inferType", value.asInstanceOf[js.Any])
      
      inline def setInferTypeUndefined: Self = StObject.set(x, "inferType", js.undefined)
      
      inline def setPkg(value: js.Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      inline def setVersion(value: String | Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var flags: StringDictionary[js.Any] = js.native
    
    var help: String = js.native
    
    var input: js.Array[String] = js.native
    
    var pkg: js.Any = js.native
    
    def showHelp(): Unit = js.native
    def showHelp(code: Double): Unit = js.native
    
    def showVersion(): Unit = js.native
  }
}
