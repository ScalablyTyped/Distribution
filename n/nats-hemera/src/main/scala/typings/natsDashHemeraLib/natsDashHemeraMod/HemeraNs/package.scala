package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HemeraNs {
  type ActHandler = js.ThisFunction2[
    /* this */ natsDashHemeraLib.natsDashHemeraMod.Hemera, 
    /* error */ stdLib.Error, 
    /* response */ ClientResult, 
    scala.Unit
  ]
  type AddHandler = js.ThisFunction2[
    /* this */ natsDashHemeraLib.natsDashHemeraMod.Hemera, 
    /* request */ Pattern, 
    /* reply */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type AddMetaMiddleware = js.Function3[
    /* request */ ServerRequest, 
    /* response */ ServerResponse, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type ClientResult = js.Any
  type ExtensionBoundSchema = Schema with natsDashHemeraLib.Anon_Context
  type ExtensionHandler = js.Function4[
    /* ctx */ natsDashHemeraLib.natsDashHemeraMod.Hemera, 
    /* request */ js.Any, 
    /* response */ js.Any, 
    /* next */ js.UndefOr[ExtensionNextHandler], 
    scala.Unit
  ]
  type ExtensionNextHandler = js.Function1[/* error */ stdLib.Error, scala.Unit]
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias nats-hemera.nats-hemera.Hemera.LanguageOptions */ js.Object
  ])
  type LanguageRootOptions = natsDashHemeraLib.Anon_Key with (stdLib.Partial[stdLib.Record[Types, LanguageOptions]])
  type SchemaLike = _SchemaLike | java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    java.lang.String | ValidationErrorItem | js.Array[ValidationErrorItem] | stdLib.Error
  ]
}
