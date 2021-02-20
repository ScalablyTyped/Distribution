package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deletions extends StObject {
  
  var additions: Double = js.native
  
  var deletions: Double = js.native
  
  var total: Double = js.native
}
object Deletions {
  
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): Deletions = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deletions]
  }
  
  @scala.inline
  implicit class DeletionsMutableBuilder[Self <: Deletions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
