package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  TSchema extends {  _id :infer IdType} ? std.Record<any, never> extends IdType ? never : IdType : TSchema extends {  _id :infer IdType | undefined} ? unknown extends IdType ? bson.bson.ObjectId : IdType : bson.bson.ObjectId
  }}}
  */
@js.native
trait InferIdType[TSchema] extends StObject
