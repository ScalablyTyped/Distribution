package typings.nightwatch.anon

import typings.nightwatch.mod.Awaitable
import typings.nightwatch.mod.Definition
import typings.nightwatch.mod.LocateStrategy
import typings.nightwatch.mod.NightwatchAPI
import typings.nightwatch.mod.NightwatchCallbackResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn2 extends StObject {
  
  def apply(selector: Definition): Awaitable[this.type, Boolean] = js.native
  def apply(
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
  def apply(`using`: LocateStrategy, selector: Definition): Awaitable[this.type, Boolean] = js.native
  def apply(
    `using`: LocateStrategy,
    selector: Definition,
    callback: js.ThisFunction1[/* this */ NightwatchAPI, /* result */ NightwatchCallbackResult[Boolean], Unit]
  ): Awaitable[this.type, Boolean] = js.native
}
