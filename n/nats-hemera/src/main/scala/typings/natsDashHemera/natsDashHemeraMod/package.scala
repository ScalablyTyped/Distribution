package typings.natsDashHemera

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object natsDashHemeraMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.natsDashHemera.Anon_Context
  import typings.natsDashHemera.Anon_Key
  import typings.std.Error
  import typings.std.Partial
  import typings.std.Record

  type ActHandler = js.ThisFunction2[/* this */ Hemera, /* error */ Error, /* response */ ClientResult, Unit]
  type AddHandler = js.ThisFunction2[/* this */ Hemera, /* request */ Pattern, /* reply */ js.UndefOr[js.Any], Unit]
  type AddMetaMiddleware = js.Function3[
    /* request */ ServerRequest, 
    /* response */ ServerResponse, 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  type ClientResult = js.Any
  type ExtensionBoundSchema = Schema with Anon_Context
  type ExtensionHandler = js.Function4[
    /* ctx */ Hemera, 
    /* request */ js.Any, 
    /* response */ js.Any, 
    /* next */ js.UndefOr[ExtensionNextHandler], 
    Unit
  ]
  type ExtensionNextHandler = js.Function1[/* error */ Error, Unit]
  type LanguageOptions = String | Boolean | Null | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias nats-hemera.nats-hemera.LanguageOptions */ js.Object
  ])
  type LanguageRootOptions = Anon_Key with (Partial[Record[Types, LanguageOptions]])
  type Plugins = StringDictionary[PluginDefinition]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - typings.natsDashHemera.natsDashHemeraMod.Schema
    - typings.natsDashHemera.natsDashHemeraMod.SchemaMap
  */
  type SchemaLike = _SchemaLike | String | Double | Boolean | js.Object | Null
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    String | ValidationErrorItem | js.Array[ValidationErrorItem] | Error
  ]
}
