package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revparse")
@js.native
class Revparse ()
  extends typings.nodegit.revParseMod.Revparse
/* static members */
object Revparse {
  
  @JSImport("nodegit", "Revparse.ext")
  @js.native
  def ext(
    objectOut: typings.nodegit.objectMod.Object,
    referenceOut: typings.nodegit.referenceMod.Reference,
    repo: typings.nodegit.repositoryMod.Repository,
    spec: String
  ): Double = js.native
  
  @JSImport("nodegit", "Revparse.single")
  @js.native
  def single(repo: typings.nodegit.repositoryMod.Repository, spec: String): js.Promise[typings.nodegit.objectMod.Object] = js.native
}
