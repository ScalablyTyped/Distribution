package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionDiff extends StObject {
  
  var missing: js.UndefOr[js.Array[String]] = js.native
  
  var possible_ancestors: js.UndefOr[js.Array[String]] = js.native
}
object RevisionDiff {
  
  @scala.inline
  def apply(): RevisionDiff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionDiff]
  }
  
  @scala.inline
  implicit class RevisionDiffMutableBuilder[Self <: RevisionDiff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMissing(value: js.Array[String]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    @scala.inline
    def setMissingVarargs(value: String*): Self = StObject.set(x, "missing", js.Array(value :_*))
    
    @scala.inline
    def setPossible_ancestors(value: js.Array[String]): Self = StObject.set(x, "possible_ancestors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossible_ancestorsUndefined: Self = StObject.set(x, "possible_ancestors", js.undefined)
    
    @scala.inline
    def setPossible_ancestorsVarargs(value: String*): Self = StObject.set(x, "possible_ancestors", js.Array(value :_*))
  }
}
