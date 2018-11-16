package typings
package parsimmonLib.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ParsimmonNs {
  type FailureFunctionType[U] = js.Function2[/* index */ scala.Double, /* msg */ java.lang.String, Reply[U]]
  type ParseFunctionType[U] = js.Function2[/* stream */ StreamType, /* index */ scala.Double, Reply[U]]
  type Reply[T] = SuccessReply[T] | FailureReply
  type Result[T] = Success[T] | Failure
  type StreamType = java.lang.String
  type SuccessFunctionType[U] = js.Function2[/* index */ scala.Double, /* result */ U, Reply[U]]
  type TypedLanguage[TLanguageSpec] = parsimmonLib.parsimmonLibStrings.TypedLanguage with TLanguageSpec
  type TypedRule[TLanguageSpec] = parsimmonLib.parsimmonLibStrings.TypedRule with TLanguageSpec
}
