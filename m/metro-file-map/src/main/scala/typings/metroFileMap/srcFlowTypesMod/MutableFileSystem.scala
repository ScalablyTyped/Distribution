package typings.metroFileMap.srcFlowTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutableFileSystem
  extends StObject
     with FileSystem {
  
  def addOrModify(filePath: Path, fileMetadata: FileMetaData): Unit = js.native
  
  def bulkAddOrModify(addedOrModifiedFiles: FileData): Unit = js.native
  
  def remove(filePath: Path): Unit = js.native
}
