package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.anon.Readonlyrecursivebooleanf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSystem extends StObject {
  
  def exists(file: Path): Boolean = js.native
  
  def getAllFiles(): js.Array[Path] = js.native
  
  def getDependencies(file: Path): js.Array[String] | Null = js.native
  
  def getModuleName(file: Path): String | Null = js.native
  
  def getRealPath(file: Path): String | Null = js.native
  
  def getSerializableSnapshot(): FileData = js.native
  
  def getSha1(file: Path): String | Null = js.native
  
  /**
    * Analogous to posix lstat. If the file at `file` is a symlink, return
    * information about the symlink without following it.
    */
  def linkStats(file: Path): FileStats | Null = js.native
  
  def matchFiles(pattern: String): js.Array[Path] = js.native
  def matchFiles(pattern: js.RegExp): js.Array[Path] = js.native
  
  /**
    * Given a search context, return a list of file paths matching the query.
    * The query matches against normalized paths which start with `./`,
    * for example: `a/b.js` -> `./a/b.js`
    */
  def matchFilesWithContext(root: Path, context: Readonlyrecursivebooleanf): js.Array[Path] = js.native
}
