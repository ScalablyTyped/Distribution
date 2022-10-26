package typings.next.anon

import typings.next.typesMod.GetStaticPaths
import typings.next.typesMod.GetStaticPathsContext
import typings.next.typesMod.GetStaticPathsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: js.UndefOr[typings.next.distBuildUtilsMod.AppConfig] = js.undefined
  
  var generateStaticParams: js.UndefOr[Any] = js.undefined
  
  var getStaticPaths: js.UndefOr[
    GetStaticPaths[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ]
  ] = js.undefined
  
  var isLayout: js.UndefOr[Boolean] = js.undefined
  
  var segmentPath: String
}
object Config {
  
  inline def apply(segmentPath: String): Config = {
    val __obj = js.Dynamic.literal(segmentPath = segmentPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: typings.next.distBuildUtilsMod.AppConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setGenerateStaticParams(value: Any): Self = StObject.set(x, "generateStaticParams", value.asInstanceOf[js.Any])
    
    inline def setGenerateStaticParamsUndefined: Self = StObject.set(x, "generateStaticParams", js.undefined)
    
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
    
    inline def setIsLayout(value: Boolean): Self = StObject.set(x, "isLayout", value.asInstanceOf[js.Any])
    
    inline def setIsLayoutUndefined: Self = StObject.set(x, "isLayout", js.undefined)
    
    inline def setSegmentPath(value: String): Self = StObject.set(x, "segmentPath", value.asInstanceOf[js.Any])
  }
}
