package typings.pProps

import org.scalablytyped.runtime.TopLevel
import typings.pMap.mod.Options
import typings.std.Map
import typings.std.ReadonlyMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[InputType /* <: Record[String, Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](map: InputType): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ typings.pProps.pPropsStrings.default & TopLevel[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ typings.pProps.pPropsStrings.default & TopLevel[Any]
  ]]
  inline def default[InputType /* <: Record[String, Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](map: InputType, mapper: Unit, options: Options): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ typings.pProps.pPropsStrings.default & TopLevel[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ typings.pProps.pPropsStrings.default & TopLevel[Any]
  ]]
  inline def default[InputType /* <: Record[String, Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](
    map: InputType,
    mapper: Mapper[PromiseResult[ValueType], /* keyof InputType */ String, MappedValueType]
  ): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ typings.pProps.pPropsStrings.default & TopLevel[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ typings.pProps.pPropsStrings.default & TopLevel[Any]
  ]]
  inline def default[InputType /* <: Record[String, Any] */, ValueType /* <: /* import warning: importer.ImportType#apply Failed type conversion: InputType[keyof InputType] */ js.Any */, MappedValueType](
    map: InputType,
    mapper: Mapper[PromiseResult[ValueType], /* keyof InputType */ String, MappedValueType],
    options: Options
  ): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ typings.pProps.pPropsStrings.default & TopLevel[Any]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof InputType ]: MappedValueType}
    */ typings.pProps.pPropsStrings.default & TopLevel[Any]
  ]]
  inline def default[KeyType, ValueType, MappedValueType](map: ReadonlyMap[KeyType, ValueType]): js.Promise[Map[KeyType, MappedValueType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[KeyType, MappedValueType]]]
  inline def default[KeyType, ValueType, MappedValueType](map: ReadonlyMap[KeyType, ValueType], mapper: Unit, options: Options): js.Promise[Map[KeyType, MappedValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[KeyType, MappedValueType]]]
  inline def default[KeyType, ValueType, MappedValueType](
    map: ReadonlyMap[KeyType, ValueType],
    mapper: Mapper[PromiseResult[ValueType], KeyType, MappedValueType]
  ): js.Promise[Map[KeyType, MappedValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[KeyType, MappedValueType]]]
  inline def default[KeyType, ValueType, MappedValueType](
    map: ReadonlyMap[KeyType, ValueType],
    mapper: Mapper[PromiseResult[ValueType], KeyType, MappedValueType],
    options: Options
  ): js.Promise[Map[KeyType, MappedValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(map.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[KeyType, MappedValueType]]]
  
  type Mapper[ValueType, KeyType, MappedValueType] = js.Function2[
    /* value */ ValueType, 
    /* key */ KeyType, 
    MappedValueType | js.Thenable[MappedValueType]
  ]
  
  type PromiseResult[Value] = Value
}
