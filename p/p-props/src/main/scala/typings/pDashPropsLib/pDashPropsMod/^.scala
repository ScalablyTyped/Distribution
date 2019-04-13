package typings
package pDashPropsLib.pDashPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-props", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[KeyType /* <: java.lang.String */, ValueType /* <: js.Any */, MappedValueType](
    input: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in KeyType ]: std.PromiseLike<ValueType> | ValueType}
    */ pDashPropsLib.pDashPropsLibStrings.default with js.Any
  ): js.Promise[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in KeyType ]: MappedValueType}
    */ pDashPropsLib.pDashPropsLibStrings.default with js.Any
  ] = js.native
  def default[KeyType /* <: java.lang.String */, ValueType /* <: js.Any */, MappedValueType](
    input: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in KeyType ]: std.PromiseLike<ValueType> | ValueType}
    */ pDashPropsLib.pDashPropsLibStrings.default with js.Any,
    mapper: Mapper[ValueType, KeyType, MappedValueType]
  ): js.Promise[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in KeyType ]: MappedValueType}
    */ pDashPropsLib.pDashPropsLibStrings.default with js.Any
  ] = js.native
  def default[KeyType /* <: java.lang.String */, ValueType /* <: js.Any */, MappedValueType](
    input: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in KeyType ]: std.PromiseLike<ValueType> | ValueType}
    */ pDashPropsLib.pDashPropsLibStrings.default with js.Any,
    mapper: Mapper[ValueType, KeyType, MappedValueType],
    options: pDashMapLib.pDashMapMod.Options
  ): js.Promise[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in KeyType ]: MappedValueType}
    */ pDashPropsLib.pDashPropsLibStrings.default with js.Any
  ] = js.native
  def default[KeyType /* <: js.Any */, ValueType /* <: js.Any */, MappedValueType](input: stdLib.Map[KeyType, js.Thenable[ValueType] | ValueType]): js.Promise[stdLib.Map[KeyType, MappedValueType]] = js.native
  def default[KeyType /* <: js.Any */, ValueType /* <: js.Any */, MappedValueType](
    input: stdLib.Map[KeyType, js.Thenable[ValueType] | ValueType],
    mapper: Mapper[ValueType, KeyType, MappedValueType]
  ): js.Promise[stdLib.Map[KeyType, MappedValueType]] = js.native
  def default[KeyType /* <: js.Any */, ValueType /* <: js.Any */, MappedValueType](
    input: stdLib.Map[KeyType, js.Thenable[ValueType] | ValueType],
    mapper: Mapper[ValueType, KeyType, MappedValueType],
    options: pDashMapLib.pDashMapMod.Options
  ): js.Promise[stdLib.Map[KeyType, MappedValueType]] = js.native
}

