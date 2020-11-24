package typings.memFsEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  //#endregion
  //#region Editor#commit
  type CommitCallback = js.Function1[/* err */ js.Any, scala.Unit]
  
  type FilePaths = java.lang.String | js.Array[java.lang.String]
  
  type ProcessingFunction = js.Function2[
    /* contents */ typings.node.Buffer, 
    /* path */ java.lang.String, 
    typings.memFsEditor.mod.WriteContents
  ]
  
  type ReadRawContents = typings.std.Exclude[typings.node.Buffer | typings.node.NodeJS.ReadableStream | scala.Null, scala.Null]
  
  //#endregion
  //#region Editor#write
  type WriteContents = java.lang.String | typings.node.Buffer
  
  //#endregion
  //#region Editor#writeJSON
  type WriteJsonReplacer = (js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]) | (js.Array[java.lang.String | scala.Double])
  
  type WriteJsonSpace = scala.Double | java.lang.String
}
