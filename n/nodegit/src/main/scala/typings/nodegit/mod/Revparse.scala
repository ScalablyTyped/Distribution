package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revparse")
@js.native
class Revparse ()
  extends typings.nodegit.revParseMod.Revparse
/* static members */
object Revparse {
  
  @JSImport("nodegit", "Revparse")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ext(
    objectOut: typings.nodegit.objectMod.Object,
    referenceOut: typings.nodegit.referenceMod.Reference,
    repo: typings.nodegit.repositoryMod.Repository,
    spec: String
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ext")(objectOut.asInstanceOf[js.Any], referenceOut.asInstanceOf[js.Any], repo.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def single(repo: typings.nodegit.repositoryMod.Repository, spec: String): js.Promise[typings.nodegit.objectMod.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("single")(repo.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodegit.objectMod.Object]]
}
