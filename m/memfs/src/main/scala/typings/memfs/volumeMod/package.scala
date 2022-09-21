package typings.memfs.volumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.memfs.encodingMod.TDataOut
import typings.memfs.encodingMod.TEncodingExtended
import typings.memfs.volumeMod.^
import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bufferToEncoding(buffer: Buffer): TDataOut = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToEncoding")(buffer.asInstanceOf[js.Any]).asInstanceOf[TDataOut]
inline def bufferToEncoding(buffer: Buffer, encoding: TEncodingExtended): TDataOut = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToEncoding")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[TDataOut]

inline def dataToBuffer(data: TData): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("dataToBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
inline def dataToBuffer(data: TData, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("dataToBuffer")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]

inline def dataToStr(data: TData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dataToStr")(data.asInstanceOf[js.Any]).asInstanceOf[String]
inline def dataToStr(data: TData, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dataToStr")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]

inline def filenameToSteps(filename: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("filenameToSteps")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
inline def filenameToSteps(filename: String, base: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("filenameToSteps")(filename.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def flagsToNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("flagsToNumber")().asInstanceOf[Double]
inline def flagsToNumber(flags: TFlags): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("flagsToNumber")(flags.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def pathToFilename(path: PathLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToFilename")(path.asInstanceOf[js.Any]).asInstanceOf[String]

inline def pathToSteps(path: PathLike): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToSteps")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]

inline def toUnixTimestamp(time: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnixTimestamp")(time.asInstanceOf[js.Any]).asInstanceOf[Any]

type DirectoryContent = String | Null

type DirectoryJSON = StringDictionary[DirectoryContent]

type IAppendFileOptions = IFileOptions

type IWriteFileOptions = IFileOptions

type TCallback[TData] = js.Function2[/* error */ js.UndefOr[IError | Null], /* data */ js.UndefOr[TData], Unit]

type TData = TDataOut | js.typedarray.Uint8Array

type TFileId = PathLike | Double

type TFlags = String | Double

type TFlagsCopy = Double

type TMode = String | Double

type TTime = Double | String | js.Date
