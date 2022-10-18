package typings.next.anon

import typings.next.distLibCoalescedFunctionMod.UnwrapPromise
import typings.next.typesMod.GetStaticPaths
import typings.next.typesMod.GetStaticPathsContext
import typings.next.typesMod.GetStaticPathsResult
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultLocale extends StObject {
  
  var configFileName: String
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var getStaticPaths: js.UndefOr[
    GetStaticPaths[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ]
  ] = js.undefined
  
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  
  var page: String
  
  var staticPathsResult: js.UndefOr[
    UnwrapPromise[
      ReturnType[
        GetStaticPaths[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
        ]
      ]
    ]
  ] = js.undefined
}
object DefaultLocale {
  
  inline def apply(configFileName: String, page: String): DefaultLocale = {
    val __obj = js.Dynamic.literal(configFileName = configFileName.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLocale]
  }
  
  extension [Self <: DefaultLocale](x: Self) {
    
    inline def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setGetStaticPaths(
      value: /* context */ GetStaticPathsContext => (js.Promise[
          GetStaticPathsResult[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
          ]
        ]) | (GetStaticPathsResult[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
        ])
    ): Self = StObject.set(x, "getStaticPaths", js.Any.fromFunction1(value))
    
    inline def setGetStaticPathsUndefined: Self = StObject.set(x, "getStaticPaths", js.undefined)
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setStaticPathsResult(
      value: UnwrapPromise[
          ReturnType[
            GetStaticPaths[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
            ]
          ]
        ]
    ): Self = StObject.set(x, "staticPathsResult", value.asInstanceOf[js.Any])
    
    inline def setStaticPathsResultUndefined: Self = StObject.set(x, "staticPathsResult", js.undefined)
  }
}
