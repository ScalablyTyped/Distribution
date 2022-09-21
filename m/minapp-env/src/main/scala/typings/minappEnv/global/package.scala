package typings.minappEnv.global

import typings.minappEnv.App.AppConstructor
import typings.minappEnv.App.GetApp
import typings.minappEnv.Console
import typings.minappEnv.GeneratorFunctionConstructor
import typings.minappEnv.MapConstructor
import typings.minappEnv.Page.GetCurrentPages
import typings.minappEnv.Page.PageConstructor
import typings.minappEnv.PromiseConstructor
import typings.minappEnv.ProxyConstructor
import typings.minappEnv.SetConstructor
import typings.minappEnv.SymbolConstructor
import typings.minappEnv.WeakMapConstructor
import typings.minappEnv.WeakSetConstructor
import typings.minappEnv.wx.Wx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def App: AppConstructor = js.Dynamic.global.selectDynamic("App").asInstanceOf[AppConstructor]

inline def GeneratorFunction_=(x: GeneratorFunctionConstructor): Unit = js.Dynamic.global.updateDynamic("GeneratorFunction")(x.asInstanceOf[js.Any])

inline def Infinity: Double = js.Dynamic.global.selectDynamic("Infinity").asInstanceOf[Double]

/**
  * An intrinsic object that provides functions to convert JavaScript values to and from the JavaScript Object Notation (JSON) format.
  */
inline def JSON: typings.minappEnv.JSON = js.Dynamic.global.selectDynamic("JSON").asInstanceOf[typings.minappEnv.JSON]

inline def Map_=(x: MapConstructor): Unit = js.Dynamic.global.updateDynamic("Map")(x.asInstanceOf[js.Any])

/** An intrinsic object that provides basic mathematics functionality and constants. */
inline def Math: typings.minappEnv.Math = js.Dynamic.global.selectDynamic("Math").asInstanceOf[typings.minappEnv.Math]

/////////////////////////////
/// ECMAScript APIs
/////////////////////////////
inline def NaN: Double = js.Dynamic.global.selectDynamic("NaN").asInstanceOf[Double]

inline def Page: PageConstructor = js.Dynamic.global.selectDynamic("Page").asInstanceOf[PageConstructor]

inline def Promise_=(x: PromiseConstructor): Unit = js.Dynamic.global.updateDynamic("Promise")(x.asInstanceOf[js.Any])

inline def Proxy: ProxyConstructor = js.Dynamic.global.selectDynamic("Proxy").asInstanceOf[ProxyConstructor]
inline def Proxy_=(x: ProxyConstructor): Unit = js.Dynamic.global.updateDynamic("Proxy")(x.asInstanceOf[js.Any])

inline def Set_=(x: SetConstructor): Unit = js.Dynamic.global.updateDynamic("Set")(x.asInstanceOf[js.Any])

inline def Symbol: SymbolConstructor = js.Dynamic.global.selectDynamic("Symbol").asInstanceOf[SymbolConstructor]

inline def WeakMap_=(x: WeakMapConstructor): Unit = js.Dynamic.global.updateDynamic("WeakMap")(x.asInstanceOf[js.Any])

inline def WeakSet_=(x: WeakSetConstructor): Unit = js.Dynamic.global.updateDynamic("WeakSet")(x.asInstanceOf[js.Any])

inline def atob(encodedString: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("atob")(encodedString.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def btoa(rawString: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("btoa")(rawString.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/*! *****************************************************************************
Modifications Copyright (c) 2018 Tencent, Inc. All rights reserved. 
***************************************************************************** */
/////////////////////////////
/// WA-Additional-APIs
/////////////////////////////
inline def clearInterval(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def clearTimeout(handle: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def console: Console = js.Dynamic.global.selectDynamic("console").asInstanceOf[Console]
inline def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])

/**
  * Gets the unencoded version of an encoded Uniform Resource Identifier (URI).
  * @param encodedURI A value representing an encoded URI.
  */
inline def decodeURI(encodedURI: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("decodeURI")(encodedURI.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Gets the unencoded version of an encoded component of a Uniform Resource Identifier (URI).
  * @param encodedURIComponent A value representing an encoded URI component.
  */
inline def decodeURIComponent(encodedURIComponent: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("decodeURIComponent")(encodedURIComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Encodes a text string as a valid Uniform Resource Identifier (URI)
  * @param uri A value representing an encoded URI.
  */
inline def encodeURI(uri: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("encodeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Encodes a text string as a valid component of a Uniform Resource Identifier (URI).
  * @param uriComponent A value representing an encoded URI component.
  */
inline def encodeURIComponent(uriComponent: java.lang.String): java.lang.String = js.Dynamic.global.applyDynamic("encodeURIComponent")(uriComponent.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getApp: GetApp = js.Dynamic.global.selectDynamic("getApp").asInstanceOf[GetApp]

inline def getCurrentPages: GetCurrentPages = js.Dynamic.global.selectDynamic("getCurrentPages").asInstanceOf[GetCurrentPages]

/**
  * Determines whether a supplied number is finite.
  * @param number Any numeric value.
  */
inline def isFinite(number: Double): scala.Boolean = js.Dynamic.global.applyDynamic("isFinite")(number.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a number).
  * @param number A numeric value.
  */
inline def isNaN(number: Double): scala.Boolean = js.Dynamic.global.applyDynamic("isNaN")(number.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Converts a string to a floating-point number.
  * @param string A string that contains a floating-point number.
  */
inline def parseFloat(string: java.lang.String): Double = js.Dynamic.global.applyDynamic("parseFloat")(string.asInstanceOf[js.Any]).asInstanceOf[Double]

/*! *****************************************************************************
Modifications Copyright (c) 2018 Tencent, Inc. All rights reserved. 
***************************************************************************** */
/**
  * Evaluates JavaScript code and executes it.
  * @ param x A String value that contains valid JavaScript code.
  */
// WA-no-eval
// declare function eval(x: string): any;
/**
  * Converts A string to an integer.
  * @param s A string to convert into a number.
  * @param radix A value between 2 and 36 that specifies the base of the number in numString.
  * If this argument is not supplied, strings with a prefix of '0x' are considered hexadecimal.
  * All other strings are considered decimal.
  */
inline def parseInt(s: java.lang.String): Double = js.Dynamic.global.applyDynamic("parseInt")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def parseInt(s: java.lang.String, radix: Double): Double = (js.Dynamic.global.applyDynamic("parseInt")(s.asInstanceOf[js.Any], radix.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def setInterval(handler: js.Function1[/* repeated */ Any, Unit], timeout: Double): Double = (js.Dynamic.global.applyDynamic("setInterval")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def setInterval(handler: Any, timeout: Any, args: Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")((List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
inline def setInterval(handler: Any, timeout: Unit, args: Any*): Double = (js.Dynamic.global.applyDynamic("setInterval")((List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]

inline def setTimeout(handler: js.Function1[/* repeated */ Any, Unit], timeout: Double): Double = (js.Dynamic.global.applyDynamic("setTimeout")(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def setTimeout(handler: Any, timeout: Any, args: Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")((List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]
inline def setTimeout(handler: Any, timeout: Unit, args: Any*): Double = (js.Dynamic.global.applyDynamic("setTimeout")((List(handler.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Double]

inline def wx: Wx = js.Dynamic.global.selectDynamic("wx").asInstanceOf[Wx]
