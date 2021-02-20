package typings.nookies

import org.scalablytyped.runtime.StringDictionary
import typings.cookie.mod.CookieParseOptions
import typings.cookie.mod.CookieSerializeOptions
import typings.nookies.anon.PickNextPageContextreq
import typings.nookies.anon.PickNextPageContextres
import typings.nookies.anon.Req
import typings.nookies.anon.ReqRequest
import typings.nookies.anon.Res
import typings.nookies.anon.ResResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("nookies", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("nookies", "default.destroy")
    @js.native
    def destroy: js.Function3[
        /* ctx */ js.UndefOr[PickNextPageContextres | Res | ResResponse | Null], 
        /* name */ String, 
        /* options */ js.UndefOr[CookieSerializeOptions], 
        js.Object
      ] = js.native
    @scala.inline
    def destroy_=(
      x: js.Function3[
          /* ctx */ js.UndefOr[PickNextPageContextres | Res | ResResponse | Null], 
          /* name */ String, 
          /* options */ js.UndefOr[CookieSerializeOptions], 
          js.Object
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroy")(x.asInstanceOf[js.Any])
    
    @JSImport("nookies", "default.get")
    @js.native
    def get: js.Function2[
        /* ctx */ js.UndefOr[PickNextPageContextreq | Req | ReqRequest | Null], 
        /* options */ js.UndefOr[CookieParseOptions], 
        StringDictionary[String]
      ] = js.native
    @scala.inline
    def get_=(
      x: js.Function2[
          /* ctx */ js.UndefOr[PickNextPageContextreq | Req | ReqRequest | Null], 
          /* options */ js.UndefOr[CookieParseOptions], 
          StringDictionary[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
    
    @JSImport("nookies", "default.set")
    @js.native
    def set: js.Function4[
        /* ctx */ js.UndefOr[PickNextPageContextres | Res | ResResponse | Null], 
        /* name */ String, 
        /* value */ String, 
        /* options */ CookieSerializeOptions, 
        js.Object
      ] = js.native
    @scala.inline
    def set_=(
      x: js.Function4[
          /* ctx */ js.UndefOr[PickNextPageContextres | Res | ResResponse | Null], 
          /* name */ String, 
          /* value */ String, 
          /* options */ CookieSerializeOptions, 
          js.Object
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: js.UndefOr[scala.Nothing], name: String): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: js.UndefOr[scala.Nothing], name: String, options: CookieSerializeOptions): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: Null, name: String): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: Null, name: String, options: CookieSerializeOptions): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: PickNextPageContextres, name: String): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: PickNextPageContextres, name: String, options: CookieSerializeOptions): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: ResResponse, name: String): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: ResResponse, name: String, options: CookieSerializeOptions): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: Res, name: String): js.Object = js.native
  @JSImport("nookies", "destroyCookie")
  @js.native
  def destroyCookie(ctx: Res, name: String, options: CookieSerializeOptions): js.Object = js.native
  
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(): StringDictionary[String] = js.native
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(ctx: js.UndefOr[scala.Nothing], options: CookieParseOptions): StringDictionary[String] = js.native
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(ctx: Null, options: CookieParseOptions): StringDictionary[String] = js.native
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(ctx: PickNextPageContextreq): StringDictionary[String] = js.native
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(ctx: PickNextPageContextreq, options: CookieParseOptions): StringDictionary[String] = js.native
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(ctx: Req): StringDictionary[String] = js.native
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(ctx: ReqRequest): StringDictionary[String] = js.native
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(ctx: ReqRequest, options: CookieParseOptions): StringDictionary[String] = js.native
  @JSImport("nookies", "parseCookies")
  @js.native
  def parseCookies(ctx: Req, options: CookieParseOptions): StringDictionary[String] = js.native
  
  @JSImport("nookies", "setCookie")
  @js.native
  def setCookie(ctx: js.UndefOr[scala.Nothing], name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  @JSImport("nookies", "setCookie")
  @js.native
  def setCookie(ctx: Null, name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  @JSImport("nookies", "setCookie")
  @js.native
  def setCookie(ctx: PickNextPageContextres, name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  @JSImport("nookies", "setCookie")
  @js.native
  def setCookie(ctx: ResResponse, name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
  @JSImport("nookies", "setCookie")
  @js.native
  def setCookie(ctx: Res, name: String, value: String, options: CookieSerializeOptions): js.Object = js.native
}
