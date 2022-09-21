package typings.nodeHrx

import typings.node.streamMod.Readable
import typings.nodeHrx.anon.Col
import typings.nodeHrx.anon.Dictkey
import typings.nodeHrx.anon.Path
import typings.nodeHrx.nodeHrxStrings._empty
import typings.std.Error
import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-hrx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-hrx", "Archive")
  @js.native
  open class Archive () extends Directory {
    def this(contents: Record[String, HrxItem]) = this()
    def this(contents: Unit, comment: String) = this()
    def this(contents: Record[String, HrxItem], comment: String) = this()
    
    @JSName("path")
    val path_Archive: _empty = js.native
  }
  
  @JSImport("node-hrx", "Directory")
  @js.native
  open class Directory protected ()
    extends StObject
       with Iterable[String]
       with HrxItem {
    def this(path: String) = this()
    def this(path: String, contents: Record[String, HrxItem]) = this()
    def this(path: String, contents: Unit, comment: String) = this()
    def this(path: String, contents: Record[String, HrxItem], comment: String) = this()
    
    val comment: js.UndefOr[String] = js.native
    
    val contents: Record[String, HrxItem] = js.native
    
    def get(path: String): js.UndefOr[HrxItem] = js.native
    
    def isDirectory(): /* is node-hrx.node-hrx.Directory */ Boolean = js.native
    
    def isFile(): /* is node-hrx.node-hrx.File */ Boolean = js.native
    
    def list(): js.Array[String] = js.native
    
    val path: String = js.native
  }
  
  @JSImport("node-hrx", "File")
  @js.native
  open class File protected ()
    extends StObject
       with HrxItem {
    def this(path: String, body: String) = this()
    def this(path: String, body: String, comment: String) = this()
    
    val body: String = js.native
    
    val comment: js.UndefOr[String] = js.native
    
    def isDirectory(): /* is node-hrx.node-hrx.Directory */ Boolean = js.native
    
    def isFile(): /* is node-hrx.node-hrx.File */ Boolean = js.native
    
    val path: String = js.native
  }
  
  @JSImport("node-hrx", "LexicalProblem")
  @js.native
  open class LexicalProblem protected ()
    extends StObject
       with Error {
    def this(message: String, line: Double) = this()
    def this(message: String, line: Double, details: Dictkey) = this()
    
    val details: Path = js.native
    
    val line: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("node-hrx", "ParseProblem")
  @js.native
  open class ParseProblem protected ()
    extends StObject
       with Error {
    def this(message: String, position: Col) = this()
    def this(message: String, position: Col, details: Record[String, Any]) = this()
    
    val col: Double = js.native
    
    val line: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def archiveFromStream(stream: Readable): js.Promise[Archive] = ^.asInstanceOf[js.Dynamic].applyDynamic("archiveFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Archive]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeHrx.mod.File
    - typings.nodeHrx.mod.Directory
  */
  trait HrxItem extends StObject
}
