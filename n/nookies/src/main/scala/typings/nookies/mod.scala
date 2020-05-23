package typings.nookies

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieParseOptions
import typings.cookie.mod.CookieSerializeOptions
import typings.nookies.anon.PickNextPageContextreq
import typings.nookies.anon.PickNextPageContextres
import typings.nookies.anon.Req
import typings.nookies.anon.Res
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nookies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def destroyCookie(ctx: js.UndefOr[Null | PickNextPageContextres | Res], name: String): js.Object = js.native
  def destroyCookie(
    ctx: js.UndefOr[Null | PickNextPageContextres | Res],
    name: String,
    options: CookieSerializeOptions
  ): js.Object = js.native
  def parseCookies(): StringDictionary[String] = js.native
  def parseCookies(ctx: Null, options: CookieParseOptions): StringDictionary[String] = js.native
  def parseCookies(ctx: PickNextPageContextreq): StringDictionary[String] = js.native
  def parseCookies(ctx: PickNextPageContextreq, options: CookieParseOptions): StringDictionary[String] = js.native
  def parseCookies(ctx: Req): StringDictionary[String] = js.native
  def parseCookies(ctx: Req, options: CookieParseOptions): StringDictionary[String] = js.native
  def setCookie(
    ctx: js.UndefOr[Null | PickNextPageContextres | Res],
    name: String,
    value: String,
    options: CookieSerializeOptions
  ): js.Object = js.native
  @js.native
  object default extends js.Object {
    var destroy: js.Function3[
        /* ctx */ js.UndefOr[PickNextPageContextres | Res | Null], 
        /* name */ String, 
        /* options */ js.UndefOr[CookieSerializeOptions], 
        js.Object
      ] = js.native
    var get: js.Function2[
        /* ctx */ js.UndefOr[PickNextPageContextreq | Req | Null], 
        /* options */ js.UndefOr[CookieParseOptions], 
        StringDictionary[String]
      ] = js.native
    var set: js.Function4[
        /* ctx */ js.UndefOr[PickNextPageContextres | Res | Null], 
        /* name */ String, 
        /* value */ String, 
        /* options */ CookieSerializeOptions, 
        js.Object
      ] = js.native
  }
  
}

