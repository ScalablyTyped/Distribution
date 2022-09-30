package typings.meteor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.meteor.Blaze.TemplateInstance
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.Pick
import typings.std.ReadableStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Callback = js.Function1[/* sink */ Sink, js.Promise[Any] | Any]

type Content = String | js.Array[Any] | ReadableStream[Any] | HTMLElement

type EJSON = EJSONable

type EJSONable = StringDictionary[EJSONableProperty]

type EJSONableProperty = js.UndefOr[
Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | js.Date | js.typedarray.Uint8Array | EJSONableCustomType | Null]

type Header = StringDictionary[String]

type JSONable = StringDictionary[
js.UndefOr[
  Double | String | Boolean | js.Object | (js.Array[Double | js.Object | String]) | Null
]]

/**
  * A helper type to make the access to data and template instance member type safe.
  * @example
  * const TemplateTyped = Template as TemplateStaticTyped<
  *     'newTemplate',
  *     { foo: string },
  *     {
  *         state: ReactiveDict<{ bar: number }>;
  *         getFooBar(): string;
  *     }
  * >;
  * TemplateTyped.newTemplate.onCreated(function () { ...
  * @template N Template name
  * @template D Data
  * @template T Template interface with custom properties and methods that extends the template instance
  */
type TemplateStaticTyped[N /* <: String */, D /* <: Any */, T /* <: Record[String, Any] */] = (TemplateStatic[D, T & TemplateInstance[D]]) & typings.meteor.meteorStrings.TemplateStaticTyped & TopLevel[Any]

type UnionOmit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type globalError = js.Error
