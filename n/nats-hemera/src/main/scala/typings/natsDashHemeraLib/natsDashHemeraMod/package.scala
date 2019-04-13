package typings
package natsDashHemeraLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object natsDashHemeraMod {
  type ActHandler = js.ThisFunction2[/* this */ Hemera, /* error */ stdLib.Error, /* response */ ClientResult, scala.Unit]
  type AddHandler = js.ThisFunction2[/* this */ Hemera, /* request */ Pattern, /* reply */ js.UndefOr[js.Any], scala.Unit]
  type AddMetaMiddleware = js.Function3[
    /* request */ ServerRequest, 
    /* response */ ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type ClientResult = js.Any
  type ExtensionBoundSchema = Schema with natsDashHemeraLib.Anon_Context
  type ExtensionHandler = js.Function4[
    /* ctx */ Hemera, 
    /* request */ js.Any, 
    /* response */ js.Any, 
    /* next */ js.UndefOr[ExtensionNextHandler], 
    scala.Unit
  ]
  type ExtensionNextHandler = js.Function1[/* error */ stdLib.Error, scala.Unit]
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias nats-hemera.nats-hemera.LanguageOptions */ js.Object
  ])
  type LanguageRootOptions = natsDashHemeraLib.Anon_Key with (stdLib.Partial[stdLib.Record[Types, LanguageOptions]])
  type Plugins = org.scalablytyped.runtime.StringDictionary[PluginDefinition]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - js.Object
    - scala.Null
    - Schema
    - SchemaMap
  */
  type SchemaLike = _SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    java.lang.String | ValidationErrorItem | js.Array[ValidationErrorItem] | stdLib.Error
  ]
}
