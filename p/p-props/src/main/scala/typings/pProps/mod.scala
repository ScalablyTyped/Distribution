package typings.pProps

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.pProps.pPropsStrings.^
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-props", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[InputType /* <: StringDictionary[js.Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](map: InputType): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ ^  with TopLevel[js.Any]
  ] = js.native
  def apply[InputType /* <: StringDictionary[js.Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](
    map: InputType,
    mapper: Mapper[PromiseResult[ValueType], /* keyof InputType */ String, MappedValueType]
  ): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ ^  with TopLevel[js.Any]
  ] = js.native
  def apply[InputType /* <: StringDictionary[js.Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](
    map: InputType,
    mapper: Mapper[PromiseResult[ValueType], /* keyof InputType */ String, MappedValueType],
    options: Options
  ): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ ^  with TopLevel[js.Any]
  ] = js.native
  /**
  Like [`Promise.all()`](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise/all) but for `Map` and `Object`.
  @param map - Resolves entry values that are promises. Other values are passed through.
  @param mapper - Receives the current value and key as parameters. Expected to return a `Promise` or value.
  @param options - See the [`p-map` options](https://github.com/sindresorhus/p-map#options).
  @returns A promise that is fulfilled when all promises in `map` and ones returned from `mapper` are fulfilled, or rejects if any of the promises reject. The fulfilled value is the same as `map`, but with a fulfilled version of each entry value, or the fulfilled value returned from `mapper`, if defined.
  @example
  ```
  import pProps = require('p-props');
  import got = require('got');
  (async () => {
  	const fetch = async url => {
  		const {body} = await got(url);
  		return body;
  	};
  	const sites = {
  		ava: fetch('ava.li'),
  		todomvc: fetch('todomvc.com'),
  		github: fetch('github.com'),
  		foo: 'bar'
  	};
  	console.log(await pProps(sites));
  	// {
  	// 	ava: '<!doctype …',
  	// 	todomvc: '<!doctype …',
  	// 	github: '<!doctype …',
  	// 	foo: 'bar'
  	// }
  })();
  ```
  */
  def apply[KeyType, ValueType, MappedValueType](map: Map[KeyType, ValueType]): js.Promise[Map[KeyType, MappedValueType]] = js.native
  def apply[KeyType, ValueType, MappedValueType](map: Map[KeyType, ValueType], mapper: Mapper[PromiseResult[ValueType], KeyType, MappedValueType]): js.Promise[Map[KeyType, MappedValueType]] = js.native
  def apply[KeyType, ValueType, MappedValueType](
    map: Map[KeyType, ValueType],
    mapper: Mapper[PromiseResult[ValueType], KeyType, MappedValueType],
    options: Options
  ): js.Promise[Map[KeyType, MappedValueType]] = js.native
  type Mapper[ValueType, KeyType, MappedValueType] = js.Function2[
    /* value */ ValueType, 
    /* key */ KeyType, 
    MappedValueType | js.Thenable[MappedValueType]
  ]
  type Options = typings.pMap.mod.Options
  type PromiseResult[Value] = Value
}

