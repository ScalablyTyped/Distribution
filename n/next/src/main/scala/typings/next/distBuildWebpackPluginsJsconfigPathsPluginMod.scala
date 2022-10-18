package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsJsconfigPathsPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/jsconfig-paths-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("next/dist/build/webpack/plugins/jsconfig-paths-plugin", "JsConfigPathsPlugin")
  @js.native
  open class JsConfigPathsPlugin protected () extends StObject {
    def this(paths: Paths, resolvedBaseUrl: String) = this()
    
    @JSName("apply")
    def apply(resolver: Any): Unit = js.native
    
    var jsConfigPlugin: `true` = js.native
    
    var paths: Paths = js.native
    
    var resolvedBaseUrl: String = js.native
  }
  
  inline def findBestPatternMatch[T](values: js.Array[T], getPattern: js.Function1[/* value */ T, Pattern], candidate: String): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findBestPatternMatch")(values.asInstanceOf[js.Any], getPattern.asInstanceOf[js.Any], candidate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def hasZeroOrOneAsteriskCharacter(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasZeroOrOneAsteriskCharacter")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(text: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(text.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def matchPatternOrExact(patternStrings: js.Array[String], candidate: String): js.UndefOr[String | Pattern] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchPatternOrExact")(patternStrings.asInstanceOf[js.Any], candidate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Pattern]]
  
  inline def matchedText(pattern: Pattern, candidate: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("matchedText")(pattern.asInstanceOf[js.Any], candidate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pathIsRelative(testPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("pathIsRelative")(testPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def patternText(hasPrefixSuffix: Pattern): String = ^.asInstanceOf[js.Dynamic].applyDynamic("patternText")(hasPrefixSuffix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tryParsePattern(pattern: String): js.UndefOr[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParsePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Pattern]]
  
  type Paths = StringDictionary[js.Array[String]]
  
  trait Pattern extends StObject {
    
    var prefix: String
    
    var suffix: String
  }
  object Pattern {
    
    inline def apply(prefix: String, suffix: String): Pattern = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
}
