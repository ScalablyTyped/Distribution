package typings.mri

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mri", JSImport.Namespace)
  @js.native
  def apply(args: js.Array[String]): Argv = js.native
  @JSImport("mri", JSImport.Namespace)
  @js.native
  def apply(args: js.Array[String], options: Options): Argv = js.native
  
  @js.native
  trait Argv
    extends DictionaryObject[js.Any] {
    
    /** anything after `--` or between options */
    @JSName("_")
    var _underscore: js.Array[String] = js.native
  }
  object Argv {
    
    @scala.inline
    def apply(_underscore: js.Array[String]): Argv = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argv]
    }
    
    @scala.inline
    implicit class ArgvMutableBuilder[Self <: Argv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value :_*))
    }
  }
  
  /** A string or array of strings */
  type ArrayOrString = String | js.Array[String]
  
  /** An object with any keys whose values conform to a specific type */
  type DictionaryObject[T] = StringDictionary[T]
  
  @js.native
  trait Options extends StObject {
    
    /** Default values for flags */
    var default: js.UndefOr[DictionaryObject[_]] = js.native
    
    /** Additional aliases for specific flags */
    var alias: js.UndefOr[DictionaryObject[ArrayOrString]] = js.native
    
    /** A flag or array of flags whose values are boolean */
    var boolean: js.UndefOr[ArrayOrString] = js.native
    
    var string: js.UndefOr[ArrayOrString] = js.native
    
    var unknown: js.UndefOr[js.Function1[/* flag */ String, Unit]] = js.native
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
      def setAlias(value: DictionaryObject[ArrayOrString]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      @scala.inline
      def setBoolean(value: ArrayOrString): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      @scala.inline
      def setBooleanVarargs(value: String*): Self = StObject.set(x, "boolean", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: DictionaryObject[_]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setString(value: ArrayOrString): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      @scala.inline
      def setStringVarargs(value: String*): Self = StObject.set(x, "string", js.Array(value :_*))
      
      @scala.inline
      def setUnknown(value: /* flag */ String => Unit): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
}
