package typings
package nookiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Set extends js.Object {
  def destroy(
    ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    name: java.lang.String
  ): scala.Unit = js.native
  def get(ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery]): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def get(
    ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    options: cookieLib.cookieMod.CookieParseOptions
  ): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def set(
    ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    name: java.lang.String,
    value: java.lang.String
  ): scala.Unit = js.native
  def set(
    ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    name: java.lang.String,
    value: java.lang.String,
    options: cookieLib.cookieMod.CookieSerializeOptions
  ): scala.Unit = js.native
}

