package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  Type extends string | number | boolean | std.Date | std.RegExp | node.buffer.<global>.Buffer | std.Uint8Array | (args : ...any): any | {  _bsontype :string} ? [] : Type extends std.ReadonlyArray<infer ArrayType> ? [] | [number, ...mongodb.mongodb.NestedPaths<ArrayType>] : Type extends std.Map<string, any> ? [string] : Type extends object ? {[ Key in std.Extract<keyof Type, string> ]: Type[Key] extends Type? [Key] : Type extends Type[Key]? [Key] : Type[Key] extends std.ReadonlyArray<infer ArrayType>? Type extends ArrayType? [Key] : ArrayType extends Type? [Key] : [Key, ...mongodb.mongodb.NestedPaths<Type[Key]>] : [Key, ...mongodb.mongodb.NestedPaths<Type[Key]>] | [Key]}[std.Extract<keyof Type, string>] : []
  }}}
  */
@js.native
trait NestedPaths[Type] extends StObject
