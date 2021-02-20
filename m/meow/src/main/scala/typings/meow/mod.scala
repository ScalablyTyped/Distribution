package typings.meow

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("meow", JSImport.Namespace)
  @js.native
  def apply(helpMessage: String, options: Options): Result = js.native
  @JSImport("meow", JSImport.Namespace)
  @js.native
  def apply(helpMessage: js.Array[String], options: Options): Result = js.native
  @JSImport("meow", JSImport.Namespace)
  @js.native
  def apply(options: String): Result = js.native
  @JSImport("meow", JSImport.Namespace)
  @js.native
  def apply(options: js.Array[String]): Result = js.native
  @JSImport("meow", JSImport.Namespace)
  @js.native
  def apply(options: Options): Result = js.native
  
  @js.native
  trait Options extends StObject {
    
    var argv: js.UndefOr[js.Array[String]] = js.native
    
    var autoHelp: js.UndefOr[Boolean] = js.native
    
    var autoVersion: js.UndefOr[Boolean] = js.native
    
    /**
      * Caution: Explicitly specifying undefined for booleanDefault
      * has different meaning from omitting key itself.
      */
    var booleanDefault: js.UndefOr[Boolean | Null] = js.native
    
    var description: js.UndefOr[String | Boolean] = js.native
    
    var flags: js.UndefOr[typings.minimistOptions.mod.Options] = js.native
    
    var help: js.UndefOr[String | Boolean] = js.native
    
    var inferType: js.UndefOr[Boolean] = js.native
    
    var pkg: js.UndefOr[js.Any] = js.native
    
    var version: js.UndefOr[String | Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvUndefined: Self = StObject.set(x, "argv", js.undefined)
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setAutoHelp(value: Boolean): Self = StObject.set(x, "autoHelp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHelpUndefined: Self = StObject.set(x, "autoHelp", js.undefined)
      
      @scala.inline
      def setAutoVersion(value: Boolean): Self = StObject.set(x, "autoVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoVersionUndefined: Self = StObject.set(x, "autoVersion", js.undefined)
      
      @scala.inline
      def setBooleanDefault(value: Boolean): Self = StObject.set(x, "booleanDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanDefaultNull: Self = StObject.set(x, "booleanDefault", null)
      
      @scala.inline
      def setBooleanDefaultUndefined: Self = StObject.set(x, "booleanDefault", js.undefined)
      
      @scala.inline
      def setDescription(value: String | Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setFlags(value: typings.minimistOptions.mod.Options): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setHelp(value: String | Boolean): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setInferType(value: Boolean): Self = StObject.set(x, "inferType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInferTypeUndefined: Self = StObject.set(x, "inferType", js.undefined)
      
      @scala.inline
      def setPkg(value: js.Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setVersion(value: String | Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
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
