package typings.opentelemetryApi.mod

import typings.opentelemetryContextBase.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api", "Context")
@js.native
/**
  * Construct a new context which inherits values from an optional parent context.
  *
  * @param parentContext a context from which to inherit values
  */
class Context_ protected () extends Context
/* static members */
@JSImport("@opentelemetry/api", "Context")
@js.native
object Context_ extends js.Object {
  
  /** The root context is used as the default parent context when there is no active context */
  val ROOT_CONTEXT: typings.opentelemetryContextBase.contextMod.Context = js.native
  
  /**
    * This is another identifier to the root context which allows developers to easily search the
    * codebase for direct uses of context which need to be removed in later PRs.
    *
    * It's existence is temporary and it should be removed when all references are fixed.
    */
  val TODO: typings.opentelemetryContextBase.contextMod.Context = js.native
  
  /** Get a key to uniquely identify a context value */
  def createKey(description: String): js.Symbol = js.native
}
