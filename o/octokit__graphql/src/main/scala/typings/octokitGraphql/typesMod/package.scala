package typings.octokitGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type EndpointOptions = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.EndpointOptions */ js.Any
  type GraphQlQueryResponseData = org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null
  type GraphQlResponse = typings.std.ReturnType[
    js.Function3[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof Request */ /* request */ js.Any, 
      /* query */ java.lang.String | typings.octokitGraphql.typesMod.RequestParameters, 
      /* options */ js.UndefOr[typings.octokitGraphql.typesMod.RequestParameters], 
      js.Promise[typings.octokitGraphql.typesMod.GraphQlQueryResponseData]
    ]
  ]
  type Query = java.lang.String
  type RequestParameters = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitTypes.RequestParameters */ js.Any
}
