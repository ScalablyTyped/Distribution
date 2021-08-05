package typings.memfs.volumeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def bufferToEncoding(buffer: typings.node.Buffer): typings.memfs.encodingMod.TDataOut = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("bufferToEncoding")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.memfs.encodingMod.TDataOut]
inline def bufferToEncoding(buffer: typings.node.Buffer, encoding: typings.memfs.encodingMod.TEncodingExtended): typings.memfs.encodingMod.TDataOut = (typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("bufferToEncoding")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typings.memfs.encodingMod.TDataOut]

inline def dataToBuffer(data: typings.memfs.volumeMod.TData): typings.node.Buffer = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("dataToBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
inline def dataToBuffer(data: typings.memfs.volumeMod.TData, encoding: java.lang.String): typings.node.Buffer = (typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("dataToBuffer")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[typings.node.Buffer]

inline def dataToStr(data: typings.memfs.volumeMod.TData): java.lang.String = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("dataToStr")(data.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def dataToStr(data: typings.memfs.volumeMod.TData, encoding: java.lang.String): java.lang.String = (typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("dataToStr")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def filenameToSteps(filename: java.lang.String): js.Array[java.lang.String] = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("filenameToSteps")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
inline def filenameToSteps(filename: java.lang.String, base: java.lang.String): js.Array[java.lang.String] = (typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("filenameToSteps")(filename.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]

inline def flagsToNumber(): scala.Double = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("flagsToNumber")().asInstanceOf[scala.Double]
inline def flagsToNumber(flags: typings.memfs.volumeMod.TFlags): scala.Double = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("flagsToNumber")(flags.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

inline def pathToFilename(path: typings.node.fsMod.PathLike): java.lang.String = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("pathToFilename")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def pathToSteps(path: typings.node.fsMod.PathLike): js.Array[java.lang.String] = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("pathToSteps")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]

inline def toUnixTimestamp(time: js.Any): js.Any = typings.memfs.volumeMod.^.asInstanceOf[js.Dynamic].applyDynamic("toUnixTimestamp")(time.asInstanceOf[js.Any]).asInstanceOf[js.Any]

type DirectoryContent = java.lang.String | scala.Null

type DirectoryJSON = org.scalablytyped.runtime.StringDictionary[typings.memfs.volumeMod.DirectoryContent]

type IAppendFileOptions = typings.memfs.volumeMod.IFileOptions

type IWriteFileOptions = typings.memfs.volumeMod.IFileOptions

type TCallback[TData] = js.Function2[
/* error */ js.UndefOr[typings.memfs.volumeMod.IError | scala.Null], 
/* data */ js.UndefOr[TData], 
scala.Unit]

type TData = typings.memfs.encodingMod.TDataOut | typings.std.Uint8Array

type TFileId = typings.node.fsMod.PathLike | scala.Double

type TFlags = java.lang.String | scala.Double

type TFlagsCopy = scala.Double

type TMode = java.lang.String | scala.Double

type TTime = scala.Double | java.lang.String | typings.std.Date
