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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    inline def destroy(ctx: Null, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: Null, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: Unit, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: Unit, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: PickNextPageContextres, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: PickNextPageContextres, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: ResResponse, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: ResResponse, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: Res, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy(ctx: Res, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def destroy_=(
      x: js.Function3[
          /* ctx */ js.UndefOr[PickNextPageContextres | Res | ResResponse | Null], 
          /* name */ String, 
          /* options */ js.UndefOr[CookieSerializeOptions], 
          js.Object
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroy")(x.asInstanceOf[js.Any])
    
    inline def get(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[StringDictionary[String]]
    inline def get(ctx: Null, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
    inline def get(ctx: Unit, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
    inline def get(ctx: PickNextPageContextreq): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(ctx.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
    inline def get(ctx: PickNextPageContextreq, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
    inline def get(ctx: Req): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(ctx.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
    inline def get(ctx: ReqRequest): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(ctx.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
    inline def get(ctx: ReqRequest, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
    inline def get(ctx: Req, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
    @JSImport("nookies", "default.get")
    @js.native
    def get_Fdefault: js.Function2[
        /* ctx */ js.UndefOr[PickNextPageContextreq | Req | ReqRequest | Null], 
        /* options */ js.UndefOr[CookieParseOptions], 
        StringDictionary[String]
      ] = js.native
    
    inline def get_Fdefault_=(
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
        /* options */ js.UndefOr[CookieSerializeOptions], 
        js.Object
      ] = js.native
    inline def set(ctx: Null, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: Null, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: Unit, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: Unit, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: PickNextPageContextres, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: PickNextPageContextres, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: ResResponse, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: ResResponse, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: Res, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set(ctx: Res, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def set_=(
      x: js.Function4[
          /* ctx */ js.UndefOr[PickNextPageContextres | Res | ResResponse | Null], 
          /* name */ String, 
          /* value */ String, 
          /* options */ js.UndefOr[CookieSerializeOptions], 
          js.Object
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
  }
  
  inline def destroyCookie(ctx: Null, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: Null, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: Unit, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: Unit, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: PickNextPageContextres, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: PickNextPageContextres, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: ResResponse, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: ResResponse, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: Res, name: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def destroyCookie(ctx: Res, name: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("destroyCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def parseCookies(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")().asInstanceOf[StringDictionary[String]]
  inline def parseCookies(ctx: Null, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  inline def parseCookies(ctx: Unit, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  inline def parseCookies(ctx: PickNextPageContextreq): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(ctx.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def parseCookies(ctx: PickNextPageContextreq, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  inline def parseCookies(ctx: Req): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(ctx.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def parseCookies(ctx: ReqRequest): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(ctx.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
  inline def parseCookies(ctx: ReqRequest, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  inline def parseCookies(ctx: Req, options: CookieParseOptions): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCookies")(ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
  
  inline def setCookie(ctx: Null, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: Null, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: Unit, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: Unit, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: PickNextPageContextres, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: PickNextPageContextres, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: ResResponse, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: ResResponse, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: Res, name: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def setCookie(ctx: Res, name: String, value: String, options: CookieSerializeOptions): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(ctx.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
