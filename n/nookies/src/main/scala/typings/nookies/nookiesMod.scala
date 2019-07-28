package typings.nookies

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.cookieMod.CookieParseOptions
import typings.cookie.cookieMod.CookieSerializeOptions
import typings.next.nextMod.NextContext
import typings.nextDashServer.routerMod.DefaultQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nookies", JSImport.Namespace)
@js.native
object nookiesMod extends js.Object {
  def destroyCookie(ctx: NextContext[DefaultQuery, js.Object], name: String): Unit = js.native
  def parseCookies(ctx: NextContext[DefaultQuery, js.Object]): StringDictionary[String] = js.native
  def parseCookies(ctx: NextContext[DefaultQuery, js.Object], options: CookieParseOptions): StringDictionary[String] = js.native
  def setCookie(ctx: NextContext[DefaultQuery, js.Object], name: String, value: String): Unit = js.native
  def setCookie(
    ctx: NextContext[DefaultQuery, js.Object],
    name: String,
    value: String,
    options: CookieSerializeOptions
  ): Unit = js.native
  @js.native
  object default extends js.Object {
    def destroy(ctx: NextContext[DefaultQuery, js.Object], name: String): Unit = js.native
    def get(ctx: NextContext[DefaultQuery, js.Object]): StringDictionary[String] = js.native
    def get(ctx: NextContext[DefaultQuery, js.Object], options: CookieParseOptions): StringDictionary[String] = js.native
    def set(ctx: NextContext[DefaultQuery, js.Object], name: String, value: String): Unit = js.native
    def set(
      ctx: NextContext[DefaultQuery, js.Object],
      name: String,
      value: String,
      options: CookieSerializeOptions
    ): Unit = js.native
  }
  
}

