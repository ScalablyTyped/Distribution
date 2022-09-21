package typings.nightwatch.anon

import typings.nightwatch.mod.Awaitable
import typings.nightwatch.mod.Definition
import typings.nightwatch.mod.JSON_WEB_OBJECT
import typings.nightwatch.mod.LocateStrategy
import typings.nightwatch.mod.NightwatchAPI
import typings.nightwatch.mod.NightwatchCallbackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallUsingSelectorCallback extends StObject {
  
  def apply(selector: Definition): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  def apply(
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[JSON_WEB_OBJECT]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  def apply(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
  def apply(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[
      /* this */ NightwatchAPI, 
      /* result */ NightwatchCallbackResult[js.Array[JSON_WEB_OBJECT]], 
      Unit
    ]
  ): Awaitable[this.type, js.Array[JSON_WEB_OBJECT]] = js.native
}
