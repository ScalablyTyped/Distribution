package typings.pouchdbCore.anon

import typings.pouchdbCore.PouchDB.Core.RevisionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ids extends StObject {
  
  var ids: js.Array[RevisionId] = js.native
  
  var start: Double = js.native
}
object Ids {
  
  @scala.inline
  def apply(ids: js.Array[RevisionId], start: Double): Ids = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ids]
  }
  
  @scala.inline
  implicit class IdsMutableBuilder[Self <: Ids] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: js.Array[RevisionId]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: RevisionId*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
