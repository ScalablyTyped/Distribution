package typings.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Packbuilder")
@js.native
class Packbuilder ()
  extends typings.nodegit.packBuilderMod.Packbuilder
/* static members */
object Packbuilder {
  
  @JSImport("nodegit", "Packbuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(repo: typings.nodegit.repositoryMod.Repository): typings.nodegit.packBuilderMod.Packbuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[typings.nodegit.packBuilderMod.Packbuilder]
}
