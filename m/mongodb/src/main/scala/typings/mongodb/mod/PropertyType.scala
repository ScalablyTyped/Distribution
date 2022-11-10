package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately.
  * TS definition: {{{
  string extends Property ? unknown : Property extends keyof Type ? Type[Property] : Property extends / * template literal string: ${number} * / string ? Type extends std.ReadonlyArray<infer ArrayType> ? ArrayType : unknown : Property extends / * template literal string: ${inferKey}.${inferRest} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key * / any extends / * template literal string: ${number} * / string ? Type extends std.ReadonlyArray<infer ArrayType> ? mongodb.mongodb.PropertyType<ArrayType, / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : unknown : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key * / any extends keyof Type ? Type[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key * / any] extends std.Map<string, infer MapType> ? MapType : mongodb.mongodb.PropertyType<Type[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key * / any], / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rest * / any> : unknown : unknown
  }}}
  */
@js.native
trait PropertyType[Type, Property /* <: String */] extends StObject
