package typings
package nookiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nookies", JSImport.Namespace)
@js.native
object nookiesMod extends js.Object {
  val default: nookiesLib.Anon_Set = js.native
  def destroyCookie(
    ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    name: java.lang.String
  ): scala.Unit = js.native
  def parseCookies(ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def parseCookies(
    ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    options: cookieLib.cookieMod.CookieParseOptions
  ): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def setCookie(
    ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    name: java.lang.String,
    value: java.lang.String
  ): scala.Unit = js.native
  def setCookie(
    ctx: nextLib.nextMod.nextNs.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    name: java.lang.String,
    value: java.lang.String,
    options: cookieLib.cookieMod.CookieSerializeOptions
  ): scala.Unit = js.native
}

