package typings.nodegit.mod

import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Filter")
@js.native
open class Filter ()
  extends typings.nodegit.filterMod.Filter
/* static members */
object Filter {
  
  @JSImport("nodegit", "Filter")
  @js.native
  val ^ : js.Any = js.native
  
  inline def listContains(filters: Any, name: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listContains")(filters.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def listLength(fl: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("listLength")(fl.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def listNew(repo: typings.nodegit.repositoryMod.Repository, mode: Double, options: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("listNew")(repo.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def listStreamBlob(filters: Any, blob: typings.nodegit.blobMod.Blob, target: WriteStream): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listStreamBlob")(filters.asInstanceOf[js.Any], blob.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def listStreamData(filters: Any, data: typings.nodegit.bufMod.Buf, target: WriteStream): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listStreamData")(filters.asInstanceOf[js.Any], data.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def listStreamFile(filters: Any, repo: typings.nodegit.repositoryMod.Repository, path: String, target: WriteStream): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("listStreamFile")(filters.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def unregister(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
}
