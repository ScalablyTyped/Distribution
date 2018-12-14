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
  type ExtensionBoundSchema = Schema with natsDashHemeraLib.Anon_CreateError
  type ExtensionHandler = js.Function4[
    /* ctx */ natsDashHemeraLib.natsDashHemeraMod.Hemera, 
    /* request */ js.Any, 
    /* response */ js.Any, 
    /* next */ js.UndefOr[ExtensionNextHandler], 
    scala.Unit
  ]
  type ExtensionNextHandler = js.Function1[/* error */ stdLib.Error, scala.Unit]
  type ExtensionType = natsDashHemeraLib.natsDashHemeraLibStrings.onClientPreRequest | natsDashHemeraLib.natsDashHemeraLibStrings.onClientPostRequest | natsDashHemeraLib.natsDashHemeraLibStrings.onServerPreHandler | natsDashHemeraLib.natsDashHemeraLibStrings.onServerPreRequest | natsDashHemeraLib.natsDashHemeraLibStrings.onServerPreResponse
  type GuidVersions = natsDashHemeraLib.natsDashHemeraLibStrings.uuidv1 | natsDashHemeraLib.natsDashHemeraLibStrings.uuidv2 | natsDashHemeraLib.natsDashHemeraLibStrings.uuidv3 | natsDashHemeraLib.natsDashHemeraLibStrings.uuidv4 | natsDashHemeraLib.natsDashHemeraLibStrings.uuidv5
  type HemeraEvents = natsDashHemeraLib.natsDashHemeraLibStrings.error | natsDashHemeraLib.natsDashHemeraLibStrings.clientPreRequest | natsDashHemeraLib.natsDashHemeraLibStrings.clientPostRequest | natsDashHemeraLib.natsDashHemeraLibStrings.serverPreHandler | natsDashHemeraLib.natsDashHemeraLibStrings.serverPreRequest | natsDashHemeraLib.natsDashHemeraLibStrings.serverPreResponse
  type LanguageOptions = java.lang.String | scala.Boolean | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Object]
  type LanguageRootOptions = natsDashHemeraLib.Anon_Root with (stdLib.Partial[stdLib.Record[Types, LanguageOptions]]) with org.scalablytyped.runtime.StringDictionary[LanguageOptions]
  type LogLevel = natsDashHemeraLib.natsDashHemeraLibStrings.fatal | natsDashHemeraLib.natsDashHemeraLibStrings.error | natsDashHemeraLib.natsDashHemeraLibStrings.warn | natsDashHemeraLib.natsDashHemeraLibStrings.info | natsDashHemeraLib.natsDashHemeraLibStrings.debug | natsDashHemeraLib.natsDashHemeraLibStrings.trace | natsDashHemeraLib.natsDashHemeraLibStrings.silent
  type RequestType = natsDashHemeraLib.natsDashHemeraLibStrings.pubsub | natsDashHemeraLib.natsDashHemeraLibStrings.request
  type Schema = AnySchema | ArraySchema | AlternativesSchema | BinarySchema | BooleanSchema | DateSchema | FunctionSchema | NumberSchema | ObjectSchema | StringSchema
  type SchemaLike = java.lang.String | scala.Double | scala.Boolean | js.Object | scala.Null | Schema | SchemaMap
  type Types = natsDashHemeraLib.natsDashHemeraLibStrings.any | natsDashHemeraLib.natsDashHemeraLibStrings.alternatives | natsDashHemeraLib.natsDashHemeraLibStrings.array | natsDashHemeraLib.natsDashHemeraLibStrings.boolean | natsDashHemeraLib.natsDashHemeraLibStrings.binary | natsDashHemeraLib.natsDashHemeraLibStrings.date | natsDashHemeraLib.natsDashHemeraLibStrings.function | natsDashHemeraLib.natsDashHemeraLibStrings.`lazy` | natsDashHemeraLib.natsDashHemeraLibStrings.number | natsDashHemeraLib.natsDashHemeraLibStrings.`object` | natsDashHemeraLib.natsDashHemeraLibStrings.string
  type ValidationErrorFunction = js.Function1[
    /* errors */ js.Array[ValidationErrorItem], 
    java.lang.String | ValidationErrorItem | js.Array[ValidationErrorItem] | stdLib.Error
  ]
}
