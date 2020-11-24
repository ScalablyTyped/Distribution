package typings.memfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object volumeMod {
  
  type DirectoryContent = java.lang.String | scala.Null
  
  type DirectoryJSON = org.scalablytyped.runtime.StringDictionary[typings.memfs.volumeMod.DirectoryContent]
  
  type IAppendFileOptions = typings.memfs.volumeMod.IFileOptions
  
  type IWriteFileOptions = typings.memfs.volumeMod.IFileOptions
  
  type TCallback[TData] = js.Function2[
    /* error */ js.UndefOr[typings.memfs.volumeMod.IError | scala.Null], 
    /* data */ js.UndefOr[TData], 
    scala.Unit
  ]
  
  type TData = typings.memfs.encodingMod.TDataOut | typings.std.Uint8Array
  
  type TFileId = typings.node.fsMod.PathLike | scala.Double
  
  type TFlags = java.lang.String | scala.Double
  
  type TFlagsCopy = scala.Double
  
  type TMode = java.lang.String | scala.Double
  
  type TTime = scala.Double | java.lang.String | typings.std.Date
}
