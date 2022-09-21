package typings.pako.mod

import typings.pako.anon.InflateFunctionOptionstos
import typings.pako.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def deflate(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def deflate(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
/**
  * Compress data with deflate algorithm and options.
  */
inline def deflate(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def deflate(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def deflateRaw(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def deflateRaw(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
/**
  * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
  */
inline def deflateRaw(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def deflateRaw(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def gzip(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def gzip(data: String, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
/**
  * The same as deflate, but create gzip wrapper instead of deflate one.
  */
inline def gzip(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def gzip(data: Data, options: DeflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def inflate(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
/**
  * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
  * by default. That's why we don't provide separate ungzip method.
  */
inline def inflate(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def inflate(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def inflateRaw(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
/**
  * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
  */
inline def inflateRaw(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def inflateRaw(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def ungzip(data: Data): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
/**
  * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
  */
inline def ungzip(data: Data, options: InflateFunctionOptionstos): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
inline def ungzip(data: Data, options: InflateFunctionOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

type Data = js.typedarray.Uint8Array | js.typedarray.ArrayBuffer
