package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterUtilsPathMatchMod {
  
  @JSImport("next/dist/shared/lib/router/utils/path-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPathMatch(path: String): js.Function2[
    /* pathname */ js.UndefOr[String | Null], 
    /* params */ js.UndefOr[Any], 
    `false` | StringDictionary[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathMatch")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* pathname */ js.UndefOr[String | Null], 
    /* params */ js.UndefOr[Any], 
    `false` | StringDictionary[Any]
  ]]
  inline def getPathMatch(path: String, options: Options): js.Function2[
    /* pathname */ js.UndefOr[String | Null], 
    /* params */ js.UndefOr[Any], 
    `false` | StringDictionary[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathMatch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* pathname */ js.UndefOr[String | Null], 
    /* params */ js.UndefOr[Any], 
    `false` | StringDictionary[Any]
  ]]
  
  trait Options extends StObject {
    
    /**
      * A transformer function that will be applied to the regexp generated
      * from the provided path and path-to-regexp.
      */
    var regexModifier: js.UndefOr[js.Function1[/* regex */ String, String]] = js.undefined
    
    /**
      * When true the function will remove all unnamed parameters
      * from the matched parameters.
      */
    var removeUnnamedParams: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true the regexp won't allow an optional trailing delimiter
      * to match.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRegexModifier(value: /* regex */ String => String): Self = StObject.set(x, "regexModifier", js.Any.fromFunction1(value))
      
      inline def setRegexModifierUndefined: Self = StObject.set(x, "regexModifier", js.undefined)
      
      inline def setRemoveUnnamedParams(value: Boolean): Self = StObject.set(x, "removeUnnamedParams", value.asInstanceOf[js.Any])
      
      inline def setRemoveUnnamedParamsUndefined: Self = StObject.set(x, "removeUnnamedParams", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
