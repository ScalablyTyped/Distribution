package typings.nodePgMigrate.anon

import typings.nodePgMigrate.sequencesTypesMod.RenameSequenceFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameSequenceFn extends StObject {
  
  def reverse(
    oldSequenceName: typings.nodePgMigrate.generalTypesMod.Name,
    newSequenceName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameSequenceFn = js.native
}
