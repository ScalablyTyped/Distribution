package typings.papaparse.mod

import typings.node.NodeJS.ReadableStream
import typings.node.streamMod.Duplex
import typings.papaparse.anon.Download
import typings.papaparse.anon.Worker
import typings.papaparse.mod.^
import typings.papaparse.papaparseStrings.Informationseparatorone
import typings.papaparse.papaparseStrings.Informationseparatortwo
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BAD_DELIMITERS: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("BAD_DELIMITERS").asInstanceOf[js.Array[String]]

inline def DefaultDelimiter: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultDelimiter").asInstanceOf[String]
inline def DefaultDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultDelimiter")(x.asInstanceOf[js.Any])

inline def LocalChunkSize: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LocalChunkSize").asInstanceOf[Double]
inline def LocalChunkSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalChunkSize")(x.asInstanceOf[js.Any])

inline def NODE_STREAM_INPUT: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("NODE_STREAM_INPUT").asInstanceOf[js.Symbol]

inline def RECORD_SEP: Informationseparatortwo = ^.asInstanceOf[js.Dynamic].selectDynamic("RECORD_SEP").asInstanceOf[Informationseparatortwo]

inline def RemoteChunkSize: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("RemoteChunkSize").asInstanceOf[Double]
inline def RemoteChunkSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RemoteChunkSize")(x.asInstanceOf[js.Any])

inline def UNIT_SEP: Informationseparatorone = ^.asInstanceOf[js.Dynamic].selectDynamic("UNIT_SEP").asInstanceOf[Informationseparatorone]

inline def WORKERS_SUPPORTED: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("WORKERS_SUPPORTED").asInstanceOf[Boolean]

inline def parse(stream: js.Symbol): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any]).asInstanceOf[Duplex]
inline def parse(stream: js.Symbol, config: ParseConfig[Any, Unit]): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(stream.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Duplex]
inline def parse[T](csvString: String): ParseResult[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(csvString.asInstanceOf[js.Any]).asInstanceOf[ParseResult[T]]
inline def parse[T](csvString: String, config: ParseWorkerConfig[T] & Download & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(csvString.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse[T](file: ReadableStream, config: ParseLocalConfig[T, ReadableStream]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse[T](file: File, config: ParseLocalConfig[T, File]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse[T](source: String, config: (ParseConfig[T, Unit]) & Worker & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse[T](source: String, config: ParseRemoteConfig[T] & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse[T](source: LocalFile, config: ParseWorkerConfig[T] & Download & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse[T](source: LocalFile, config: ParseRemoteConfig[T] & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse[T](source: LocalFile, config: (ParseConfig[T, Unit]) & Worker & (ParseLocalConfig[T, LocalFile])): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def parse[T](url: String, config: ParseRemoteConfig[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def parse_T_ParseResult[T](csvString: String, config: (ParseConfig[T, Unit]) & Worker): ParseResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(csvString.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseResult[T]]

inline def unparse[T](data: js.Array[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
inline def unparse[T](data: js.Array[T], config: UnparseConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
inline def unparse[T](data: UnparseObject[T]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any]).asInstanceOf[String]
inline def unparse[T](data: UnparseObject[T], config: UnparseConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(data.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]

type LocalFile = File | ReadableStream
