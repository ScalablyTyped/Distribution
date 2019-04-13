package typings
package nookiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nookies", JSImport.Namespace)
@js.native
object nookiesMod extends js.Object {
  def destroyCookie(ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery], name: java.lang.String): scala.Unit = js.native
  def parseCookies(ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def parseCookies(
    ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    options: cookieLib.cookieMod.CookieParseOptions
  ): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def setCookie(
    ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    name: java.lang.String,
    value: java.lang.String
  ): scala.Unit = js.native
  def setCookie(
    ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery],
    name: java.lang.String,
    value: java.lang.String,
    options: cookieLib.cookieMod.CookieSerializeOptions
  ): scala.Unit = js.native
  @js.native
  object default extends js.Object {
    def destroy(ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery], name: java.lang.String): scala.Unit = js.native
    def get(ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery]): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    def get(
      ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery],
      options: cookieLib.cookieMod.CookieParseOptions
    ): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
    def set(
      ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery],
      name: java.lang.String,
      value: java.lang.String
    ): scala.Unit = js.native
    def set(
      ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery],
      name: java.lang.String,
      value: java.lang.String,
      options: cookieLib.cookieMod.CookieSerializeOptions
    ): scala.Unit = js.native
  }
  
}

