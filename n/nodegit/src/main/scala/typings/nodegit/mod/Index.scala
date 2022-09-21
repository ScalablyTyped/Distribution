package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Index")
@js.native
open class Index ()
  extends typings.nodegit.indexMod.Index
/* static members */
object Index {
  
  @JSImport("nodegit", "Index")
  @js.native
  val ^ : js.Any = js.native
  
  inline def entryIsConflict(entry: typings.nodegit.indexEntryMod.IndexEntry): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("entryIsConflict")(entry.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def entryStage(entry: typings.nodegit.indexEntryMod.IndexEntry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("entryStage")(entry.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def open(indexPath: String): js.Promise[typings.nodegit.indexMod.Index] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(indexPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.indexMod.Index]]
}
