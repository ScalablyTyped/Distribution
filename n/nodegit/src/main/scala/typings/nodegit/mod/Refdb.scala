package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Refdb")
@js.native
class Refdb ()
  extends typings.nodegit.refDbMod.Refdb
/* static members */
object Refdb {
  
  @JSImport("nodegit", "Refdb.open")
  @js.native
  def open(repo: typings.nodegit.repositoryMod.Repository): js.Promise[typings.nodegit.refDbMod.Refdb] = js.native
}
