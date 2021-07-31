package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Refdb")
@js.native
class Refdb ()
  extends typings.nodegit.refDbMod.Refdb
/* static members */
object Refdb {
  
  @JSImport("nodegit", "Refdb")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def open(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.refDbMod.Refdb] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodegit.refDbMod.Refdb]]
}
