package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutOptions extends Options {
  
  var force: js.UndefOr[Boolean] = js.native
}
object PutOptions {
  
  @scala.inline
  def apply(): PutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutOptions]
  }
  
  @scala.inline
  implicit class PutOptionsMutableBuilder[Self <: PutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
