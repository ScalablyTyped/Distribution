package typings.pako.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def deflate(data: typings.pako.mod.Data): typings.std.Uint8Array = typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
/**
  * Compress data with deflate algorithm and options.
  */
inline def deflate(data: typings.pako.mod.Data, options: typings.pako.anon.DeflateFunctionOptionstos): java.lang.String = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def deflate(data: typings.pako.mod.Data, options: typings.pako.mod.DeflateFunctionOptions): typings.std.Uint8Array = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def deflateRaw(data: typings.pako.mod.Data): typings.std.Uint8Array = typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
/**
  * The same as deflate, but creates raw data, without wrapper (header and adler32 crc).
  */
inline def deflateRaw(data: typings.pako.mod.Data, options: typings.pako.anon.DeflateFunctionOptionstos): java.lang.String = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def deflateRaw(data: typings.pako.mod.Data, options: typings.pako.mod.DeflateFunctionOptions): typings.std.Uint8Array = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def gzip(data: typings.pako.mod.Data): typings.std.Uint8Array = typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
/**
  * The same as deflate, but create gzip wrapper instead of deflate one.
  */
inline def gzip(data: typings.pako.mod.Data, options: typings.pako.anon.DeflateFunctionOptionstos): java.lang.String = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def gzip(data: typings.pako.mod.Data, options: typings.pako.mod.DeflateFunctionOptions): typings.std.Uint8Array = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def inflate(data: typings.pako.mod.Data): typings.std.Uint8Array = typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
/**
  * Decompress data with inflate/ungzip and options. Autodetect format via wrapper header
  * by default. That's why we don't provide separate ungzip method.
  */
inline def inflate(data: typings.pako.mod.Data, options: typings.pako.anon.InflateFunctionOptionstos): java.lang.String = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def inflate(data: typings.pako.mod.Data, options: typings.pako.mod.InflateFunctionOptions): typings.std.Uint8Array = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def inflateRaw(data: typings.pako.mod.Data): typings.std.Uint8Array = typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
/**
  * The same as inflate, but creates raw data, without wrapper (header and adler32 crc).
  */
inline def inflateRaw(data: typings.pako.mod.Data, options: typings.pako.anon.InflateFunctionOptionstos): java.lang.String = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def inflateRaw(data: typings.pako.mod.Data, options: typings.pako.mod.InflateFunctionOptions): typings.std.Uint8Array = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

inline def ungzip(data: typings.pako.mod.Data): typings.std.Uint8Array = typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any]).asInstanceOf[typings.std.Uint8Array]
/**
  * Just shortcut to inflate, because it autodetects format by header.content. Done for convenience.
  */
inline def ungzip(data: typings.pako.mod.Data, options: typings.pako.anon.InflateFunctionOptionstos): java.lang.String = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def ungzip(data: typings.pako.mod.Data, options: typings.pako.mod.InflateFunctionOptions): typings.std.Uint8Array = (typings.pako.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ungzip")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Uint8Array]

type Data = typings.std.Uint8Array | js.Array[scala.Double] | java.lang.String
