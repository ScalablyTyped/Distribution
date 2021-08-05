package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revwalk")
@js.native
class Revwalk ()
  extends typings.nodegit.revWalkMod.Revwalk
/* static members */
object Revwalk {
  
  @JSImport("nodegit", "Revwalk")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(repo: typings.nodegit.repositoryMod.Repository): typings.nodegit.revWalkMod.Revwalk = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[typings.nodegit.revWalkMod.Revwalk]
}
