package typings.pProps

import typings.pMap.mod.Options
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[InputType /* <: Record[String, Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](map: InputType): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof InputType ]: MappedValueType} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof InputType ]: MappedValueType} */ js.Any
  ]]
  inline def default[InputType /* <: Record[String, Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](map: InputType, mapper: Unit, options: Options): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof InputType ]: MappedValueType} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof InputType ]: MappedValueType} */ js.Any
  ]]
  inline def default[InputType /* <: Record[String, Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](
    map: InputType,
    mapper: Mapper[PromiseResult[ValueType], /* keyof InputType */ String, MappedValueType]
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof InputType ]: MappedValueType} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof InputType ]: MappedValueType} */ js.Any
  ]]
  inline def default[InputType /* <: Record[String, Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](
    map: InputType,
    mapper: Mapper[PromiseResult[ValueType], /* keyof InputType */ String, MappedValueType],
    options: Options
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof InputType ]: MappedValueType} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof InputType ]: MappedValueType} */ js.Any
  ]]
  
  type Mapper[ValueType, KeyType, MappedValueType] = js.Function2[
    /* value */ ValueType, 
    /* key */ KeyType, 
    MappedValueType | PromiseLike[MappedValueType]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Value extends std.PromiseLike<infer Result> ? Result : Value
    }}}
    */
  @js.native
  trait PromiseResult[Value] extends StObject
}
